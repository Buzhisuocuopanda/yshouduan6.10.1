package com.authine.cloudpivot.ext.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
@Data
public class SwMesstingZoomDto {

    @NotBlank(message = "tranNo不能为空")
    private String tranNo;
    @NotBlank(message = "流水号不能为空")
    private String sequeceNo;
    @NotBlank(message = "审核结果不能为空")
    private String ysReult;

    private String bizObjectId;

    private String workflowInstance;
}
