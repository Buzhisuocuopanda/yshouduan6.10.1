package com.authine.cloudpivot.ext.controller.goods;


import com.alibaba.fastjson.JSONObject;
import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.ext.entity.SwGoods;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.goods.GoodsService;
import com.authine.cloudpivot.ext.utils.ValidUtils;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Arrays;
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

    @RequestMapping(value = "/version", method = RequestMethod.GET)
    public int version(){
        return 3;
    }



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

        }catch (Exception e){
            log.error("【查询货物】接口出现异常，{}$,异常${}$",  ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(productList, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }

    //货物列表
    @ApiOperation(
            value = "货物列表",
            notes = "货物列表"
    )
    @GetMapping("/goodsList")
    public ResponseResult<SwPageVo<SwGoodsListtVo>> GoodsList(@RequestParam Integer page, @RequestParam Integer size)
    {
        SwPageVo<SwGoodsListtVo> res=null;
        String userId="";
        try
        {
            BaseSwQueryModel queryModel=new BaseSwQueryModel();
            queryModel.setPage(page);
            queryModel.setSize(size);
            res=goodsService.goodsList(queryModel);
            return this.getOkResponseResult(res,"查询成功");
        }catch(SwException e)
        {
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e){
            log.error("【获取货物】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    /***
     * 查询货物详情列表
     * @return
     */
    @GetMapping("/goodsListupdate")
    public ResponseResult<SwGoodsListtVo> goodsListupdate(@RequestParam String id )
    {
        SwGoodsListtVo res = new SwGoodsListtVo();
        try{
            res = goodsService.goodList(id);
            return this.getOkResponseResult(res, "查询成功");
        }catch(SwException e)
        {
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【获取货物详情列表】接口出现异常，参数userId${}$,异常${}$", id, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    @ApiOperation(
            value ="取消货物",
            notes = "取消货物"
    )
    @PostMapping("/goodlistUpdate")
    public ResponseResult goodlistUpdate(@Valid @RequestBody SwMeetingZoomupdateDO swMeetingZoomupdateDO, BindingResult bindingResult){
        try
        {
            ValidUtils.bindvaild(bindingResult);
            if(swMeetingZoomupdateDO.getIds().size()==0)
            {
                throw new SwException("请至少选择一个货物取消");
            }

            swMeetingZoomupdateDO.setUserId(getUserId());
            goodsService.goodlistUpdate(swMeetingZoomupdateDO);
            return this.getOkResponseResult("操作成功");
        }catch (SwException e)
        {
            log.error("【取消货物】接口参数校验出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMeetingZoomupdateDO), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【取消货物】接口出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMeetingZoomupdateDO),ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    /***
     * 货物列表编辑
     */
    @PostMapping("/UpdategoodslistEdit")
    public ResponseResult UpdategoodslistEdit(@RequestBody SwGSlistVo swGSlistVo, BindingResult bindingResult)
    {
        ValidUtils.bindvaild(bindingResult);
        try{
            goodsService.UpdategoodslistEdit(swGSlistVo);
            return this.getOkResponseResult("修改成功");
        }catch(DuplicateKeyException e) {
            log.error("【修改货物云枢调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swGSlistVo), "货物号重复");
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), "货物号重复");
        }catch(SwException e){
            log.error("【修改货物云枢调用出现异常】,参数${}$,异常${}$",JSONObject.toJSONString(swGSlistVo),e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【修改货物接口调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swGSlistVo), ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    //字符串转二进制
    public static String byte2hex(byte[] b) { // 二进制转字符串
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1) {
                hs = hs + "0" + stmp;
            } else {
                hs = hs + stmp;
            }
        }
        return hs;
    }

    // 二进制转字符串
    public static byte[] hex2byte(String str) {
        if (str == null) {
            return null;
        }
        str = str.trim();
        int len = str.length();
        if (len == 0 || len % 2 == 1) {
            return null;
        }

        byte[] b = new byte[len / 2];
        try {
            for (int i = 0; i < str.length(); i += 2) {
                b[i / 2] = (byte) Integer
                        .decode("0x" + str.substring(i, i + 2)).intValue();
            }
            return b;
        } catch (Exception e) {
            return null;
        }
    }

    public static void main(String[] args) {

        String str = "abfdsfsdffdssfsd";
        String result = "";

        result = byte2hex(str.getBytes());
        System.out.println(result);

        System.out.println(new String(hex2byte(result)));

        System.out.println(str.getBytes());
        System.out.println(Arrays.toString(hex2byte(result)));
    }
}







