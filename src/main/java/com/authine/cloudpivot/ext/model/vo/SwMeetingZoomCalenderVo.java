package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName SwMeetingZoomCalenderVo
 * Description
 * Create by gfy
 * Date 2022/3/16 10:25
 */
@Data
public class SwMeetingZoomCalenderVo {

    private List<SwCalenderResource> resources=new ArrayList<>();

    private List<SwCalenderEvents> calendarEvents=new ArrayList<>();

}
