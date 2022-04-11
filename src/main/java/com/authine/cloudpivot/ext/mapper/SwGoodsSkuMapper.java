package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwGoodsSku;
import com.authine.cloudpivot.ext.entity.SwGoodsSkuCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SwGoodsSkuMapper {
    long countByExample(SwGoodsSkuCriteria example);

    int deleteByExample(SwGoodsSkuCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwGoodsSku record);

    int insertSelective(SwGoodsSku record);

    List<SwGoodsSku> selectByExample(SwGoodsSkuCriteria example);

    SwGoodsSku selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwGoodsSku record, @Param("example") SwGoodsSkuCriteria example);

    int updateByExample(@Param("record") SwGoodsSku record, @Param("example") SwGoodsSkuCriteria example);

    int updateByPrimaryKeySelective(SwGoodsSku record);

    int updateByPrimaryKey(SwGoodsSku record);
}