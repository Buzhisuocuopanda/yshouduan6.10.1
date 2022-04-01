package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwMeeting;
import com.authine.cloudpivot.ext.entity.SwMeetingUserRel;
import com.authine.cloudpivot.ext.entity.SwMeetingUserRelCriteria;
import java.util.List;

import com.authine.cloudpivot.ext.model.doo.SwMeetingDo;
import com.authine.cloudpivot.ext.model.dto.SwMeetingUserDto;
import org.apache.ibatis.annotations.Param;

public interface SwMeetingUserRelMapper {
    long countByExample(SwMeetingUserRelCriteria example);

    int deleteByExample(SwMeetingUserRelCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwMeetingUserRel record);

    int insertSelective(SwMeetingUserRel record);

    List<SwMeetingUserRel> selectByExample(SwMeetingUserRelCriteria example);

    SwMeetingUserRel selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwMeetingUserRel record, @Param("example") SwMeetingUserRelCriteria example);

    int updateByExample(@Param("record") SwMeetingUserRel record, @Param("example") SwMeetingUserRelCriteria example);

    int updateByPrimaryKeySelective(SwMeetingUserRel record);

    int updateByPrimaryKey(SwMeetingUserRel record);


    List<SwMeetingUserDto> selectUsersByMeetingId(String id);
}