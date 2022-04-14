package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
public class SwUpdateStockDo {
    @NotBlank(message = "tranNo不能为空")
    private String tranNo;

    @NotBlank(message = "审核结果不能为空")
    private String ysResult;

    private String bizObjectId;

    private String workflowInstance;

    private String goodsTotalNum;

    private String sequeceNo;

}
