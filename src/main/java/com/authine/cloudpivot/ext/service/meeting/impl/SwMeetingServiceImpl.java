package com.authine.cloudpivot.ext.service.meeting.impl;

import com.authine.cloudpivot.engine.api.model.system.AdminModel;
import com.authine.cloudpivot.engine.enums.status.WorkflowInstanceStatus;
import com.authine.cloudpivot.engine.enums.status.WorkflowTokenStatus;
import com.authine.cloudpivot.engine.enums.type.AdminType;
import com.authine.cloudpivot.ext.constant.SwStatusConstant;
import com.authine.cloudpivot.ext.entity.*;

import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.enums.MeetingDateEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.*;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwCycleMeetingDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingAuditDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingCancleDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingDo;
import com.authine.cloudpivot.ext.model.dto.MeetingDateModel;
import com.authine.cloudpivot.ext.model.dto.MeetingDetailModel;
import com.authine.cloudpivot.ext.model.dto.SwMeetingUserDto;
import com.authine.cloudpivot.ext.model.vo.*;

import com.authine.cloudpivot.ext.service.meeting.SwMeetingService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import com.authine.cloudpivot.ext.utils.TimeUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
//import com.sun.org.apache.bcel.internal.generic.NEW;
import jodd.datetime.TimeZoneUtil;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.validation.constraints.NotNull;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ClassName SwMeetingServiceImpl
 * Description
 * Create by gfy
 * Date 2022/3/1 14:10
 */
@Service
public class SwMeetingServiceImpl implements SwMeetingService {

    @Resource
    private SwMeetingMapper swMeetingMapper;

    @Resource
    private SwMeetingZoomMapper swMeetingZoomMapper;

    @Resource
    private SwMeetingUserRelMapper swMeetingUserRelMapper;


    @Resource
    private SwMeetingCycleRuleMapper swMeetingCycleRuleMapper;

    @Resource
    private SwMeetingDetailMapper swMeetingDetailMapper;

    @Resource
    private HOrgUserMapper hOrgUserMapper;

    @Resource
    private BizWorkflowInstanceMapper bizWorkflowInstanceMapper;
    @Resource
    private HBizCommentMapper hBizCommentMapper;

    @Resource
    private SwMeetingCloseLogMapper swMeetingCloseLogMapper;

    @Transactional
    @Override
    public SwMeetingResult addMeeting(SwMeetingDo swMeetingDo) {
        //todo 会议室加锁

        //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swMeetingDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }

        //检查会议室是否可用
        SwMeetingZoom swMeetingZoom = swMeetingZoomMapper.selectByPrimaryKey(swMeetingDo.getSwMeetingZoomId());
        if(swMeetingZoom==null ||
                DeleteFlagEnum.DELETE.getCode().equals(swMeetingZoom.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swMeetingZoom.getIsDisabled())
        ){
            throw new SwException("会议室无法使用");
        }

        //检查是否有冲突的日期安排

        //这里尽量不要在数据库层面做太多的判断，所以只查出当天的会议然后再业务层进行时间判断

        List<SwMeeting> list= swMeetingMapper.selectMeetingsByTimeAndZoom(swMeetingDo);
        if(list.size()>0){
            throw new SwException("您预约的时间段该会议室已经有会议了!");
        }


        //属性copy
        SwMeeting swMeeting = BeanCopyUtils.coypToClass(swMeetingDo, SwMeeting.class, null);
        Date date = new Date();
        swMeeting.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
        swMeeting.setCreateName(hOrgUser.getName());

        swMeeting.setCreateTime(date);
        swMeeting.setUpdateTime(date);
        swMeeting.setMeetingStatus(new Byte("1"));
        swMeeting.setScheduleResult(swMeetingDo.getState());
        swMeeting.setType(SwStatusConstant.NEWMEETING);
        swMeeting.setId(IdUtils.getId());
        swMeeting.setZoomAdmin(swMeetingZoom.getMeetingAdmin());
        swMeeting.setTranNo(IdUtils.getId());
        swMeetingMapper.insert(swMeeting);

        //生成参与人员关联表
        SwMeetingUserRel rel = null;
        for (String joninUserId : swMeetingDo.getJoninUserIds()) {
            rel = new SwMeetingUserRel();
            rel.setCreateTime(date);
            rel.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
            rel.setId(IdUtils.getId());
            rel.setSwMeetingId(swMeeting.getId());
            rel.setUpdateTime(date);
            rel.setUserId(joninUserId);
            swMeetingUserRelMapper.insert(rel);

        }

        //生成会议详情
        for (MeetingDetailModel detail : swMeetingDo.getDetails()) {
            SwMeetingDetail swMeetingDetail = BeanCopyUtils.coypToClass(detail, SwMeetingDetail.class, null);
            swMeetingDetail.setId(IdUtils.getId());
            swMeetingDetail.setSwMeetingId(swMeeting.getId());
            swMeetingDetail.setCreateTime(date);
            swMeetingDetailMapper.insert(swMeetingDetail);
        }


        /**
         * public enum WorkflowInstanceStatus {
         *     DRAFT("草稿", 0),
         *     PROCESSING("进行中", 1),
         *     COMPLETED("已完成", 2),
         *     CANCELED("已作废", 3),
         *     EXCEPTION("异常", 4);
         *                     if (!wfInstance.getState().toString().equalsIgnoreCase(WorkflowTokenStatus.FINISHED.toString())) {
         */

        SwMeetingResult swMeetingResult=new SwMeetingResult();
        swMeetingResult.setTranNo(swMeeting.getTranNo());
        return swMeetingResult;
    }

