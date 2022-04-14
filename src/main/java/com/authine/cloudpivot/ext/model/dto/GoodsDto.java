package com.authine.cloudpivot.ext.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
public class GoodsDto {
    private String goodsName;

    private String goodsCode;

    private Date createTime;

    private Byte isEnabled;

}
