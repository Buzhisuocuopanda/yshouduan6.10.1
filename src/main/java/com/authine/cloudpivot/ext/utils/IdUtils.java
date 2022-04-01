package com.authine.cloudpivot.ext.utils;


import com.authine.cloudpivot.ext.exception.SwException;

public class IdUtils {

    public IdUtils() {
        throw new SwException("工具类不允许实例化");
    }

//    public static final IdWorker idWorker = new IdWorker(1, 1);
    public static final IdWorkerUtil idWorker = new IdWorkerUtil(1);
    public static String getId() {
        return idWorker.nextId()+"";
    }

}
