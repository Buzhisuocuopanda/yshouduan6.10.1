package com.authine.cloudpivot.ext.model.vo;

import com.authine.cloudpivot.ext.utils.TimeUtil;
import lombok.Data;

import java.util.Date;


/**
 * ClassName SwMeetingDateVo
 * Description
 * Create by gfy
 * Date 2022/3/8 9:00
 */
@Data
public class SwMeetingDateVo {

    //事件内容（会议标题）
    private String title;

//    private String start;
//
//    private String end;

    //会议id
    private String id;
    //会议开始时间 2022-03-08 19:00:00


    private Date start;
    //会议结束时间

    private Date end;;

    private Byte type;

    private String color="rgba(9, 9, 9, 0.2)";
//
//    public String getStart() {
//          if(startTime!=null){
//            return TimeUtil.getSimpleTime(startTime);
//        }
//
//        return start;
//    }
//
//    public String getEnd() {
//        if(endTime!=null){
//            return TimeUtil.getSimpleTime(endTime);
//        }
//
//        return end;
//    }
}
