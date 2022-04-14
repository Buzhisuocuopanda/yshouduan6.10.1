package com.authine.cloudpivot.ext.service.goods;

import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.entity.SwGoodsList;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.SwGoodsVo;
import com.authine.cloudpivot.ext.model.vo.SwGoodslistVo;

import java.util.Date;
import java.util.List;

public interface GoodsService {



    void addGoods(SwGoodsListDo swGoodsDo);

    List<SwGoodsList> list(String keyword);

    List<SwGoods> list(SwGoodslistVo swGoodslistVo, Integer pageSize, Integer pageNum);

   List<GoodsQueryParam> goodslist(Byte isEnabled, Date createTime, String goodsName, String goodsCode);


    List<SwGoodsVo> list(GoodsQueryParam goodsQueryParam, Integer pageSize, Integer pageNum);
}
