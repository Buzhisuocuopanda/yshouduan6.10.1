package com.authine.cloudpivot.ext.controller.meeting;

import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingAuditDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.dto.SwMesstingZoomDto;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListUpdateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListVo;
import com.authine.cloudpivot.ext.model.vo.SwMesstingZoomVo;
import com.authine.cloudpivot.ext.service.meeting.SwMeetingZoomService;
import com.authine.cloudpivot.ext.utils.ValidUtils;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import  com.alibaba.fastjson.JSONObject;;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;

@Api(
        tags = {"运行时::门户"}
)
@RestController
@RequestMapping("/api/meeting")
@Slf4j
public class SwMeetingZoomController extends SwBaseController {

    @Resource
    private SwMeetingZoomService swMeetingZoomService;

    @ApiOperation(
            value = "添加会议室",
            notes = "添加会议室"
    )

    //添加会议室

    @PostMapping("/addMeetingZoom")
    public ResponseResult addMeetingZoom(@Valid @RequestBody SwMesstingZoomVo swMesstingZoomVo, BindingResult bindingResult)
    {
        try {
            //参数校验
            ValidUtils.bindvaild(bindingResult);
            //调用服务器
            swMeetingZoomService.addMeetingZoom(swMesstingZoomVo);
            return this.getOkResponseResult("添加成功");
        }catch(DuplicateKeyException e) {
            log.error("【添加会议室云枢调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swMesstingZoomVo), "一个流程只能审核通过一次");
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), "一个流程只能审核通过一次");
        }catch(SwException e){
            log.error("【添加会议室云枢调用出现异常】,参数${}$,异常${}$",JSONObject.toJSONString(swMesstingZoomVo),e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【添加会议室接口调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swMesstingZoomVo), ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

  //添加会议室
/*  @ApiOperation("创建会议室")
  @RequestMapping(value = "/create", method = RequestMethod.POST)
  @ResponseBody
  public ResponseResult create(@Valid @RequestBody SwMesstingZoomDto swMesstingZoomDto, BindingResult bindingResult){
        try{
            ValidUtils.bindvaild(bindingResult);
            swMeetingZoomService.create(swMesstingZoomDto);
        }catch(DuplicateKeyException e) {
            log.error("【添加会议室云枢调用出现异常】,参数${}$,异常${}$", JSONObject.valueToString(swMesstingZoomDto), "一个流程只能审核通过一次");
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), "一个流程只能审核通过一次");
        }catch(SwException e){
            log.error("【添加会议室云枢调用出现异常】,参数${}$,异常${}$",JSONObject.valueToString(swMesstingZoomDto),e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【添加会议室接口调用出现异常】,参数${}$,异常${}$", JSONObject.valueToString(swMesstingZoomDto), ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
        }*/




    //会议室列表
    @GetMapping("/MeetingZoomList")
    public ResponseResult<SwPageVo<SwMeetingZoomListVo>> MeetingZoomList(@RequestParam Integer page, @RequestParam Integer size)
    {
        SwPageVo<SwMeetingZoomListVo> res=null;
        String userId="";
        try
        {
            BaseSwQueryModel queryModel=new BaseSwQueryModel();
            queryModel.setPage(page);
            queryModel.setSize(size);
            res=swMeetingZoomService.meetingZoomList(queryModel);
            return this.getOkResponseResult(res,"查询成功");
        }catch(SwException e)
        {
             return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e){
            log.error("【获取会议室】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }


    //会议室删除按钮
    @ApiOperation(
            value ="取消会议室",
            notes = "取消会议室"
    )
    @PostMapping("/MeetingZoomUpdate")
    public ResponseResult MeetingZoomUpdate(@Valid @RequestBody SwMeetingZoomupdateDO swMeetingZoomupdateDO, BindingResult bindingResult){
        try
        {
            ValidUtils.bindvaild(bindingResult);
            if(swMeetingZoomupdateDO.getIds().size()==0)
            {
                throw new SwException("请至少选择一个会议室取消");
            }

            swMeetingZoomupdateDO.setUserId(getUserId());
            swMeetingZoomService.MeetingZoomUpdate(swMeetingZoomupdateDO);
            return this.getOkResponseResult("操作成功");
        }catch (SwException e)
        {
            log.error("【取消会议】接口参数校验出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMeetingZoomupdateDO), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【取消会议】接口出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMeetingZoomupdateDO),ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    /***
     * 查询会议室详情列表
     * @return
     */
    @GetMapping("/SwMeetingZoomListUpdate")
    public ResponseResult<SwMeetingZoomListUpdateVo> meetingzoomListupdate(@RequestParam String meetingId )
    {
         SwMeetingZoomListUpdateVo res = new SwMeetingZoomListUpdateVo();
        try{
            res = swMeetingZoomService.meetingList(meetingId);
            return this.getOkResponseResult(res, "查询成功");
        }catch(SwException e)
        {
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【获取会议详情列表】接口出现异常，参数userId${}$,异常${}$", meetingId, ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }

    /***
     * 会议室列表编辑
     */
    @RequestMapping("/UpdateMeetingZoomEdit")
    public ResponseResult UpdateMeetingZoom(@RequestBody SwMeetingZoomListUpdateVo swMeetingZoomListUpdateVo, BindingResult bindingResult)
    {
        ValidUtils.bindvaild(bindingResult);
        try{
            swMeetingZoomService.updateMeetingZoom(swMeetingZoomListUpdateVo);
            return this.getOkResponseResult("修改成功");
        }catch(DuplicateKeyException e) {
            log.error("【修改会议室云枢调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swMeetingZoomListUpdateVo), "一个流程只能审核通过一次");
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), "一个流程只能审核通过一次");
        }catch(SwException e){
            log.error("【修改会议室云枢调用出现异常】,参数${}$,异常${}$",JSONObject.toJSONString(swMeetingZoomListUpdateVo),e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
        }catch(Exception e)
        {
            log.error("【修改会议室接口调用出现异常】,参数${}$,异常${}$", JSONObject.toJSONString(swMeetingZoomListUpdateVo), ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
        }
    }


    /***
     * 会议审批过后调用
     */
//    @ApiOperation(
//            value="流程审核后修改会议状态",
//            notes = "流程审核后修改会议状态"
//    )
//    @PostMapping("/updateMeetingzhouqi")
//    public ResponseResult updateMeeting(@Valid @RequestBody SwMeetingzhouqiDo swMeetingzhouqiDo,BindingResult bindingResult){
//          try
//          {
//              log.info("【会议审核过后调用】调用，参数${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMeetingzhouqiDo));
//              ValidUtils.bindvaild(bindingResult);
//
//              swMeetingZoomService
//              return this.getOkResponseResult("操作失败");
//          }catch(SwException e)
//          {
//              log.error("【会议审核过后调用】接口参数校验出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMeetingzhouqiDo),e.getMessage());
//              return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(),e.getMessage());
//          }catch (Exception e){
//              return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(),"操作失败");
//          }
//
//    }

    @ApiOperation(
            value = "流程审核后修改会议室状态",
            notes = "流程审核后修改会议室状态")
    @PostMapping("/updateMeetingZoom")
    public ResponseResult updateMeetingZoom(@Valid @RequestBody SwMesstingZoomDto swMesstingZoomDto, BindingResult bindingResult){
        try {
            log.info("【会议审核过后调用】调用，参数${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMesstingZoomDto));

            ValidUtils.bindvaild(bindingResult);

            swMeetingZoomService.updateMeetingZoom(swMesstingZoomDto);
            return this.getOkResponseResult("操作成功");
        } catch (SwException e) {
            log.error("【会议审核过后调用】接口参数校验出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMesstingZoomDto), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【会议审核过后调用】接口出现异常，参数${}$,异常${}$", com.alibaba.fastjson.JSONObject.toJSONString(swMesstingZoomDto),ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }


}
