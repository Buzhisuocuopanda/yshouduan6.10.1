package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwGoodsList;
import com.authine.cloudpivot.ext.entity.SwGoodsListCriteria;
import java.util.List;

import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.SwGoodsVo;
import org.apache.ibatis.annotations.Param;

public interface SwGoodsListMapper {
    long countByExample(SwGoodsListCriteria example);

    int deleteByExample(SwGoodsListCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwGoodsList record);

    int insertSelective(SwGoodsList record);

    List<SwGoodsList> selectByExample(SwGoodsListCriteria example);

    SwGoodsList selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwGoodsList record, @Param("example") SwGoodsListCriteria example);

    int updateByExample(@Param("record") SwGoodsList record, @Param("example") SwGoodsListCriteria example);

    int updateByPrimaryKeySelective(SwGoodsList record);

    int updateByPrimaryKey(SwGoodsList record);

    List<SwGoodsList> selectbytj(SwGoodsVo swGoodsVo);


    List<SwGoodsVo> getInfo(@Param("goodsQueryParam") GoodsQueryParam goodsQueryParam);

}