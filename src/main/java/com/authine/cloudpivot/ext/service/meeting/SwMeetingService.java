package com.authine.cloudpivot.ext.service.meeting;

import com.authine.cloudpivot.engine.api.model.system.AdminModel;
import com.authine.cloudpivot.ext.entity.SwMeetingZoom;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwCycleMeetingDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingAuditDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingCancleDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingDo;
import com.authine.cloudpivot.ext.model.vo.*;

import java.text.ParseException;
import java.util.List;

/**
 * ClassName SwMeetingService
 * Description
 * Create by gfy
 * Date 2022/3/1 14:10
 */
public interface SwMeetingService {
    SwMeetingResult addMeeting(SwMeetingDo swMeetingDo);

    void updateMeeting(SwMeetingAuditDo swMeetingAuditDo);

    List<SwCanUserMeetingZoom> meetingZooms();


    SwMeetingResult addCycleMeeting(SwCycleMeetingDo swCycleMeetingDo) throws ParseException;

    List<SwMeetingDateVo> meetingListByUser(String userId, List<AdminModel> userAdminList);


    SwPageVo<SwMeetingListVo> openMeetingList(BaseSwQueryModel query);


    SwPageVo<SwMeetingListVo> noopenMeetingList(BaseSwQueryModel query);

    void cancleMeeting(SwMeetingCancleDo swMeetingCancleDo);

    SwMeetingZoomCalenderVo meetingZoomCalender(String userId, List<AdminModel> userAdminList);

    SwMeetingDetailVo swMeetingDetail(String meetingId);
}
