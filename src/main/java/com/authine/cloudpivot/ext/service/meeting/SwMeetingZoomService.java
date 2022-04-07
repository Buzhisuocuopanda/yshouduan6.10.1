package com.authine.cloudpivot.ext.service.meeting;

import com.authine.cloudpivot.ext.entity.SwMeetingZoom;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.doo.SwMeetingzhouqiDo;
import com.authine.cloudpivot.ext.model.dto.SwMesstingZoomDto;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListUpdateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListVo;
import com.authine.cloudpivot.ext.model.vo.SwMesstingZoomVo;

import java.util.List;

public interface SwMeetingZoomService {

    //添加会议室
    void addMeetingZoom(SwMesstingZoomVo swMesstingZoomVo);

   //会议室列表内容
    SwPageVo<SwMeetingZoomListVo> meetingZoomList(BaseSwQueryModel queryModel);

    //会议室列表删除
    void MeetingZoomUpdate(SwMeetingZoomupdateDO swMeetingZoomupdateDO);

    //会议室查看
    SwMeetingZoomListUpdateVo meetingList(String meetingId);

    //创建会议室
    void create(SwMesstingZoomDto swMesstingZoomDto);

//    //流程审核后修改会议状态
//    void updateMeetingzhouqi(SwMeetingzhouqiDo swMeetingzhouqiDo);
}
