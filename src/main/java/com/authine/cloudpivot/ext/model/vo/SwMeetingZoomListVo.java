package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

@Data
public class SwMeetingZoomListVo {

    //业务ID
    private String bizobjectid;

    //会议室名称
    private String meetingname;

    //会议室图片
    private String meetinguri;

    //会议室类别
    private String meetingtype;

    //排序号
    private Integer slot;

    //会议室地址
    private String address;

    //所需设备
    private String device;

    //会议管理员姓名
    private String meetingadminname;

    //创建人姓名
    private String createname;

    //ID
    private String meetingId;

}
