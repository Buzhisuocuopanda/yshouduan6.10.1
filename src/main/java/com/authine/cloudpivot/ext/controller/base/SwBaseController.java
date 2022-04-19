package com.authine.cloudpivot.ext.controller.base;

import com.alibaba.fastjson.JSON;
import com.authine.cloudpivot.engine.api.model.system.AdminModel;
import com.authine.cloudpivot.web.api.controller.base.BaseController;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/**
 * ClassName SwBaseController
 * Description
 * Create by gfy
 * Date 2022/2/22 10:30
 */
@Slf4j
public class SwBaseController extends BaseController {


    public String getUserName(){
        String userId = this.getUserId();
        if(StringUtils.isBlank(userId)){
            return null;
        }

        AdminModel dataManaerByUserId = this.getDataManaerByUserId(userId);
        if(dataManaerByUserId==null){
            return null;
        }

        return dataManaerByUserId.getUserId();
    }
//    public String dedupParamMD5(final String reqJSON, String... excludeKeys) {
//        String decreptParam = reqJSON;
//
//        TreeMap paramTreeMap = JSON.parseObject(decreptParam, TreeMap.class);
//        if (excludeKeys!=null) {
//            List<String> dedupExcludeKeys = Arrays.asList(excludeKeys);
//            if (!dedupExcludeKeys.isEmpty()) {
//                for (String dedupExcludeKey : dedupExcludeKeys) {
//                    paramTreeMap.remove(dedupExcludeKey);
//                }
//            }
//        }
//
//        String paramTreeMapJSON = JSON.toJSONString(paramTreeMap);
//        String md5deDupParam = jdkMD5(paramTreeMapJSON);
//        log.debug("md5deDupParam = {}, excludeKeys = {} {}", md5deDupParam, Arrays.deepToString(excludeKeys), paramTreeMapJSON);
//        return md5deDupParam;
//    }
//
//    private static String jdkMD5(String src) {
//        String res = null;
//        try {
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            byte[] mdBytes = messageDigest.digest(src.getBytes());
//            res = DatatypeConverter.printHexBinary(mdBytes);
//        } catch (Exception e) {
//            log.error("",e);
//        }
//        return res;
//    }
//


}
