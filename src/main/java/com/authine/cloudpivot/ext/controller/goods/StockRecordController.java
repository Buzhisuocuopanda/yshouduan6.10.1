package com.authine.cloudpivot.ext.controller.goods;


import com.alibaba.fastjson.JSONObject;
import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.doo.SwGoodsDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingAuditDo;
import com.authine.cloudpivot.ext.model.doo.SwUpdateStockDo;
import com.authine.cloudpivot.ext.model.vo.SwGoodsResult;


import com.authine.cloudpivot.ext.service.goods.StorageManageService;
import com.authine.cloudpivot.ext.utils.ReqDedupHelper;
import com.authine.cloudpivot.ext.utils.ValidUtils;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * 货物出入库管理
 *
 */

@Api(
        tags = {"商品出入库管理"}
)
@RestController
@RequestMapping("/api/goods")
@Slf4j
public class StockRecordController  extends SwBaseController {


    @Resource
    private ReqDedupHelper reqDedupHelper;
    @Resource
    private StorageManageService storageManageService;

    /**
     * 货物入库新建接口 审核前就调用
     *
     * @param swGoodsDo
     * @param bindingResult
     * @return
     */

    @ApiOperation(
            value = "货物入库",
            notes = "货物入库"
    )
    @PostMapping("/stockIn")
    public ResponseResult<SwGoodsResult> stockIn(@Valid @RequestBody SwGoodsDo swGoodsDo, BindingResult bindingResult) {
        SwGoodsResult ssr = null;
        try {
            ValidUtils.bindvaild(bindingResult);

            Boolean de = reqDedupHelper.checkAnainCommit(JSONObject.toJSONString(swGoodsDo), swGoodsDo.getGoodsCode(), "de");
            if(de){
                return this.getOkResponseResult(ssr,"请勿重复提交");
            }
            ssr = storageManageService.stockInOperation(swGoodsDo);
            return this.getOkResponseResult(ssr, "添加成功");
        } catch (SwException e) {
            log.error("【货物入库】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swGoodsDo), e.getMessage());
            return this.getErrResponseResult(ssr, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("货物入库新建会议】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swGoodsDo), ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(ssr, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }


    /**
     * 货物入库接口 审核过后调用
     *
     * @param swUpdateStockDo
     * @param bindingResult
     * @return
     */
    @ApiOperation(
            value = "流程审核后修改库存数量",
            notes = "流程审核后修改库存数量"
    )
    @PostMapping("/updatestock")
    public ResponseResult updatestock(@Valid @RequestBody SwUpdateStockDo swUpdateStockDo, BindingResult bindingResult) {
        try {
            log.info("【入库审核过后调用】调用，参数${}$", JSONObject.toJSONString(swUpdateStockDo));
            ValidUtils.bindvaild(bindingResult);
            storageManageService.updatestock(swUpdateStockDo);
            return this.getOkResponseResult("操作成功");

        } catch (SwException e) {
            log.error("【入库审核过后调用】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swUpdateStockDo), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【入库审核过后调用】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swUpdateStockDo), ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }




}