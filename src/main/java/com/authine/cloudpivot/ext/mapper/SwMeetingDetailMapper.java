package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwMeetingDetail;
import com.authine.cloudpivot.ext.entity.SwMeetingDetailCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwMeetingDetailMapper {
    long countByExample(SwMeetingDetailCriteria example);

    int deleteByExample(SwMeetingDetailCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwMeetingDetail record);

    int insertSelective(SwMeetingDetail record);

    List<SwMeetingDetail> selectByExample(SwMeetingDetailCriteria example);

    SwMeetingDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwMeetingDetail record, @Param("example") SwMeetingDetailCriteria example);

    int updateByExample(@Param("record") SwMeetingDetail record, @Param("example") SwMeetingDetailCriteria example);

    int updateByPrimaryKeySelective(SwMeetingDetail record);

    int updateByPrimaryKey(SwMeetingDetail record);
}