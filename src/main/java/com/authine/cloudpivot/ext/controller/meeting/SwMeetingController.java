package com.authine.cloudpivot.ext.controller.meeting;

import com.alibaba.fastjson.JSONObject;

import com.authine.cloudpivot.engine.domain.Client;
import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.engine.service.SystemSetting.impl.ClientServiceImpl;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwCycleMeetingDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingAuditDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingCancleDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingDo;
import com.authine.cloudpivot.ext.model.vo.SwCanUserMeetingZoom;
import com.authine.cloudpivot.ext.model.vo.SwMeetingDetailVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingListVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingResult;
import com.authine.cloudpivot.ext.service.meeting.SwMeetingService;
import com.authine.cloudpivot.ext.utils.ValidUtils;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName SwMeetingController
 * Description
 * Create by gfy
 * Date 2022/3/1 13:39
 */
@Api(
        tags = {"运行时::会议管理"}
)
@RestController
@RequestMapping("/api/meeting")
@Slf4j
public class SwMeetingController extends SwBaseController {

    @Resource
    private SwMeetingService swMeetingService;

    @Resource
    private ClientServiceImpl clientService;
    /**
     * 普通会议新建的接口 新建会议审核前就调用
     *
     * @param swMeetingDo
     * @param bindingResult
     * @return
     */

