package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwMeetingZoom;
import com.authine.cloudpivot.ext.entity.SwMeetingZoomCriteria;
import java.util.List;

import com.authine.cloudpivot.ext.model.dto.SwMeetingZoomDto;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListUpdateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListVo;
import org.apache.ibatis.annotations.Param;

public interface SwMeetingZoomMapper {
    long countByExample(SwMeetingZoomCriteria example);

    int deleteByExample(SwMeetingZoomCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwMeetingZoom record);

    int insertSelective(SwMeetingZoom record);

    List<SwMeetingZoom> selectByExample(SwMeetingZoomCriteria example);

    SwMeetingZoom selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwMeetingZoom record, @Param("example") SwMeetingZoomCriteria example);

    int updateByExample(@Param("record") SwMeetingZoom record, @Param("example") SwMeetingZoomCriteria example);

    int updateByPrimaryKeySelective(SwMeetingZoom record);

    int updateByPrimaryKey(SwMeetingZoom record);

    List<SwMeetingZoom> backMeetingzoom(SwMeetingZoomDto query);

    //会议列表
    List<SwMeetingZoomListVo> meetingZoomList();

    //会议列表查询
    List<SwMeetingZoomDto> selectMeetingZoom(String id);
}