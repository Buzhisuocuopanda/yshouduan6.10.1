package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwMeeting;
import com.authine.cloudpivot.ext.entity.SwMeetingCriteria;

import java.util.Date;
import java.util.List;

import com.authine.cloudpivot.ext.model.doo.SwCycleMeetingDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingDo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingDateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingListVo;
import org.apache.ibatis.annotations.Param;

public interface SwMeetingMapper {
    long countByExample(SwMeetingCriteria example);

    int deleteByExample(SwMeetingCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwMeeting record);

    int insertSelective(SwMeeting record);

    List<SwMeeting> selectByExample(SwMeetingCriteria example);

    SwMeeting selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwMeeting record, @Param("example") SwMeetingCriteria example);

    int updateByExample(@Param("record") SwMeeting record, @Param("example") SwMeetingCriteria example);

    int updateByPrimaryKeySelective(SwMeeting record);

    int updateByPrimaryKey(SwMeeting record);


    List<SwMeeting> selectMeetingsByTimeAndZoom(SwMeetingDo swMeetingDo);

    //    List<SwMeeting> selectMeetingsByDateAndZoom(@Param("timestart") Long timestart, @Param("timeend") Long timeend);
    List<SwMeeting> selectMeetingsByDateAndZoom(SwCycleMeetingDo swCycleMeetingDo);


    List<SwMeetingDateVo> selectBydateAndCompled(Date dayEarlyTime, String completed);

    List<SwMeetingDateVo> selectBydateAndCompledUser(Date dayEarlyTime, String completed, String userId);

    List<SwMeetingListVo> openMeetingList(Date date);

    List<SwMeetingListVo> noopenMeetingList(Date date);

    List<SwMeeting> selectByUserId(@Param("userId") String userId);
}