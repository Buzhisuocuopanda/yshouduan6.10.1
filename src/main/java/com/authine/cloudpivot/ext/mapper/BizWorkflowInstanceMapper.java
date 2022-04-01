package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.BizWorkflowInstance;
import com.authine.cloudpivot.ext.entity.BizWorkflowInstanceCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BizWorkflowInstanceMapper {
    long countByExample(BizWorkflowInstanceCriteria example);

    int deleteByExample(BizWorkflowInstanceCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(BizWorkflowInstance record);

    int insertSelective(BizWorkflowInstance record);

    List<BizWorkflowInstance> selectByExample(BizWorkflowInstanceCriteria example);

    BizWorkflowInstance selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BizWorkflowInstance record, @Param("example") BizWorkflowInstanceCriteria example);

    int updateByExample(@Param("record") BizWorkflowInstance record, @Param("example") BizWorkflowInstanceCriteria example);

    int updateByPrimaryKeySelective(BizWorkflowInstance record);

    int updateByPrimaryKey(BizWorkflowInstance record);
}