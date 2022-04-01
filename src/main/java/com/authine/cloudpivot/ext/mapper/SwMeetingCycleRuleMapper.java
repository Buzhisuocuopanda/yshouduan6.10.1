package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwMeetingCycleRule;
import com.authine.cloudpivot.ext.entity.SwMeetingCycleRuleCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwMeetingCycleRuleMapper {
    long countByExample(SwMeetingCycleRuleCriteria example);

    int deleteByExample(SwMeetingCycleRuleCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwMeetingCycleRule record);

    int insertSelective(SwMeetingCycleRule record);

    List<SwMeetingCycleRule> selectByExample(SwMeetingCycleRuleCriteria example);

    SwMeetingCycleRule selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwMeetingCycleRule record, @Param("example") SwMeetingCycleRuleCriteria example);

    int updateByExample(@Param("record") SwMeetingCycleRule record, @Param("example") SwMeetingCycleRuleCriteria example);

    int updateByPrimaryKeySelective(SwMeetingCycleRule record);

    int updateByPrimaryKey(SwMeetingCycleRule record);
}