    @Transactional
    @Override
    public void updateMeeting(SwMeetingAuditDo swMeetingAuditDo) {
        SwMeeting swMeeting=new SwMeeting();

        //根据单据号查审核信息
        BizWorkflowInstanceCriteria exapmle=new BizWorkflowInstanceCriteria();
        exapmle.createCriteria()
                .andSequencenoEqualTo(swMeetingAuditDo.getSequeceNo());
        List<BizWorkflowInstance> bizWorkflowInstances = bizWorkflowInstanceMapper.selectByExample(exapmle);
        String auditMsg="";
        if(bizWorkflowInstances.size()>0){
            BizWorkflowInstance bizWorkflowInstance = bizWorkflowInstances.get(0);

            HBizCommentCriteria comex=new HBizCommentCriteria();
            comex.setOrderByClause("createdTime desc");
            comex.createCriteria().andWorkflowinstanceidEqualTo(bizWorkflowInstance.getId())
                    .andActivitynameEqualTo("审批");

            List<HBizComment> hBizComments = hBizCommentMapper.selectByExample(comex);
            if(hBizComments.size()>0){
                auditMsg=hBizComments.get(0).getContent();
            }

        }

        swMeeting.setSequeceNo(swMeetingAuditDo.getSequeceNo());
        swMeeting.setTranNo(swMeetingAuditDo.getTranNo());
        swMeeting.setUpdateTime(new Date());
        swMeeting.setAuidtMsg(auditMsg);
        if(StringUtils.isNotBlank(swMeetingAuditDo.getWorkflowInstance())){
            swMeeting.setWorkflowInstance(swMeetingAuditDo.getWorkflowInstance());
        }
        if(StringUtils.isNotBlank(swMeetingAuditDo.getBizObjectId())){
            swMeeting.setBizObjectId(swMeetingAuditDo.getBizObjectId());

        }

        swMeeting.setMeetingStatus(swMeetingAuditDo.getStatus());
//        swMeeting.setSequeceNo(swMeetingAuditDo.getState());
//        swMeeting.setAuidtMsg(swMeetingAuditDo.getAuditMsg());
//        swMeeting.setMeetingStatus(getAuditStatus(swMeetingAuditDo.getState()));
//        swMeeting.setMeetingStatus(getAuditStatus(swMeetingAuditDo.getState()));
        swMeeting.setScheduleResult(swMeetingAuditDo.getState());
        SwMeetingCriteria example=new SwMeetingCriteria();
        example
                .createCriteria()
                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                .andTranNoEqualTo(swMeetingAuditDo.getTranNo());
        int i = swMeetingMapper.updateByExampleSelective(swMeeting, example);
        return;


    }

