package com.authine.cloudpivot.ext.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

import java.util.Date;

@Data
public class SwGoodResult {
    private String goodsName;
    @ApiModelProperty("货物编码")
    private String goodsCode;

    private Date createTime;

    private String swStoreId;

    private String goodsCompany;

    private String swStoreName;

    private Integer goodsTotalNum;

    @ApiParam(value = "开始时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String startTime;
    @ApiParam(value = "结束时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String endTime;
}
