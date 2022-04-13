package com.authine.cloudpivot.ext.model.dto;

import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import lombok.Data;

@Data
public class SwStoreListUpdateDto  extends BaseSwQueryModel {

    //ID
    private String userId;


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

}
