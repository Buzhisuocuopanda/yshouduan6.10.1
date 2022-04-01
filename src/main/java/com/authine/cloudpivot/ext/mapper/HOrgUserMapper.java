package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.HOrgUser;
import com.authine.cloudpivot.ext.entity.HOrgUserCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HOrgUserMapper {
    long countByExample(HOrgUserCriteria example);

    int deleteByExample(HOrgUserCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(HOrgUser record);

    int insertSelective(HOrgUser record);

    List<HOrgUser> selectByExampleWithBLOBs(HOrgUserCriteria example);

    List<HOrgUser> selectByExample(HOrgUserCriteria example);

    HOrgUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") HOrgUser record, @Param("example") HOrgUserCriteria example);

    int updateByExampleWithBLOBs(@Param("record") HOrgUser record, @Param("example") HOrgUserCriteria example);

    int updateByExample(@Param("record") HOrgUser record, @Param("example") HOrgUserCriteria example);

    int updateByPrimaryKeySelective(HOrgUser record);

    int updateByPrimaryKeyWithBLOBs(HOrgUser record);

    int updateByPrimaryKey(HOrgUser record);
}