package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwMeetingCloseLog;
import com.authine.cloudpivot.ext.entity.SwMeetingCloseLogCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwMeetingCloseLogMapper {
    long countByExample(SwMeetingCloseLogCriteria example);

    int deleteByExample(SwMeetingCloseLogCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwMeetingCloseLog record);

    int insertSelective(SwMeetingCloseLog record);

    List<SwMeetingCloseLog> selectByExample(SwMeetingCloseLogCriteria example);

    SwMeetingCloseLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwMeetingCloseLog record, @Param("example") SwMeetingCloseLogCriteria example);

    int updateByExample(@Param("record") SwMeetingCloseLog record, @Param("example") SwMeetingCloseLogCriteria example);

    int updateByPrimaryKeySelective(SwMeetingCloseLog record);

    int updateByPrimaryKey(SwMeetingCloseLog record);
}