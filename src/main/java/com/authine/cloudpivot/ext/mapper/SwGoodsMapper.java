package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.entity.SwGoodsCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwGoodsMapper {
    long countByExample(SwGoodsCriteria example);

    int deleteByExample(SwGoodsCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwGoods record);

    int insertSelective(SwGoods record);

    List<SwGoods> selectByExample(SwGoodsCriteria example);

    SwGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwGoods record, @Param("example") SwGoodsCriteria example);

    int updateByExample(@Param("record") SwGoods record, @Param("example") SwGoodsCriteria example);

    int updateByPrimaryKeySelective(SwGoods record);

    int updateByPrimaryKey(SwGoods record);
}