    @ApiOperation(
            value = "新建会议",
            notes = "新建会议"
    )
    @PostMapping("/addMeeting")
    public ResponseResult<SwMeetingResult> addMeeting(@Valid @RequestBody SwMeetingDo swMeetingDo, BindingResult bindingResult) {
        SwMeetingResult res = null;
        try {

            ValidUtils.bindvaild(bindingResult);
            //结束时间必须大于开始时间
            if (swMeetingDo.getMeetingEndtime().getTime() <= swMeetingDo.getMeetingStarttime().getTime()) {
                throw new SwException("会议开始时间必须大于结束时间");
            }
//            AdminModel dataManaerByUserId = getDataManaerByUserId(swMeetingDo.getCreater());


            res = swMeetingService.addMeeting(swMeetingDo);

            return this.getOkResponseResult(res, "添加成功");


        } catch (SwException e) {
            log.error("【新建会议】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swMeetingDo), e.getMessage());
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【新建会议】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swMeetingDo),ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }


    /**
     * 会议审核过后调用
     *
     * @param swMeetingAuditDo
     * @param bindingResult
     * @return
     */

    @ApiOperation(
            value = "流程审核后修改会议状态",
            notes = "流程审核后修改会议状态"
    )
    @PostMapping("/updateMeeting")
    public ResponseResult updateMeeting(@Valid @RequestBody SwMeetingAuditDo swMeetingAuditDo, BindingResult bindingResult) {
        try {
            log.info("【会议审核过后调用】调用，参数${}$", JSONObject.toJSONString(swMeetingAuditDo));

            ValidUtils.bindvaild(bindingResult);

//            AdminModel dataManaerByUserId = getDataManaerByUserId(swMeetingDo.getCreater());


            swMeetingService.updateMeeting(swMeetingAuditDo);

            return this.getOkResponseResult("操作成功");


        } catch (SwException e) {
            log.error("【会议审核过后调用】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swMeetingAuditDo), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【会议审核过后调用】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swMeetingAuditDo),ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }
    /**
     * 取消会议
     *
     * @param
     * @param bindingResult
     * @return
     */

    @ApiOperation(
            value = "取消会议",
            notes = "取消会议"
    )
    @PostMapping("/cancleMeeting")
    public ResponseResult cancleMeeting(@Valid @RequestBody SwMeetingCancleDo swMeetingCancleDo, BindingResult bindingResult) {
        try {
//            log.info("【会议审核过后调用】调用，参数${}$", JSONObject.toJSONString(swMeetingAuditDo));

            ValidUtils.bindvaild(bindingResult);

            if(swMeetingCancleDo.getIds().size()==0){
                throw new SwException("请至少选择一个会议取消");
            }

//            AdminModel dataManaerByUserId = getDataManaerByUserId(swMeetingDo.getCreater());

            swMeetingCancleDo.setUserId(getUserId());
            swMeetingService.cancleMeeting(swMeetingCancleDo);

            return this.getOkResponseResult("操作成功");


        } catch (SwException e) {
            log.error("【取消会议】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swMeetingCancleDo), e.getMessage());
            return this.getErrResponseResult(ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【取消会议】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swMeetingCancleDo),ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }
    /**
     * 获取可用的会议室
     *
     * @return
     */

    @ApiOperation(
            value = "获取可用的会议室",
            notes = "获取可用的会议室"
    )
    @GetMapping("/meetingZooms")
    public ResponseResult<List<SwCanUserMeetingZoom>> meetingZooms() {
        List<SwCanUserMeetingZoom> list = new ArrayList<>();
        try {

            list = swMeetingService.meetingZooms();
            return this.getOkResponseResult(list, "操作成功");
        } catch (SwException e) {
            log.error("【获取可用的会议室】接口参数校验出现异常，异常${}$", e.getMessage());
            return this.getErrResponseResult(list, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【获取可用的会议室】接口出现异常,异常${}$", ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(list, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }


    /**
     * @param swCycleMeetingDo
     * @param bindingResult
     * @return
     */

    @ApiOperation(
            value = "新建周期会议",
            notes = "新建周期会议"
    )
    @PostMapping("/addCycleMeeting")
    public ResponseResult<SwMeetingResult> addCycleMeeting(@Valid @RequestBody SwCycleMeetingDo swCycleMeetingDo, BindingResult bindingResult) {
        SwMeetingResult res = null;
        try {

            ValidUtils.bindvaild(bindingResult);

//            AdminModel dataManaerByUserId = getDataManaerByUserId(swMeetingDo.getCreater());

            conversionTime(swCycleMeetingDo);


            res = swMeetingService.addCycleMeeting(swCycleMeetingDo);

            return this.getOkResponseResult(res, "添加成功");


        } catch (DateTimeParseException e){
            log.error("【新建周期会议】接口参数时间转换异常出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swCycleMeetingDo), ExceptionUtils.getStackTrace(e));
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), "时间格式错误，时间格式为 00:00");
        }catch (SwException e) {
            log.error("【新建周期会议】接口参数校验出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swCycleMeetingDo), e.getMessage());
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e) {
            log.error("【新建周期会议】接口出现异常，参数${}$,异常${}$", JSONObject.toJSONString(swCycleMeetingDo), ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }

    }

    private void conversionTime(SwCycleMeetingDo swCycleMeetingDo) {
         String cycleStartTime = swCycleMeetingDo.getCycleStartTime();
         String cycleEndTime = swCycleMeetingDo.getCycleEndTime();

        LocalTime parseStart = LocalTime.parse(cycleStartTime);
        LocalTime parseEnd = LocalTime.parse(cycleEndTime);
        int starthour = parseStart.getHour();

        int startminute = parseStart.getMinute();

        int startsecond = parseStart.getSecond();
        long timestart =  starthour * 3600000 + startminute * 60000 + startsecond * 1000;

        int endhour = parseEnd.getHour();

        int endminute = parseEnd.getMinute();

        int endsecond = parseEnd.getSecond();
        long timeEnd =  endhour * 3600000 + endminute * 60000 + endsecond * 1000;

        swCycleMeetingDo.setCycleStartTimeParam(timestart);
        swCycleMeetingDo.setCycleEndTimeParam(timeEnd);



    }

    public static void main(String[] args) {
        String time = "12:00";
        LocalTime parse = LocalTime.parse(time);
        int hour = parse.getHour();

        int minute = parse.getMinute();

        int second = parse.getSecond();

//        Date date = TimeUtil.parseByStr("2022-03-07 00:00:00");
//        long time1 = date.getTime() + hour * 3600000 + minute * 60000 + second * 1000;
//        String simpleTime = TimeUtil.getSimpleTime(new Date(time1));
//        System.out.println(simpleTime);

//        String reg="([0-9]|[1-5][0-9]|59)";
//        Pattern patRule = Pattern.compile(reg);
//// 校验结果
//        boolean matches = patRule.matcher("12:00").matches();
//        System.out.println(matches);

    }


    /**
     * 获取已开的会议
     * @return
     */

    @GetMapping("/openMeetingList")
    public ResponseResult<SwPageVo<SwMeetingListVo>> openMeetingList(@RequestParam Integer page, @RequestParam Integer size){
        SwPageVo<SwMeetingListVo> res=null;
        String userId="";
        try{
//            userId = getUserId();
//            if(StringUtils.isBlank(userId)){
//                throw new SwException("没有查到用户信息");
//            }
//            List<AdminModel> userAdminList = getUserAdminList(userId);;
//            if(userAdminList.size()==0){
//                throw new SwException("没有查到用户角色信息");
//
//            }

            BaseSwQueryModel query=new BaseSwQueryModel();

            query.setPage(page);
            query.setSize(size);
            res= swMeetingService.openMeetingList(query);
            return this.getOkResponseResult(res, "查询成功");

        }catch (SwException e){
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e){
            log.error("【获取已开的会议】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }


    /**
     * 获取未开的会议
     * @return
     */

    @GetMapping("/noopenMeetingList")
    public ResponseResult<SwPageVo<SwMeetingListVo>> noopenMeetingList(@RequestParam Integer page, @RequestParam Integer size){
        SwPageVo<SwMeetingListVo> res=null;
        String userId="";
        try{
//            userId = getUserId();
//            if(StringUtils.isBlank(userId)){
//                throw new SwException("没有查到用户信息");
//            }
//            List<AdminModel> userAdminList = getUserAdminList(userId);;
//            if(userAdminList.size()==0){
//                throw new SwException("没有查到用户角色信息");
//
//            }

            BaseSwQueryModel query=new BaseSwQueryModel();

            query.setPage(page);
            query.setSize(size);
            res= swMeetingService.noopenMeetingList(query);
            return this.getOkResponseResult(res, "查询成功");

        }catch (SwException e){
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e){
            log.error("【获取未开的会议】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }

    /**
     * 获取会议详情
     * @return
     */

    @GetMapping("/swMeetingDetail")
    public ResponseResult<SwMeetingDetailVo> swMeetingDetail(@RequestParam String meetingId){
        SwMeetingDetailVo res=new SwMeetingDetailVo();
            try {
                res= swMeetingService.swMeetingDetail(meetingId);
                return this.getOkResponseResult(res, "查询成功");
            }catch (SwException e){
                return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

            } catch (Exception e){
                log.error("【获取未开的会议】接口出现异常，参数meetingId${}$,异常${}$", meetingId, ExceptionUtils.getStackTrace(e));

                return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
            }

    }


    /**
     * 获取会议详情
     * @return
     */

    @GetMapping("/testException")
    public ResponseResult<SwMeetingDetailVo> swMeetingDetail(){
        int i=1/0;
        return null;
    }


    @GetMapping("/mdCache/{time}")
    public String mdCache(@PathVariable Integer time){
        Client api = clientService.getByClientId("api");
        api.setAccessTokenValiditySeconds(time);
        api.setRefreshTokenValiditySeconds(time);
        clientService.update(api);
        return "suuccess";

    }

}
