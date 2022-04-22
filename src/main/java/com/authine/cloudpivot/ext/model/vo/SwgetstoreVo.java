package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

import java.util.Date;
@Data
public class SwgetstoreVo {

    private String id;

    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private Byte deleted;

    private String ysResult;

    private String tranNo;

    private String bizObjectId;

    private String workflowInstance;

    private Byte endCommit;

    private String storeName;

    private String storeAddress;

    private String storePic;

    private Byte isEnabled;

    private Integer storeGoodsNum;

    private Integer storeGoodsSkuNum;

    private String storeAdmin;

    private String sequeceNo;

}
