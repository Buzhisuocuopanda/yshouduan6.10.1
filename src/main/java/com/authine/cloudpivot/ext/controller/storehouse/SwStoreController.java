package com.authine.cloudpivot.ext.controller.storehouse;

import com.alibaba.fastjson.JSONObject;
import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwStoreDo;
import com.authine.cloudpivot.ext.model.doo.SwStoreupdateDo;
import com.authine.cloudpivot.ext.model.dto.SwStoreckUpdateDto;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.storehouse.SwStoreService;
import com.authine.cloudpivot.ext.utils.ValidUtils;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(
        tags = {"运行时::门户"}
)
@RestController
@RequestMapping("/api/swstore")
@Slf4j
public class SwStoreController extends SwBaseController {
    @Resource
    private SwStoreService swStoreService;

    @ApiOperation(
            value = "添加仓库",
            notes = "添加仓库"
    )
    //添加仓库
    @PostMapping("/addSwStore")

    public ResponseResult<SwStoreResult> addMeetingZoom(@Valid @RequestBody SwStoreDo swStoreDo, BindingResult bindingResult)
    {
        SwStoreResult res = null;
        try {
            //参数校验
            ValidUtils.bindvaild(bindingResult);
            //调用服务器
            res=swStoreService.addSwStore(swStoreDo);
            return this.getOkResponseResult(res, "添加成功");

        } catch (SwException e) {
            log.error("【新建仓库】接口参数校验出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swStoreDo), e.getMessage());
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【新建仓库】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swStoreDo),ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }

    //仓库列表
    @GetMapping("/SwStoreList")
    public ResponseResult<SwPageVo<SwStoreListVo>> SwStoreList(@RequestParam Integer page, @RequestParam Integer size)
    {
        SwPageVo<SwStoreListVo> res=null;
        String userId="";
        try
        {
            BaseSwQueryModel queryModel=new BaseSwQueryModel();
            queryModel.setPage(page);
            queryModel.setSize(size);
            res=swStoreService.swstorelist(queryModel);
            return this.getOkResponseResult(res,"查询成功");
        }catch(SwException e)
        {
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e){
            log.error("【获取仓库列表】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

   //取消仓库
    @ApiOperation(
            value ="取消仓库",
            notes = "取消仓库"
    )
    @PostMapping("/SwStoreUpdate")
    public ResponseResult SwStoreUpdate(@Valid @RequestBody SwStoreupdateDo swStoreupdateDo, BindingResult bindingResult){
        try
        {
            ValidUtils.bindvaild(bindingResult);
            if(swStoreupdateDo.getIds().size()==0)
            {
                throw new SwException("请至少选择一个仓库取消");
            }

            swStoreupdateDo.setUserId(getUserId());
            swStoreService.swstoreupdate(swStoreupdateDo);
            return this.getOkResponseResult("操作成功");
        }catch (SwException e)
        {
            log.error("【取消仓库】接口参数校验出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swStoreupdateDo), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【取消仓库】接口出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swStoreupdateDo),ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    /***
     * 查询会议室详情列表
     * @return
     */
    @GetMapping("/SwStoreListUpdate")
    public ResponseResult<SwStoreListUpdateVo> swStoreListupdate(@RequestParam String meetingId )
    {
        SwStoreListUpdateVo res = new SwStoreListUpdateVo();
        try{
            res = swStoreService.swstorelistUpdate(meetingId);
            return this.getOkResponseResult(res, "查询成功");
        }catch(SwException e)
        {
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【获取仓库详情列表】接口出现异常，参数userId${}$,异常${}$", meetingId, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    /***
     * 仓库列表编辑
     */
    @RequestMapping("/UpdateSwStoreEdit")
    public ResponseResult UpdateSwStoreEdit(@RequestBody SwStoreListUpdateVo swStoreListUpdateVo, BindingResult bindingResult)
    {
        ValidUtils.bindvaild(bindingResult);
        try{
            swStoreService.updateswstoreedit(swStoreListUpdateVo);
            return this.getOkResponseResult("修改成功");
        }catch(DuplicateKeyException e) {
            log.error("【修改仓库调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swStoreListUpdateVo), "一个流程只能审核通过一次");
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), "一个流程只能审核通过一次");
        }catch(SwException e){
            log.error("【修改仓库调用出现异常】,参数${}$,异常${}$",JSONObject.toJSONString(swStoreListUpdateVo),e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【修改仓库调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swStoreListUpdateVo), ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }


    //流程审核后修改仓库状态
    @ApiOperation(
            value = "流程审核后修改仓库状态",
            notes = "流程审核后修改仓库状态")
    @PostMapping("/swStoreckupdate")
    public ResponseResult swStoreckupdate(@Valid @RequestBody SwStoreckUpdateDto swStoreckUpdateDto, BindingResult bindingResult){
        try {
            log.info("【仓库审核过后调用】调用，参数${}$", JSONObject.toJSONString(swStoreckUpdateDto));

            ValidUtils.bindvaild(bindingResult);

            swStoreService.swStoreckupdate(swStoreckUpdateDto);
            return this.getOkResponseResult("操作成功");
        } catch (SwException e) {
            log.error("【仓库审核过后调用】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swStoreckUpdateDto), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【仓库审核过后调用】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swStoreckUpdateDto),ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }

    //仓库条件查询
    @GetMapping("/SwStoreListselect")
    public ResponseResult<SwPageVo<SwStoreListselectVo>> SwStoreListselect(@RequestParam String storename,@RequestParam String createtime,@RequestParam String updatetime,@RequestParam Integer page, @RequestParam Integer size)
    {
        SwPageVo<SwStoreListselectVo> res=null;
        String userId="";
        try
        {
            BaseSwQueryModel queryModel=new BaseSwQueryModel();
            queryModel.setPage(page);
            queryModel.setSize(size);
            res=swStoreService.swstorelistselect(storename,createtime,updatetime,queryModel);
            return this.getOkResponseResult(res,"查询成功");
        }catch(SwException e)
        {
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e){
            log.error("【获取仓库列表】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

}
