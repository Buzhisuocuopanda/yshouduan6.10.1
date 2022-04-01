package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

/**
 * ClassName SwMeetingUpdateDo
 * Description
 * Create by gfy
 * Date 2022/3/1 17:19
 */
@Data
public class SwMeetingAuditDo {

    @NotBlank(message = "tranNo不能为空")
    private String tranNo;
    @NotBlank(message = "流水号不能为空")
    private String sequeceNo;
    @NotBlank(message = "审核结果不能为空")
    private String state;

//    @NotBlank(message = "审核意见不能为空")
    @Length(min = 1,max = 255,message = "审核意见最多255字")
    private String auditMsg;

    private String bizObjectId;

    private String workflowInstance;

    //会议状态 1：已预约 2：已取消
    private Byte status;



}
