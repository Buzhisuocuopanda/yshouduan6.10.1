package com.authine.cloudpivot.ext.model.vo;

import lombok.Data;

import java.util.Date;

/**
 * ClassName SwCalenderEvents
 * Description
 * Create by gfy
 * Date 2022/3/16 10:36
 */
@Data
public class SwCalenderEvents {

    private Date end;
    private Date start;

    private String id;

    //会议室id
    private String resourceId;

    private String color;

    private String title;


}
