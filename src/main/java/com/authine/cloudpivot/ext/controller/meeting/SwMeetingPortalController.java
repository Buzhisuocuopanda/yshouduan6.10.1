package com.authine.cloudpivot.ext.controller.meeting;

import com.authine.cloudpivot.engine.api.model.system.AdminModel;
import com.authine.cloudpivot.engine.enums.ErrCode;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.model.vo.SwMeetingDateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomCalenderVo;
import com.authine.cloudpivot.ext.service.meeting.SwMeetingService;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * ClassName SwMeetingPortalController
 * Description
 * Create by gfy
 * Date 2022/3/8 9:40
 */
@RestController
@Slf4j
@RequestMapping("/api/meetingpor")
public class SwMeetingPortalController extends SwBaseController {

    @Resource
    private SwMeetingService swMeetingService;



    /**
     * 获取会议日历
     * @return
     */
    @GetMapping("/meetingListByUser")
    public ResponseResult<List<SwMeetingDateVo>> meetingListByUser(){
        List<SwMeetingDateVo> res=new ArrayList<>();
        String userId="";
        try{
             userId = getUserId();
            if(StringUtils.isBlank(userId)){
                throw new SwException("没有查到用户信息");
            }
            List<AdminModel> userAdminList = getUserAdminList(userId);;
//            if(userAdminList.size()==0){
//                throw new SwException("没有查到用户角色信息");
//
//            }
            res= swMeetingService.meetingListByUser(userId,userAdminList);
            return this.getOkResponseResult(res, "查询成功");

        }catch (SwException e){
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e){
            log.error("【获取会议日历】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }





    /**
     * 获取会议室日程
     * @return
     */
    @GetMapping("/meetingZoomCalender")
    public ResponseResult<SwMeetingZoomCalenderVo> meetingZoomCalender(){
        SwMeetingZoomCalenderVo res=new SwMeetingZoomCalenderVo();
        String userId="";
        try{
            userId = getUserId();
            if(StringUtils.isBlank(userId)){
                throw new SwException("没有查到用户信息");
            }
            List<AdminModel> userAdminList = getUserAdminList(userId);;
//            if(userAdminList.size()==0){
//                throw new SwException("没有查到用户角色信息");
//
//            }
            res= swMeetingService.meetingZoomCalender(userId,userAdminList);
            return this.getOkResponseResult(res, "查询成功");

        }catch (SwException e){
            return this.getErrResponseResult(res, ErrCode.SYS_PARAMETER_ERROR.getErrCode(), e.getMessage());

        } catch (Exception e){
            log.error("【获取会议室日程】接口出现异常，参数userId${}$,异常${}$", userId, ExceptionUtils.getStackTrace(e));

            return this.getErrResponseResult(res, ErrCode.UNKNOW_ERROR.getErrCode(), "操作失败");
        }
    }


}
