package com.authine.cloudpivot.ext.model.vo;

import com.authine.cloudpivot.ext.entity.SwGoodsList;
import com.authine.cloudpivot.ext.entity.SwStore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import java.util.Date;
import java.util.List;

@Data
public class SwGoodsVo extends SwStore {
   private List<SwGoodsList> swGoodsLists;

}
