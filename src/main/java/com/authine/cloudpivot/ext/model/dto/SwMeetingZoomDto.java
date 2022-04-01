package com.authine.cloudpivot.ext.model.dto;

import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.sun.jersey.core.util.StringIgnoreCaseKeyComparator;
import lombok.Data;

@Data
public class SwMeetingZoomDto extends BaseSwQueryModel {

    //Id
    private String userId;
    //创建人姓名
    private String createname;
    //会议管理员姓名
    private String meetingadminname;
    //会议室名称
    private String meetingname;
}
