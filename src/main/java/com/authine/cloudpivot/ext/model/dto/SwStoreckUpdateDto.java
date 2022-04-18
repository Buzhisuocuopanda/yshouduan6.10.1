package com.authine.cloudpivot.ext.model.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class SwStoreckUpdateDto {

    //自生成流程标识号
    @NotBlank(message = "tranNo不能为空")
    private String tranno;

    //云枢审核结果
    @NotBlank(message = "审核结果不能为空")
    private String ysresult;

    //流水号
    @NotBlank(message = "流水号")
    private String sequeceNo;

    //业务对象id
    private String bizobjectid;

    //流程id
    private String workflowinstance;

    //云枢是否提交成功
    private String endcommit;


}
