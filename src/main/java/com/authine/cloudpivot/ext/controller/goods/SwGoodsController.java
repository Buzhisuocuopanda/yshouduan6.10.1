package com.authine.cloudpivot.ext.controller.goods;


import com.alibaba.fastjson.JSONObject;
import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.ext.controller.goods.common.CommonPage;
import com.authine.cloudpivot.ext.controller.goods.common.CommonResult;
import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.goods.GoodsService;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.utils.ValidUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 货物管理Controller
 */

@Api(
        tags = {"货物::管理"}
        )
@RestController
@RequestMapping("/api/goods")
@Slf4j
public class SwGoodsController extends SwBaseController {

@Resource
private GoodsService goodsService;




    @ApiOperation("多表条件查询货物")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<SwPageVo<SwGoods>> getList(SwGoodslistVo swGoodslistVo,
                                                     @RequestParam Integer page,
                                                     @RequestParam Integer size) {
        SwPageVo<SwGoods> productList=null;
        try{
            BaseSwQueryModel query=new BaseSwQueryModel();

            query.setPage(page);
            query.setSize(size);
        productList = goodsService.list(swGoodslistVo,query);
            return this.getOkResponseResult(productList, "查询成功");
        }catch (SwException e){
            return this.getErrResponseResult(productList, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e){
            log.error("【查询货物】接口出现异常，{}$,异常${}$",  ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(productList, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }





    @ApiOperation(
            value = "获取可用的仓库",
            notes = "获取可用的仓库"
    )
    @GetMapping("/getenableswstore")
    public ResponseResult<List<SwgetstoreVo>> getenableswstore() {
        List<SwgetstoreVo> list = new ArrayList<>();
        try {

            list = goodsService.getenableswstore();
            return this.getOkResponseResult(list, "操作成功");
        } catch (SwException e) {
            log.error("【获取可用的仓库】接口参数校验出现异常，异常${}$", e.getMessage());
            return this.getErrResponseResult(list, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【获取可用的仓库】接口出现异常,异常${}$", ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(list, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }

@ApiOperation(
        value = "查询货物详情",
        notes = "查询货物详情"
)
@GetMapping("/getgslist")
public ResponseResult<List<SwGSlistVo>> getgslist(@RequestParam String id ){
    List<SwGSlistVo> list=new ArrayList<>();
            try{
                list=goodsService.getgslist(id);
                return this.getOkResponseResult(list, "查询成功");
            }catch(SwException e)
            {
                return this.getErrResponseResult(list, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
            }catch(Exception e)
            {
                log.error("【查询货物详情】接口出现异常，参数Id${}$,异常${}$", id, ExceptionUtils.getStackTrace(e));
                return this.getErrResponseResult(list, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
            }
}





    @ApiOperation("多表多条件查询")
    @RequestMapping(value = "/goodslist", method = RequestMethod.GET)
    @ResponseBody
    public ResponseResult<SwPageVo<SwGoodResult>> goodslist(GoodsQueryParam goodsQueryParam,
                                                     @RequestParam Integer page,
                                                     @RequestParam Integer size) {
        SwPageVo<SwGoodResult> productList=null;
        try{
            BaseSwQueryModel query=new BaseSwQueryModel();

            query.setPage(page);
            query.setSize(size);
        productList = goodsService.goodslist(goodsQueryParam, query);
            return this.getOkResponseResult(productList, "查询成功");
        }catch (SwException e){
            return this.getErrResponseResult(productList, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e){
            log.error("【查询货物】接口出现异常，{}$,异常${}$",  ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(productList, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }
}







