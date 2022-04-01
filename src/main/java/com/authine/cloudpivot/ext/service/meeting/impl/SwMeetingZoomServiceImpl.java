package com.authine.cloudpivot.ext.service.meeting.impl;

import com.authine.cloudpivot.engine.spi.FileStoreService;
import com.authine.cloudpivot.ext.entity.SwMeetingZoom;
import com.authine.cloudpivot.ext.entity.SwMeetingZoomCriteria;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.SwMeetingZoomMapper;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.dto.SwMeetingZoomDto;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListUpdateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingZoomListVo;
import com.authine.cloudpivot.ext.model.vo.SwMesstingZoomVo;
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


//添加新建会议室
@Transactional
@Override
public void addMeetingZoom(SwMesstingZoomVo swMesstingZoomVo) {
        SwMeetingZoom swMeetingZoom= BeanCopyUtils.coypToClass(swMesstingZoomVo,SwMeetingZoom.class,null);
        Date date=new Date();
        swMeetingZoom.setId(IdUtils.getId());
        swMeetingZoom.setCreateTime(date);
        swMeetingZoom.setUpdateTime(date);
        swMeetingZoom.setAddress(swMesstingZoomVo.getAddress());
        swMeetingZoom.setMeetingAdminName(swMesstingZoomVo.getMeetingadminname());
        swMeetingZoom.setCreateName(swMesstingZoomVo.getCreatename());
        swMeetingZoom.setUpdater(swMesstingZoomVo.getCreater());
        swMeetingZoom.setOrganization(swMesstingZoomVo.getOrganization());
        swMeetingZoom.setMeetingName(swMesstingZoomVo.getMeetingname());
        swMeetingZoom.setMeetingType(swMesstingZoomVo.getMeetingtype());
        swMeetingZoom.setSlot(swMesstingZoomVo.getSlot());
        swMeetingZoom.setDevice(swMesstingZoomVo.getDevice());
        swMeetingZoom.setPeopleNum(swMesstingZoomVo.getPeoplenum());
        swMeetingZoom.setSequeceNo(swMesstingZoomVo.getSequeceno());
        swMeetingZoom.setIsDisabled(new Byte("1"));
        swMeetingZoom.setDeleted(new Byte("0"));
        swMeetingZoom.setIfCheck(new Byte("1"));
        swMeetingZoomMapper.insert(swMeetingZoom);
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
        Date date=new Date();
        for(String id:ids) {

        SwMeetingZoom swMeetingZoom = new SwMeetingZoom();
        swMeetingZoom.setId(id);
        swMeetingZoom.setUpdater(swMeetingZoomupdateDO.getUserId());
        swMeetingZoom.setDeleted(new Byte("1"));
        SwMeetingZoomCriteria example = new SwMeetingZoomCriteria();
        example.createCriteria()
        .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
        .andDeletedEqualTo(new Byte("0"));
        int i=swMeetingZoomMapper.updateByExampleSelective(swMeetingZoom,example);
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
   }
