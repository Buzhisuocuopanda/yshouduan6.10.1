package com.authine.cloudpivot.ext.service.goods;

import com.authine.cloudpivot.ext.model.doo.SwGoodsDo;
import com.authine.cloudpivot.ext.model.doo.SwUpdateStockDo;
import com.authine.cloudpivot.ext.model.vo.SwGoodsResult;


public interface StorageManageService {
    SwGoodsResult stockInOperation(SwGoodsDo swGoodsDo) throws Exception;


    void updatestock(SwUpdateStockDo swUpdateStockDo);
}
