package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

@Data
public class SwMeetingZoomListUpdateVo {

    //ID
    private String id;

    //会议室名称
    private String meetingname;

    //会议室类别
    private String meetingtype;

    //排序号
    private Integer slot;

    //会议室地址
    private String address;

    //会议管理员姓名
    private String meetingadminname;

    //创建人姓名
    private String createname;

    private String joinUser;
}
