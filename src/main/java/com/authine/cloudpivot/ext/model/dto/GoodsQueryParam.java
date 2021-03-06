package com.authine.cloudpivot.ext.model.dto;

import com.authine.cloudpivot.ext.entity.SwStore;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.beans.Transient;
import java.util.Date;
import java.util.List;

@Data
public class GoodsQueryParam  {

    private String goodsName;
    @ApiModelProperty("货物编码")
    private String goodsCode;

    private Date createTime;




    private String swStoreId;

    private String goodsCompany;

    private String swStoreName;

    private Integer goodsTotalNum;

    private Byte isEnabled;

    @ApiParam(value = "开始时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String startTime;
    @ApiParam(value = "结束时间", required = false)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String endTime;

}
