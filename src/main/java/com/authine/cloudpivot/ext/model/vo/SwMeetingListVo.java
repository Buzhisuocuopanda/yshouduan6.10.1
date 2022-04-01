package com.authine.cloudpivot.ext.model.vo;

import com.authine.cloudpivot.engine.enums.status.WorkflowInstanceStatus;
import com.authine.cloudpivot.engine.enums.status.WorkflowTokenStatus;
import com.authine.cloudpivot.ext.utils.TimeUtil;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * ClassName SwMeetingListVo
 * Description
 * Create by gfy
 * Date 2022/3/8 14:37
 */
@Data
public class SwMeetingListVo {

    private String bizObjectId;

    private String workflowInstance;

    //会议名称
    private String meetingName;

    //会议主持人
    private String meetingHost;

    //会议地点
    private String address;

    //会议时间
    private String meetingTime;

    //会议开始时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date meetingStartTime;
    //会议结束时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date meetingEndTime;

    //会议发起人
    private String createrName;

    //组织部门
    private String organization;
    //会议状态 已审核 待审核
    private String status;

    private String scheduleResult;

    private String meetingId;

    public String getMeetingTime() {
        if(meetingStartTime!=null && meetingEndTime!=null){
            return TimeUtil.getSimpleTimeNoSS(meetingStartTime)+"~"+TimeUtil.getSimpleTimeNoSS(meetingEndTime);
        }

        return meetingTime;
    }

    public String getStatus() {
        if(WorkflowInstanceStatus.COMPLETED.toString().equalsIgnoreCase(scheduleResult)){
            return "已审核";
        }else {
            return "待审核";
        }

    }


}