    @Override
    public List<SwCanUserMeetingZoom> meetingZooms() {
        List<SwCanUserMeetingZoom> res=new ArrayList<>();
        SwMeetingZoomCriteria example=new SwMeetingZoomCriteria();
        example.createCriteria()
                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                .andIsDisabledEqualTo(SwStatusConstant.CANUSE);
        List<SwMeetingZoom> swMeetingZooms = swMeetingZoomMapper.selectByExample(example);
        for (SwMeetingZoom swMeetingZoom : swMeetingZooms) {
            SwCanUserMeetingZoom swCanUserMeetingZoom = BeanCopyUtils.coypToClass(swMeetingZoom, SwCanUserMeetingZoom.class, null);
            swCanUserMeetingZoom.setZoomId(swMeetingZoom.getId());
            res.add(swCanUserMeetingZoom);
        }
        return res;

    }

    @Transactional
    @Override
    public SwMeetingResult addCycleMeeting(SwCycleMeetingDo swCycleMeetingDo) throws ParseException {

        //todo 会议室加锁

        //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swCycleMeetingDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }

        //检查会议室是否可用
        SwMeetingZoom swMeetingZoom = swMeetingZoomMapper.selectByPrimaryKey(swCycleMeetingDo.getSwMeetingZoomId());
        if(swMeetingZoom==null ||
                DeleteFlagEnum.DELETE.getCode().equals(swMeetingZoom.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swMeetingZoom.getIsDisabled())
        )
        {
            throw new SwException("会议室无法使用");
        }


        //检查是否有冲突的日期
        /**
         * 判断逻辑
         * 先查出周期开始日期和结束日期所有的会议
         * 生成这个周期所有会议时间段
         * 然后检查有没有交集的
         *
         */
        long timestart = swCycleMeetingDo.getCycleStartDate().getTime();
        long timeend = swCycleMeetingDo.getCycleEndDate().getTime()+86400000 ;

//        List<SwMeeting> list= swMeetingMapper.selectMeetingsByDateAndZoom(timestart,timeend);
        List<SwMeeting> list= swMeetingMapper.selectMeetingsByDateAndZoom(swCycleMeetingDo);
        List<MeetingDateModel> res=new ArrayList<>();
        //判断是否有交集的
        if(MeetingDateEnum.EVERY.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            //每天
            res=getEveryDayMeeting(swCycleMeetingDo);
        }else if(SwStatusConstant.MEIZHOU.equals(swCycleMeetingDo.getRate())){
            //每周
            //判断会议日期
            res=getWeekMeeting(swCycleMeetingDo);




        }else {
            //每月
            res=getMonthMeeting(swCycleMeetingDo);

        }
        if(list.size()>0){


            StringBuffer errorMsg=new StringBuffer("会议日期有重复，重复日期为：");
            int err=0;
            //结果遍历判断是否有交集的时间
            SimpleDateFormat sd=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            for (MeetingDateModel re : res) {
                Date startTime = re.getStartTime();
                Date endTime = re.getEndTime();
                for (SwMeeting swMeeting : list) {
                    if(TimeUtil.belongCalendar(startTime,swMeeting.getMeetingStarttime(),swMeeting.getMeetingEndtime())
                     || TimeUtil.belongCalendar(endTime,swMeeting.getMeetingStarttime(),swMeeting.getMeetingEndtime()) ){

                    }{
                        err=err+1;
                        errorMsg=errorMsg.append(sd.format(startTime)).append("-").append(sd.format(endTime));

                    }
                }

            }

            if(err>0){
                throw new SwException(errorMsg.toString());
            }

        }

        //进行入库操作
        //周期会议规则表
        Date date = new Date();
        SwMeetingCycleRule rule = BeanCopyUtils.coypToClass(swCycleMeetingDo, SwMeetingCycleRule.class, null);
        rule.setCreateTime(date);
        rule.setId(IdUtils.getId());
        rule.setUpdater(rule.getCreater());
        rule.setUpdateTime(date);

        swMeetingCycleRuleMapper.insert(rule);


        //会议表
        //参会人员关联表
        SwMeeting swMeeting=null;
        String tranNo=IdUtils.getId();
        for (MeetingDateModel re : res) {
             swMeeting = BeanCopyUtils.coypToClass(swCycleMeetingDo, SwMeeting.class, null);
            swMeeting.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
            swMeeting.setCreateName(hOrgUser.getName());
            swMeeting.setMeetingEndtime(re.getEndTime());
            swMeeting.setMeetingStarttime(re.getStartTime());
            swMeeting.setCreateTime(date);
            swMeeting.setUpdateTime(date);
            swMeeting.setMeetingStatus(new Byte("1"));
            swMeeting.setScheduleResult(swCycleMeetingDo.getState());
            swMeeting.setType(SwStatusConstant.CYCLEMEETING);
            swMeeting.setId(IdUtils.getId());
            swMeeting.setZoomAdmin(swMeetingZoom.getMeetingAdmin());
            swMeeting.setTranNo(tranNo);
            swMeeting.setSwMeetingCycleRuleId(rule.getId());
            swMeetingMapper.insert(swMeeting);
            //生成参与人员关联表
            SwMeetingUserRel rel = null;
            for (String joninUserId : swCycleMeetingDo.getJoninUserIds()) {
                rel = new SwMeetingUserRel();
                rel.setCreateTime(date);
                rel.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
                rel.setId(IdUtils.getId());
                rel.setSwMeetingId(swMeeting.getId());
                rel.setUpdateTime(date);
                rel.setUserId(joninUserId);
                swMeetingUserRelMapper.insert(rel);

            }
        }
        SwMeetingResult swMeetingResult=new SwMeetingResult();
        swMeetingResult.setTranNo(tranNo);
        return swMeetingResult;

    }

