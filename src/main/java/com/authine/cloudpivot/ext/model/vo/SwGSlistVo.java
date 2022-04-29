package com.authine.cloudpivot.ext.model.vo;

import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.entity.SwStore;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class SwGSlistVo  {



    private String goodsName;

    private String goodsCode;




    private String goodsCompany;

    private String swStoreName;

    private Integer goodsTotalNum;





    private String storeAddress;



    private Integer storeGoodsNum;

    private Integer storeGoodsSkuNum;

    private String storeAdmin;

}
