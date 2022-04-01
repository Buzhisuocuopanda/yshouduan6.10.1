package com.authine.cloudpivot.ext.utils;



import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

@Slf4j
public class IpUtils {

    /**
     * 本机 IP 列表
     *
     * @return 本机 IP 列表
     */
    public static List<String> getLocalIpList() throws SocketException {
        List<String> ipList = new ArrayList<>();
        try {
            Enumeration<NetworkInterface> networkInterfaceEnumeration = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaceEnumeration.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaceEnumeration.nextElement();
                // 过滤掉 127.0.0.1 本地回环地址 和 无效网口
                if (networkInterface.isLoopback() || !networkInterface.isUp()) {
                    continue;
                }

                // 获取网口关联的 IP 信息
                Enumeration<InetAddress> inetAddresses = networkInterface.getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    String ip = inetAddresses.nextElement().getHostAddress();
                    // 排除回环 IP/ipv6 地址
                    if (ip.contains(":")) {
                        continue;
                    }
                    if (StringUtils.isNotBlank(ip)) {
                        ipList.add(ip);
                    }
                }
            }
        } catch (SocketException e) {
            log.error("【获取有效 IP 地址】- 出错了：${}$", ExceptionUtils.getStackTrace(e));
            throw e;
        }
        return ipList;
    }

    /**
     * 获取合理内网 IP
     *
     * @return 合理的内网 IP
     */
    public static String getLocalRationalIp() throws SocketException {
        List<String> ipList = getLocalIpList();
        for (String ip : ipList) {
            if (isRationalIp(ip)) {
                return ip;
            }
        }
        throw new RuntimeException("未找到合理的内网 IP");
    }

    private static final String PRIVAT_IP_10 = "10.";
    private static final String PRIVAT_IP_192168 = "192.168.";
    private static final Integer PRIVAT_IP_17216 = 17216;
    private static final Integer PRIVAT_IP_17231 = 17231;

    /**
     * 判断是否为内网IP
     *  tcp/ip协议中, 专门保留了三个IP地址区域作为私有地址, 其地址范围如下:
     *      10.0.0.0/8: 10.0.0.0～10.255.255.255
     *      172.16.0.0/12: 172.16.0.0～172.31.255.255
     *      192.168.0.0/16: 192.168.0.0～192.168.255.255
     *
     * @param ip 合理 IP
     * @return
     */
    public static boolean isRationalIp(String ip) {
        if (ip.startsWith(PRIVAT_IP_10) || ip.startsWith(PRIVAT_IP_192168)) {
            return true;
        }
        // 172.16.x.x ～ 172.31.x.x
        String[] ns = ip.split("\\.");
        int ipSub = Integer.valueOf(ns[0] + ns[1]);
        if (ipSub >= PRIVAT_IP_17216 && ipSub <= PRIVAT_IP_17231) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) throws SocketException {
        System.err.println(getLocalRationalIp());
    }

}
