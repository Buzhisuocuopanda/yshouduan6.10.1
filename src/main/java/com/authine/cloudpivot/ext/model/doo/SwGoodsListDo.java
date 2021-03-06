package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SwGoodsListDo {
    private String id;

    private String swGoodsId;

    private String skuCode;

    private String skuPic;

    private Integer skuNum;

    private BigDecimal skuPrice;

}
