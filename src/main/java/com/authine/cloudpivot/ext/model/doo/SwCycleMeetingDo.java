package com.authine.cloudpivot.ext.model.doo;

import lombok.Data;
import org.hibernate.validator.constraints.Length;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.util.ArrayList;

import java.util.List;

/**
 * ClassName SwCycleMeetingDo
 * Description
 * Create by gfy
 * Date 2022/3/1 18:04
 */
@Data
public class SwCycleMeetingDo {

    @NotBlank(message = "创建者不能为空")
    private String creater;

    //所属部门
    private String organization;

//    @NotBlank(message = "单据号不能为空")
    private String sequeceNo;

    //频率不能为空 1:每周 2：每月
    @NotNull(message = "频率不能为空")
    private Byte rate;

    //  '会议日期 ： 1：每天 ，2 ：周一， 3：周二 ，4：周三 ，5：周四， 6：周五， 7：周六， 8：周天 ，9：1日 ，10：2日 ，11：3日 ，12：4日 ，13：5日 ，14：6日 ，15：7日 ，16：8日 ，17：9日 ，18：10日 ，19：11日 ，20：12日 ，21：13日 ，22：14日 ，23：15日 ，24：16日 ，25：17日 ，26：18日 ，27：19日 ，28：20日 ，29：21日，30：22日 ，31：23日 ，32：24日 ，33：25日 ，34：26日 ，35：27日 ，36：28日 ，37：29日 ，38：30日 ，39：31日  ',
    @NotNull(message = "会议日期不能为空")
    private Byte meetingDate;

    @NotNull(message = "周期开始日期不能为空")

    private Date cycleStartDate;

    @NotNull(message = "周期结束日期不能为空")
    private Date cycleEndDate;

    private Long cycleStartTimeParam;

    private Long cycleEndTimeParam;

    @NotBlank(message = "周期开始时间段不能为空")
    private String cycleStartTime;

    @NotBlank(message = "周期结束时间段不能为空")
    private String cycleEndTime;

    //会议名称
    @NotBlank(message = "会议名称不能为空")
    @Length(min = 1,max = 100,message = "会议名称最多100字")
    private String meetingName;

    @NotBlank(message = "请选择会议室")
    private String swMeetingZoomId;

    @NotBlank(message = "请填写会议室")

    private String meetingZoom;

    @NotBlank(message = "请填写会议地址")

    private String meetingAddress;

//    @NotBlank(message = "会议室管理员")
    private String zoomAdmin;

//    @NotBlank(message = "提示信息不能为空")
    private String remark;

    private List<String> joninUserIds =new ArrayList<>();

    private String state;

    @Length(min = 1,max = 255,message = "审批意见最多255字")

    private String auidtMsg;
}
