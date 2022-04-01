package com.authine.cloudpivot.ext.model.doo;

import com.authine.cloudpivot.ext.model.dto.MeetingDetailModel;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ClassName SwMeetingDo
 * Description
 * Create by gfy
 * Date 2022/3/1 13:52
 */
@Data
public class SwMeetingDo {

    @NotBlank(message = "创建者不能为空")
    private String creater;

    private String updater;

    private String createName;

    //会议状态 1：已预约 2：取消
    private Byte meetingStatus;

    //所属部门
    private String organization;

    private String sequeceNo;

//    private String tran_no;


//    @NotNull(message = "会议类型不能为空")
    private Byte type;

    //会议名称
    @NotBlank(message = "会议名称不能为空")
    @Length(min = 1,max = 100,message = "会议名称最多100字")
    private String meetingName;

    @Length(min = 1,max = 50,message = "会议类型最多50字")
    private String meetingType;

    @Length(min = 1,max = 50,message = "主持人最多50字")
    private String meetingHost;

    @NotBlank(message = "请选择会议室")
    private String swMeetingZoomId;

    @NotBlank(message = "请填写会议室")

    private String meetingZoom;

    @NotBlank(message = "请填写会议地址")

    private String meetingAddress;
    @Length(min = 0,max = 255,message = "会议目的最多255字")
    private String meetingGoal;

    private String dataUri;

    @Length(min = 0,max = 255,message = "备注最多255字")
    private String remark;

    @NotBlank(message = "请填写会议主持人")
    @Length(min = 0,max = 50,message = "主持人最多50字")
    private String organPeople;

    @NotBlank(message = "请填写会议组织部门")
    @Length(min = 0,max = 50,message = "会议组织部门最多50字")
    private String meetingOrganization;

    @Length(min = 0,max = 50,message = "会议纪要人员最多50字")
    private String summaryPeople;

    private Date summaryTime;

    //日程生成结果
    private String scheduleResult;

    @Length(min = 0,max = 100,message = "会议设备最多100字")
    private String meetingDevice;

    @Length(min = 0,max = 100,message = "会议辅助服务最多100字")
    private String meetingService;

    @Length(min = 0,max = 255,message = "会议布置要求最多255字")
    private String meetingLayout;

    @Length(min = 0,max = 255,message = "审批意见最多255字")

    private String auidtMsg;

    @NotNull(message = "请选择开始时间段")
    private Date meetingStarttime;

    @NotNull(message = "请选择结束时间段")
    private Date meetingEndtime;

    private String swMeetingCycleRuleId;

    private String state;

    private List<String> joninUserIds =new ArrayList<>();

    private List<MeetingDetailModel> details=new ArrayList<>();

}
