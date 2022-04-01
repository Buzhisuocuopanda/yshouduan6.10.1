package com.authine.cloudpivot.ext.model.dto;

import lombok.Data;

import java.util.Date;

/**
 * ClassName MeetingDetailModel
 * Description
 * Create by gfy
 * Date 2022/3/2 13:22
 */
@Data
public class MeetingDetailModel {

    private String id;

    private Date createTime;

    private String swMeetingId;

    private String meetingTitle;

    private String reporter;

    private Date reportTime;

    private String dataUri;

    private String dataUser;

    private Date dataTime;

    private Integer number;

}
