package com.authine.cloudpivot.ext.model.vo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * ClassName SwMeetingDetailVo
 * Description
 * Create by gfy
 * Date 2022/3/18 10:21
 */
@Data
public class SwMeetingDetailVo {

    private String id;

    private String meetingName;

    private String createName;

    private Byte meetingStatus;

    private Byte type;

    private String meetingType;


    private String meetingHost;

    private String meetingZoom;

    private String meetingAddress;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date meetingStartTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "GMT+8")
    private Date meetingEndTime;

    private String summaryPeople;

    private String scheduleResult;

    private String joinUser;


}
