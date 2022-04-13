package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

@Data
public class SwStoreListselectVo {
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

    //开始时间
    private String createtime;

    //结束时间
    private String updatetime;

}
