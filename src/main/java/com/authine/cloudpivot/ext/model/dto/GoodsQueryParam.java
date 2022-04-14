package com.authine.cloudpivot.ext.model.dto;

import com.authine.cloudpivot.ext.entity.SwStore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class GoodsQueryParam  {
    private String goodsName;
    @ApiModelProperty("货物编码")
    private String goodsCode;

    private Date createTime;

    private Byte isEnabled;

    private String goodsDetail;

    private String goodsHeadPic;

    private String swStoreId;

    private String goodsCompany;

    private String swStoreName;

    private Integer goodsTotalNum;

    private String joinUser;

}
