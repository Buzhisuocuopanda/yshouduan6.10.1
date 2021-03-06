package com.authine.cloudpivot.ext.service.meeting;

import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.dto.SwMesstingZoomDto;
import com.authine.cloudpivot.ext.model.vo.*;

public interface SwMeetingZoomService {

    //添加会议室
    SwMeetingResult addMeetingZoom(SwMesstingZoomVo swMesstingZoomVo);

   //会议室列表内容
    SwPageVo<SwMeetingZoomListVo> meetingZoomList(BaseSwQueryModel queryModel);

    //会议室列表删除
    void MeetingZoomUpdate(SwMeetingZoomupdateDO swMeetingZoomupdateDO);

    //会议室查看
    SwMeetingZoomListUpdateVo meetingList(String meetingId);

    //创建会议室
    void create(SwMesstingZoomDto swMesstingZoomDto);

    void updateMeetingZoom(SwMesstingZoomDto swMesstingZoomDto);

    //编辑会议室
    void updateMeetingZoom(SwMeetingZoomListUpdateVo swMeetingZoomListUpdateVo);

//    //流程审核后修改会议状态
//    void updateMeetingzhouqi(SwMeetingzhouqiDo swMeetingzhouqiDo);
}
