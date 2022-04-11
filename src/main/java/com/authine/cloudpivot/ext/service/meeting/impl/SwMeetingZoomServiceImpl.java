package com.authine.cloudpivot.ext.service.meeting.impl;

import com.authine.cloudpivot.engine.spi.FileStoreService;
import com.authine.cloudpivot.ext.constant.SwStatusConstant;
import com.authine.cloudpivot.ext.entity.*;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.BizWorkflowInstanceMapper;
import com.authine.cloudpivot.ext.mapper.HBizCommentMapper;
import com.authine.cloudpivot.ext.mapper.HOrgUserMapper;
import com.authine.cloudpivot.ext.mapper.SwMeetingZoomMapper;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.dto.MeetingDetailModel;
import com.authine.cloudpivot.ext.model.dto.SwMeetingZoomDto;
import com.authine.cloudpivot.ext.model.dto.SwMesstingZoomDto;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.meeting.SwMeetingZoomService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SwMeetingZoomServiceImpl implements SwMeetingZoomService {

@Resource
private SwMeetingZoomMapper swMeetingZoomMapper;
@Resource
private FileStoreService fileStoreService;
@Resource
private HOrgUserMapper hOrgUserMapper;
@Resource
private BizWorkflowInstanceMapper bizWorkflowInstanceMapper;
    @Resource
    private HBizCommentMapper hBizCommentMapper;
//新建会议室
/*@Transactional
@Override
public SwMeetingZoomResult addMeetingZoom(SwMesstingZoomVo SwMesstingZoomVo) {

    //检查创建用户是否存在
    HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swMesstingZoomVo.getCreater());
    if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
        throw new SwException("该创建者没有查到");
    }
    //检查会议室是否存在
    SwMeetingZoom swz = swMeetingZoomMapper.selectByPrimaryKey(swMesstingZoomVo.getTranNo());
    if(swz!=null
    ){
        throw new SwException("会议室无法创建");
    }

        SwMeetingZoom swMeetingZoom= BeanCopyUtils.coypToClass(swMesstingZoomVo,SwMeetingZoom.class,null);
        Date date=new Date();
       swMeetingZoom.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
       swMeetingZoom.setCreateName(hOrgUser.getName());
       swMeetingZoom.setTranNo(IdUtils.getId());

    swMeetingZoomMapper.insert(swMeetingZoom);

        SwMeetingZoomResult swMeetingZoomResult=new SwMeetingZoomResult();
        swMeetingZoomResult.setTranNo(swMeetingZoom.getTranNo());
        return swMeetingZoomResult;
        }*/

    @Transactional
    @Override
    public SwMeetingResult addMeetingZoom(SwMesstingZoomVo SwMesstingZoomVo) {

        //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(SwMesstingZoomVo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }



        //属性copy
        SwMeetingZoom swMeetingZoom = BeanCopyUtils.coypToClass(SwMesstingZoomVo, SwMeetingZoom.class, null);
        Date date = new Date();
        swMeetingZoom.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
        swMeetingZoom.setCreateName(hOrgUser.getName());

        swMeetingZoom.setCreateTime(date);
        swMeetingZoom.setUpdateTime(date);
        swMeetingZoom.setId(IdUtils.getId());
        swMeetingZoom.setTranNo(IdUtils.getId());
        swMeetingZoom.setAddress(SwMesstingZoomVo.getAddress());
        swMeetingZoom.setYsReult(SwMesstingZoomVo.getYsReult());
       // swMeetingZoom.setWorkflowInstance(SwMesstingZoomVo.getWorkflowInstance());
        swMeetingZoom.setDeleted(SwMesstingZoomVo.getDeleted());
        swMeetingZoom.setMeetingAdmin(SwMesstingZoomVo.getMeetingadmin());
        swMeetingZoom.setSequeceNo(SwMesstingZoomVo.getSequeceno());
        swMeetingZoom.setIsDisabled(SwMesstingZoomVo.getIsdisabled());
        swMeetingZoom.setYsReult(SwMesstingZoomVo.getYsReult());
        //swMeetingZoom.setBizObjectId(SwMesstingZoomVo.getBizObjectId());
        swMeetingZoom.setIfCheck(SwMesstingZoomVo.getIfcheck());
        swMeetingZoom.setPeopleNum(SwMesstingZoomVo.getPeoplenum());
        swMeetingZoom.setOrganization(SwMesstingZoomVo.getOrganization());
        swMeetingZoom.setMeetingType(SwMesstingZoomVo.getMeetingtype());
        swMeetingZoom.setSlot(SwMesstingZoomVo.getSlot());
        swMeetingZoom.setMeetingName(SwMesstingZoomVo.getMeetingname());
        swMeetingZoomMapper.insert(swMeetingZoom);

        SwMeetingResult swMeetingResult=new SwMeetingResult();
        swMeetingResult.setTranNo(swMeetingZoom.getTranNo());
        return swMeetingResult;
    }
/***
 * 会议室列表
 * @param query
 * @return
 */
@Override
public SwPageVo<SwMeetingZoomListVo> meetingZoomList(BaseSwQueryModel query) {
        //开始分页
        PageHelper.startPage(query.getPage(), query.getSize());
        List<SwMeetingZoomListVo> swMeetingZoomListVos=swMeetingZoomMapper.meetingZoomList();
        //获取分页结果
        PageInfo<SwMeetingZoomListVo> pageInfo=new PageInfo<>(swMeetingZoomListVos);
        //封装分页信息
        SwPageVo<SwMeetingZoomListVo> pageVo=new SwPageVo<SwMeetingZoomListVo>(pageInfo);
        return pageVo;
        }

//会议室列表删除
@Transactional
@Override
public void MeetingZoomUpdate(SwMeetingZoomupdateDO swMeetingZoomupdateDO) {
    List<String> ids=swMeetingZoomupdateDO.getIds();
    for(String id:ids)
    {
        SwMeetingZoom swMeetingZoom = new SwMeetingZoom();
        swMeetingZoom.setUpdater(swMeetingZoomupdateDO.getUserId());
        swMeetingZoom.setDeleted(new Byte("1"));
        swMeetingZoom.setIfCheck(new Byte("-1"));
        swMeetingZoom.setIsDisabled(new Byte("-1"));
        SwMeetingZoomCriteria example = new SwMeetingZoomCriteria();
        example.createCriteria()
                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                .andIdEqualTo(id)
//       .andDeletedEqualTo(new Byte("1"));
                .andIfCheckEqualTo(new Byte("1"));
        swMeetingZoomMapper.updateByExampleSelective(swMeetingZoom,example);
    }
}

//会议室列表查询
@Override
public SwMeetingZoomListUpdateVo meetingList(String meetingId) {
        SwMeetingZoom swMeetingZoom=swMeetingZoomMapper.selectByPrimaryKey(meetingId);
        if(swMeetingZoom==null || DeleteFlagEnum.DELETE.getCode().equals(swMeetingZoom.getDeleted()))
        {
            throw new SwException("没有查到该会议");
        }
       SwMeetingZoomListUpdateVo swMeetingZoomListUpdateVo=BeanCopyUtils.coypToClass(swMeetingZoom,SwMeetingZoomListUpdateVo.class,null);

        List<SwMeetingZoomDto> users=swMeetingZoomMapper.selectMeetingZoom(swMeetingZoom.getId());
        String joinUsers="";
        for(SwMeetingZoomDto user:users){
            joinUsers=joinUsers+user.getMeetingname()+",";
        }
        if(StringUtils.isNotBlank(joinUsers))
        {
            joinUsers=joinUsers.substring(0,joinUsers.length()-1);
        }
        swMeetingZoomListUpdateVo.setJoinUser(joinUsers);
        swMeetingZoomListUpdateVo.setMeetingname(swMeetingZoom.getMeetingName());
        swMeetingZoomListUpdateVo.setMeetingadminname(swMeetingZoom.getMeetingAdminName());
        swMeetingZoomListUpdateVo.setMeetingtype(swMeetingZoom.getMeetingType());
        swMeetingZoomListUpdateVo.setCreatename(swMeetingZoom.getCreateName());
        return swMeetingZoomListUpdateVo;
        }

    @Override
    public void create(SwMesstingZoomDto swMesstingZoomDto) {

    }
   /* @Transactional
    @Override
    public void updateMeetingZoom(SwMesstingZoomDto swMesstingZoomDto) {
        SwMeetingZoom swMeetingZoom=new SwMeetingZoom();

        BizWorkflowInstanceCriteria example= new BizWorkflowInstanceCriteria();
        example.createCriteria()
                .andSequencenoEqualTo(swMesstingZoomDto.getSequeceNo());
        List<BizWorkflowInstance> bizWorkflowInstances = bizWorkflowInstanceMapper.selectByExample(example);
          if(bizWorkflowInstances.size()>0){
              BizWorkflowInstance bizWorkflowInstance =bizWorkflowInstances.get(0);

              HBizCommentCriteria comex=new HBizCommentCriteria();
              comex.setOrderByClause("createdTime desc");
              comex.createCriteria().andWorkflowinstanceidEqualTo(bizWorkflowInstance.getId())
                                    .andActivitynameEqualTo("审批");

              swMeetingZoom.setSequeceNo(swMesstingZoomDto.getSequeceNo());
              swMeetingZoom.setTranNo(swMesstingZoomDto.getTranNo());
              swMeetingZoom.setUpdateTime(new Date());
              if(StringUtils.isNotBlank(swMesstingZoomDto.getWorkflowInstance())){
                  swMeetingZoom.setWorkflowInstance(swMesstingZoomDto.getWorkflowInstance());
              }
              if(StringUtils.isNotBlank(swMesstingZoomDto.getBizObjectId())){
                  swMeetingZoom.setBizObjectId(swMesstingZoomDto.getBizObjectId());
              }


              swMeetingZoom.setYsReult(swMesstingZoomDto.getYsReult());

              SwMeetingZoomCriteria exapmle=new SwMeetingZoomCriteria();
              exapmle
                      .createCriteria()
                      .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                      .andTranNoEqualTo(swMesstingZoomDto.getTranNo());
              int i=swMeetingZoomMapper.updateByExampleSelective(swMeetingZoom,exapmle);
              return;


          }


    }*/


    @Transactional
    @Override
    public void updateMeetingZoom(SwMesstingZoomDto swMesstingZoomDto) {
        SwMeetingZoom swMeetingZoom=new SwMeetingZoom();

        //根据单据号查审核信息
        BizWorkflowInstanceCriteria exapmle=new BizWorkflowInstanceCriteria();
        exapmle.createCriteria()
                .andSequencenoEqualTo(swMesstingZoomDto.getSequeceNo());
        List<BizWorkflowInstance> bizWorkflowInstances = bizWorkflowInstanceMapper.selectByExample(exapmle);
        String auditMsg="";
        if(bizWorkflowInstances.size()>0){
            BizWorkflowInstance bizWorkflowInstance = bizWorkflowInstances.get(0);

            HBizCommentCriteria comex=new HBizCommentCriteria();
            comex.setOrderByClause("createdTime desc");
            comex.createCriteria().andWorkflowinstanceidEqualTo(bizWorkflowInstance.getId())
                    .andActivitynameEqualTo("审批");

           /* List<HBizComment> hBizComments = hBizCommentMapper.selectByExample(comex);
            if(hBizComments.size()>0){
                auditMsg=hBizComments.get(0).getContent();
            }*/

        }

        swMeetingZoom.setSequeceNo(swMesstingZoomDto.getSequeceNo());
        swMeetingZoom.setTranNo(swMesstingZoomDto.getTranNo());
        swMeetingZoom.setUpdateTime(new Date());
/*
        swMeetingZoom.setAuidtMsg(auditMsg);
*/
        if(StringUtils.isNotBlank(swMesstingZoomDto.getWorkflowInstance())){
            swMeetingZoom.setWorkflowInstance(swMesstingZoomDto.getWorkflowInstance());
        }
        if(StringUtils.isNotBlank(swMesstingZoomDto.getBizObjectId())){
            swMeetingZoom.setBizObjectId(swMesstingZoomDto.getBizObjectId());

        }

        swMeetingZoom.setYsReult(swMesstingZoomDto.getYsReult());
//        swMeeting.setSequeceNo(swMeetingAuditDo.getState());
//        swMeeting.setAuidtMsg(swMeetingAuditDo.getAuditMsg());
//        swMeeting.setMeetingStatus(getAuditStatus(swMeetingAuditDo.getState()));
//        swMeeting.setMeetingStatus(getAuditStatus(swMeetingAuditDo.getState()));
 //       swMeetingZoom.setYsReult(swMesstingZoomDto.getState());
        SwMeetingZoomCriteria example=new SwMeetingZoomCriteria();
        example
                .createCriteria()
                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                .andTranNoEqualTo(swMesstingZoomDto.getTranNo());
        int i = swMeetingZoomMapper.updateByExampleSelective(swMeetingZoom,example);
        return;



    }

    //编辑会议室
    @Override
    public void updateMeetingZoom(SwMeetingZoomListUpdateVo swMeetingZoomListUpdateVo) {
        swMeetingZoomMapper.updateMeetingZoom(swMeetingZoomListUpdateVo);
    }
}

