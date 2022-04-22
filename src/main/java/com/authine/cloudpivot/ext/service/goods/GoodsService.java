package com.authine.cloudpivot.ext.service.goods;

import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.SwGoodslistVo;
import com.authine.cloudpivot.ext.model.vo.SwgetstoreVo;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
@Service
public interface GoodsService {



    void addGoods(SwGoodsListDo swGoodsDo);


    List<SwGoods> list(SwGoodslistVo swGoodslistVo, Integer pageSize, Integer pageNum);

   List<GoodsQueryParam> goodslist(Byte isEnabled, Date startTime, Date endTime,String goodsName, String goodsCode);


    List<SwgetstoreVo> getenableswstore();
}
