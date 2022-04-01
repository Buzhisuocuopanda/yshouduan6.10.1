package com.authine.cloudpivot.ext.model.doo;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlInlineBinaryData;

public class SwMeetingzhouqiDo {
    @NotBlank(message = "tranNo不能为空")
    private String tranNo;

    @NotBlank(message = "流程号不能为空")
    private String sequeceNo;

    @NotBlank(message = "审核结果不能为空")
    private String state;

    @Length(min = 1,max = 255,message = "审核意见最多255字")
    private String auditMsg;

    private String bizObjectId;

    private String workflowInstance;

    //会议状态 1：已预约 2：已取消
    private Byte status;
}
