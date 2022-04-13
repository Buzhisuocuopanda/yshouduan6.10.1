package com.authine.cloudpivot.ext.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SwStoreListVo {

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

    //ID
    private String meetingId;
}
