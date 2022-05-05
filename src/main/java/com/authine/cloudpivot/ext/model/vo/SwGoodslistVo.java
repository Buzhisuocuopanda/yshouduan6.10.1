package com.authine.cloudpivot.ext.model.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
@Data
@EqualsAndHashCode(callSuper = false)
public class SwGoodslistVo {
    private String id;
    @ApiModelProperty("货物名")
    private String goodsName;
    @ApiModelProperty("货物编码")
    private String goodsCode;

    private String localStore;

    private String goodsCompany;

    private String    isEnabled ;


    private Integer goodsNum;

    private Date createTime;

    private String creater;

    private String keyword;

    private Date startTime;

    private Date endTime;



}
