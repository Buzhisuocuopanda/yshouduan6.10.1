package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

@Data
public class SwStoreListUpdateVo {

    //ID
    private String id;
    //仓库名称
    private String storename;


    //仓库地址
    private String storeaddress;


    //仓库图片
    private String storepic;


    //货物种类总量
    private Integer storegoodsnum;


    //货物库存总量
    private Integer storegoodsskunum;


    //仓库主管
    private String storeadmin;

    private String joinUser;
}
