package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class SwGoodsListDo {
    private String id;
    @NotBlank(message = "货品编号不能为空")
    private String swGoodsId;
    @NotBlank(message = "货品规格不能为空")
    private String skuCode;

    private String skuPic;
    @NotBlank(message = "货品数量不能为空")
    private Integer skuNum;
    @NotBlank(message = "货品价格不能为空")
    private BigDecimal skuPrice;

}