    /**
     * 会议日历查询
     * @param
     * @return
     */
    @Override
    public List<SwMeetingDateVo> meetingListByUser(String userId,List<AdminModel> userAdminList) {
        List<SwMeetingDateVo> list=new ArrayList<>();
        //如是超级管理员查全部 不是查参与的会议
        //查今天以后的
        Date dayEarlyTime = TimeUtil.getDayEarlyTime(new Date());
        if(userAdminList.size()>0 && AdminType.ADMIN.equals(userAdminList.get(0).getAdminType())){
            //查全部
            list= swMeetingMapper.selectBydateAndCompled(dayEarlyTime, WorkflowInstanceStatus.COMPLETED.toString());
        }else {
            //查参与的
            list= swMeetingMapper.selectBydateAndCompledUser(dayEarlyTime, WorkflowInstanceStatus.COMPLETED.toString(),userId);

        }


        return list;
    }

    @Override
    public SwPageVo<SwMeetingListVo> openMeetingList(BaseSwQueryModel query) {

        //已开过会议开始时间在当前时间之前的

        Date date=new Date();
        //开始分页
        PageHelper.startPage(query.getPage(), query.getSize());


        List<SwMeetingListVo> swGoodStudents = swMeetingMapper.openMeetingList(date);
        //获取分页结果
        PageInfo<SwMeetingListVo> pageInfo = new PageInfo<>(swGoodStudents);
        //封装分页信息
        SwPageVo<SwMeetingListVo> pageVO = new SwPageVo<SwMeetingListVo>(pageInfo);


        return pageVO;





    }

    @Override
    public SwPageVo<SwMeetingListVo> noopenMeetingList(BaseSwQueryModel query) {

        //已开过会议开始时间在当前时间之前的

        Date date=new Date();
        //开始分页
        PageHelper.startPage(query.getPage(), query.getSize());


        List<SwMeetingListVo> swGoodStudents = swMeetingMapper.noopenMeetingList(date);
        //获取分页结果
        PageInfo<SwMeetingListVo> pageInfo = new PageInfo<>(swGoodStudents);
        //封装分页信息
        SwPageVo<SwMeetingListVo> pageVO = new SwPageVo<SwMeetingListVo>(pageInfo);


        return pageVO;
    }

