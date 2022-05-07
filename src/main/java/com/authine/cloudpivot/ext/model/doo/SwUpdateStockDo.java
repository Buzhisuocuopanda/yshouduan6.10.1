package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
public class SwUpdateStockDo {

    private String id;

    @NotBlank(message = "tranNo不能为空")
    private String tranNo;

    @NotBlank(message = "审核结果不能为空")
    private String ysResult;

    private String bizObjectId;

    public Integer getGoodsTotalNum() {
        return goodsTotalNum;
    }

    private String workflowInstance;

    private Integer goodsTotalNum;
    @NotBlank(message = "流水号不能为空")
    private String sequeceNo;




}
