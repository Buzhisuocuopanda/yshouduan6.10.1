package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.HBizComment;
import com.authine.cloudpivot.ext.entity.HBizCommentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HBizCommentMapper {
    long countByExample(HBizCommentCriteria example);

    int deleteByExample(HBizCommentCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(HBizComment record);

    int insertSelective(HBizComment record);

    List<HBizComment> selectByExample(HBizCommentCriteria example);

    HBizComment selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HBizComment record, @Param("example") HBizCommentCriteria example);

    int updateByExample(@Param("record") HBizComment record, @Param("example") HBizCommentCriteria example);

    int updateByPrimaryKeySelective(HBizComment record);

    int updateByPrimaryKey(HBizComment record);
}