    @Transactional
    @Override
    public void cancleMeeting(SwMeetingCancleDo swMeetingCancleDo) {
        List<String> ids = swMeetingCancleDo.getIds();
        Date date=new Date();
        for (String id : ids) {
            SwMeeting swMeeting=new SwMeeting();
//            swMeeting.setId(id);
            swMeeting.setUpdater(swMeetingCancleDo.getUserId());
            swMeeting.setMeetingStatus(new Byte("2"));
            SwMeetingCriteria example=new SwMeetingCriteria();
            example.createCriteria()
                    .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                    .andIdEqualTo(id)
                    .andMeetingStatusEqualTo(new Byte("1"));
            int i = swMeetingMapper.updateByExampleSelective(swMeeting, example);

            // 插入取消会议日志
            if(i>0){
                SwMeetingCloseLog log=new SwMeetingCloseLog();
                log.setId(IdUtils.getId());
                log.setCreateTime(date);
                log.setSwMeetingId(id);
                log.setUserId(swMeetingCancleDo.getUserId());
                swMeetingCloseLogMapper.insert(log);
            }

        }





    }

    @Override
    public SwMeetingZoomCalenderVo meetingZoomCalender(String userId, List<AdminModel> userAdminList) {
            //审核中 未召开 进行中 已召开
        SwMeetingZoomCalenderVo res=new SwMeetingZoomCalenderVo();
        //查出所有的会议室
        SwMeetingZoomCriteria example=new SwMeetingZoomCriteria();
        example.createCriteria()
                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                .andIsDisabledEqualTo(SwStatusConstant.CANUSE);

        List<SwMeetingZoom> swMeetingZooms = swMeetingZoomMapper.selectByExample(example);
        SwCalenderResource resource=null;
        for (SwMeetingZoom swMeetingZoom : swMeetingZooms) {

             resource=new SwCalenderResource();
             resource.setId(swMeetingZoom.getId());
             resource.setMeetingName(swMeetingZoom.getMeetingName());
             res.getResources().add(resource);
        }
        List<SwMeeting> list=new ArrayList<>();
        if(userAdminList.size()>0 && AdminType.ADMIN.equals(userAdminList.get(0).getAdminType())){
            //查全部
            SwMeetingCriteria meetingex=new SwMeetingCriteria();
            meetingex.createCriteria()
                    .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode());

            list=swMeetingMapper.selectByExample(meetingex);

        }else {
            //查参与的
            list= swMeetingMapper.selectByUserId(userId);

        }
        Date date = new Date();

