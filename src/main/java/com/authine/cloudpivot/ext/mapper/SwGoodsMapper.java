package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.entity.SwGoodsCriteria;

import java.util.List;

import com.authine.cloudpivot.ext.model.doo.SwUpdateStockDo;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.dto.SwGoodsListDto;
import com.authine.cloudpivot.ext.model.dto.SwMeetingZoomDto;
import com.authine.cloudpivot.ext.model.vo.SwGSlistVo;
import com.authine.cloudpivot.ext.model.vo.SwGoodResult;
import com.authine.cloudpivot.ext.model.vo.SwGoodsListtVo;
import com.authine.cloudpivot.ext.model.vo.SwGoodslistVo;
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


    void update(SwGoods swGoods);

    void updatetotalnum(SwUpdateStockDo swUpdateStockDo);


    SwGoods selectforupdate(SwUpdateStockDo swUpdateStockDo);
    List<SwGoodResult> getInfo(GoodsQueryParam goodsQueryParam);

    List<SwGSlistVo> getgslist(String id);

    List<SwGoodsListtVo> goodsList();

    List<SwGoodsListDto> selectgoodlist(String id);


    void updategoodslistEdit(SwGSlistVo swGSlistVo);
}