package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import java.util.Date;

@Data
public class SwGoodsListDo {
    private String id;

    private String goodsName;

    private String goodsCode;

    private String localStore;

    private String goodsCompany;

    private Integer goodsNum;

    private Date createTime;

    private String creater;
}
