package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import java.util.Date;
@Data
public class SwGoodsDo {
    private String creater;

    private Date createTime;

    private String updater;

    private Byte deleted;

    private String ysResult;

/*
    private String tranNo;
*/

   // private String bizObjectId;

    //private String workflowInstance;

    private Byte endCommit;

    private String goodsName;

    private String goodsCode;

    private String goodsDetail;

    private String goodsHeadPic;

    private String swStoreId;

    private String goodsCompany;

    private String swStoreName;

    private Integer goodsTotalNum;

}