        SwCalenderEvents event=null;
        for (SwMeeting swMeeting : list) {
                event=new SwCalenderEvents();

                event.setColor(getEventColor(date,swMeeting.getScheduleResult(),swMeeting.getMeetingStarttime(),swMeeting.getMeetingEndtime()));
                event.setStart(swMeeting.getMeetingStarttime());
                event.setEnd(swMeeting.getMeetingEndtime());
                event.setResourceId(swMeeting.getSwMeetingZoomId());
                event.setId(swMeeting.getId());
                event.setTitle(swMeeting.getMeetingName());
                res.getCalendarEvents().add(event);

        }
        return res;

    }

    //会议详情
    @Override
    public SwMeetingDetailVo swMeetingDetail(String meetingId) {
        //检查会议是否存在
        SwMeeting swMeeting = swMeetingMapper.selectByPrimaryKey(meetingId);
        if(swMeeting==null || DeleteFlagEnum.DELETE.getCode().equals(swMeeting.getDeleted())){
            throw new SwException("没有查到该会议");
        }

        SwMeetingDetailVo swMeetingDetailVo = BeanCopyUtils.coypToClass(swMeeting, SwMeetingDetailVo.class, null);
        swMeetingDetailVo.setMeetingStartTime(swMeeting.getMeetingStarttime());
        swMeetingDetailVo.setMeetingEndTime(swMeeting.getMeetingEndtime());
        //查出参会人员
//        SwMeetingUserRelCriteria example=new SwMeetingUserRelCriteria();
//        example.createCriteria()
//                .andSwMeetingIdEqualTo(swMeeting.getId())
//                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode());
        List<SwMeetingUserDto> users = swMeetingUserRelMapper.selectUsersByMeetingId(swMeeting.getId());
        String joinUsers="";
        for (SwMeetingUserDto user : users) {
            joinUsers=joinUsers+user.getName()+",";


        }
        if(StringUtils.isNotBlank(joinUsers)){
            joinUsers=joinUsers.substring(0,joinUsers.length()-1);
        }
        swMeetingDetailVo.setJoinUser(joinUsers);
        return swMeetingDetailVo;
    }

    private String getEventColor(Date now, String scheduleResult,Date startTime,Date endTime) {

        //审核中 未召开 进行中 已召开
        if(StringUtils.isBlank(scheduleResult) || !WorkflowInstanceStatus.COMPLETED.toString().equals(scheduleResult)){
            //审核中

            return "#FFDD55";
        }else if(WorkflowInstanceStatus.COMPLETED.toString().equals(scheduleResult) && TimeUtil.belongCalendar(now,startTime,endTime)){
            //进行中
            return "#87CEEB";
        }else if(WorkflowInstanceStatus.COMPLETED.toString().equals(scheduleResult)  && now.getTime()<startTime.getTime()){
            //已召开
            return "#FFDD55";
        }else {
            //未召开
            return "#90EE90";
        }







    }

    private List<MeetingDateModel> getMonthMeeting(SwCycleMeetingDo swCycleMeetingDo) {
        List<MeetingDateModel> list=new ArrayList<>();

        int day=1;
        if(MeetingDateEnum.MONTH1.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=1;
        }else if(MeetingDateEnum.MONTH2.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=2;
        }else if(MeetingDateEnum.MONTH3.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=3;
        }else if(MeetingDateEnum.MONTH4.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=4;
        }else if(MeetingDateEnum.MONTH5.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=5;
        }else if(MeetingDateEnum.MONTH6.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=6;
        }else if(MeetingDateEnum.MONTH7.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=7;
        }else if(MeetingDateEnum.MONTH8.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=8;
        }else if(MeetingDateEnum.MONTH9.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=9;
        }else if(MeetingDateEnum.MONTH10.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=10;
        }else if(MeetingDateEnum.MONTH11.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=11;
        }else if(MeetingDateEnum.MONTH12.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=12;
        }else if(MeetingDateEnum.MONTH13.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=13;
        }else if(MeetingDateEnum.MONTH14.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=14;
        }else if(MeetingDateEnum.MONTH15.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=15;
        }else if(MeetingDateEnum.MONTH16.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=16;
        }else if(MeetingDateEnum.MONTH17.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=17;
        }else if(MeetingDateEnum.MONTH18.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=18;
        }else if(MeetingDateEnum.MONTH19.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=19;
        }else if(MeetingDateEnum.MONTH20.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=20;
        }else if(MeetingDateEnum.MONTH21.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=21;
        }else if(MeetingDateEnum.MONTH22.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=22;
        }else if(MeetingDateEnum.MONTH23.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=23;
        }else if(MeetingDateEnum.MONTH24.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=24;
        }else if(MeetingDateEnum.MONTH25.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=25;
        }else if(MeetingDateEnum.MONTH26.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=26;
        }else if(MeetingDateEnum.MONTH27.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=27;
        }else if(MeetingDateEnum.MONTH28.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=28;
        }else if(MeetingDateEnum.MONTH29.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=29;
        }else if(MeetingDateEnum.MONTH30.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=30;
        }else if(MeetingDateEnum.MONTH31.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            day=31;
        }
        Calendar calendar3=Calendar.getInstance();
        while (true){

            Date time = calendar3.getTime();
            Date cycleStartDate = swCycleMeetingDo.getCycleStartDate();
            Date cycleEndDate = swCycleMeetingDo.getCycleEndDate();
            Long startTime = swCycleMeetingDo.getCycleStartTimeParam();
            Long endTime = swCycleMeetingDo.getCycleEndTimeParam();
            MeetingDateModel model=null;
            if(time.getTime()>cycleEndDate.getTime()){
                break;
            }

            int maxCurrentMonthDay=calendar3.getActualMaximum(Calendar.DAY_OF_MONTH);
            calendar3.add(Calendar.DAY_OF_MONTH, maxCurrentMonthDay);
            if(maxCurrentMonthDay<day){
                continue;
            }

            calendar3.set(Calendar.DAY_OF_MONTH, day);
            Date meetingDate=calendar3.getTime();
            if(TimeUtil.belongCalendar(meetingDate,cycleStartDate,cycleEndDate)){
                model=new MeetingDateModel();
                model.setStartTime(new Date(meetingDate.getTime()+startTime));
                model.setEndTime(new Date(meetingDate.getTime()+endTime));
                list.add(model);
            }

        }
        return list;
    }

    private List<MeetingDateModel> getEveryDayMeeting(SwCycleMeetingDo swCycleMeetingDo) throws ParseException {

        List<MeetingDateModel> list=new ArrayList<>();
        Date cycleStartDate = swCycleMeetingDo.getCycleStartDate();
        Date cycleEndDate = swCycleMeetingDo.getCycleEndDate();
        Long startTime = swCycleMeetingDo.getCycleStartTimeParam();
        Long endTime = swCycleMeetingDo.getCycleEndTimeParam();
        Date meetingDate=TimeUtil.getDayEarlyTime(new Date());
        MeetingDateModel model=null;
        int i=0;
        while (meetingDate.getTime()<=cycleEndDate.getTime()){
            if(TimeUtil.belongCalendar(meetingDate,cycleStartDate,cycleEndDate)){
                model=new MeetingDateModel();
                model.setStartTime(new Date(meetingDate.getTime()+startTime));
                model.setEndTime(new Date(meetingDate.getTime()+endTime));
                list.add(model);
            }

            i=i+1;
            meetingDate= TimeUtil.setTilteMessageTime(i);

            }


        return list;
    }

    private List<MeetingDateModel> getWeekMeeting(SwCycleMeetingDo swCycleMeetingDo) {
        List<MeetingDateModel> list=new ArrayList<>();
        int deferDay=1;
        if(MeetingDateEnum.WEEk1.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=2;
        }else if(MeetingDateEnum.WEEk2.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=3;
        }else if(MeetingDateEnum.WEEk3.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=4;
        }else if(MeetingDateEnum.WEEk4.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=5;
        }else if(MeetingDateEnum.WEEk5.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=6;
        }else if(MeetingDateEnum.WEEk6.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=7;
        }else if(MeetingDateEnum.WEEk7.getCode().equals(swCycleMeetingDo.getMeetingDate())){
            deferDay=8;
        }
        int deferWeek=1;
         Date cycleStartDate = swCycleMeetingDo.getCycleStartDate();
         Date cycleEndDate = swCycleMeetingDo.getCycleEndDate();
        Long startTime = swCycleMeetingDo.getCycleStartTimeParam();
        Long endTime = swCycleMeetingDo.getCycleEndTimeParam();
        Date weekDate = TimeUtil.getWeekDate(deferWeek, deferDay);
        MeetingDateModel model=null;
        while (weekDate.getTime()<=cycleEndDate.getTime()){

            if(TimeUtil.belongCalendar(weekDate,cycleStartDate,cycleEndDate)){
                model=new MeetingDateModel();
                model.setStartTime(new Date(weekDate.getTime()+startTime));
                model.setEndTime(new Date(weekDate.getTime()+endTime));
                list.add(model);
            }
            deferWeek=deferWeek+1;
            weekDate= TimeUtil.getWeekDate(deferWeek, deferDay);
        }

        return list;

    }

    private Byte getAuditStatus(String state) {

        if (WorkflowInstanceStatus.COMPLETED.toString().equalsIgnoreCase(state ))
        {
            return 1;
        } else {
            return 2;
        }
    }
}
