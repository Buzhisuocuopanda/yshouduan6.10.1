package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * ClassName SwCanUserMeetingZoom
 * Description
 * Create by gfy
 * Date 2022/3/31 13:57
 */
@Data
public class SwCanUserMeetingZoom {



    private String creater;

    private Date createTime;

    private String updater;

    private Date updateTime;

    private String sequeceNo;

    private String organization;

    private String meetingName;

    private String meetingUri;

    private String meetingType;

    private Integer slot;

    private String device;

    private String address;

    private Integer peopleNum;

    private String meetingAdmin;

    private Byte ifCheck;

    private Byte isDisabled;

    private Byte deleted;

    private String meetingAdminName;

    private String createName;

    private String bizObjectId;

    private String zoomId;
}
