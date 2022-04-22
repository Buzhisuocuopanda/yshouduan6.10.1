package com.authine.cloudpivot.ext.model.dto;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Skudto{
    private String id;

    private String swGoodsId;

    private String skuCode;

    private String skuPic;

    private Integer skuNum;

    private BigDecimal skuPrice;
}
