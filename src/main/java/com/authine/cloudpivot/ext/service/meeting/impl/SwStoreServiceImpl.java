package com.authine.cloudpivot.ext.service.meeting.impl;

import com.authine.cloudpivot.ext.entity.HOrgUser;
import com.authine.cloudpivot.ext.entity.SwStore;
import com.authine.cloudpivot.ext.entity.SwStoreCriteria;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.HOrgUserMapper;
import com.authine.cloudpivot.ext.mapper.SwStoreMapper;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwStoreupdateDo;
import com.authine.cloudpivot.ext.model.dto.SwStoreListUpdateDto;
import com.authine.cloudpivot.ext.model.dto.SwStoreckUpdateDto;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.meeting.SwStoreService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class SwStoreServiceImpl implements SwStoreService {
    @Resource
    private SwStoreMapper swStoreMapper;

    @Resource
    private HOrgUserMapper hOrgUserMapper;

    //新建仓库
    @Transactional
    @Override
    public SwMeetingZoomResult addSwStore(SwStoreVo swStoreVo) {

        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swStoreVo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }
        //检查会议室是否可用
        SwStore swz = swStoreMapper.selectByPrimaryKey(swStoreVo.getTranno());
        if(swz!=null){
            throw new SwException("仓库无法创建");
        }

        SwStore swStore= BeanCopyUtils.coypToClass(swStoreVo,SwStore.class,null);
        Date date=new Date();
        swStore.setId(IdUtils.getId());
        swStore.setCreateTime(date);
        swStore.setUpdateTime(date);
        swStore.setUpdater(swStoreVo.getCreater());
        swStore.setDeleted(new Byte("0"));
        swStore.setYsResult(swStoreVo.getYsresult());
        swStore.setTranNo(swStoreVo.getTranno());
        swStore.setBizObjectId(swStoreVo.getBizobjectid());
        swStore.setWorkflowInstance(swStoreVo.getWorkflowinstance());
        swStore.setEndCommit(new Byte("1"));
        swStore.setStoreName(swStoreVo.getStorename());
        swStore.setStoreAddress(swStoreVo.getStoreaddress());
        swStore.setStorePic(swStoreVo.getStorepic());
        swStore.setIsEnabled(new Byte("1"));
        swStore.setStoreGoodsNum(swStoreVo.getStoregoodsnum());
        swStore.setStoreGoodsSkuNum(swStoreVo.getStoregoodsskunum());
        swStore.setStoreAdmin(swStoreVo.getStoreadmin());
        swStoreMapper.insert(swStore);

        SwMeetingZoomResult swMeetingZoomResult=new SwMeetingZoomResult();
        swMeetingZoomResult.setTranNo(swStore.getTranNo());
        return swMeetingZoomResult;
    }

    //仓库详情
    @Override
    public SwPageVo<SwStoreListVo> swstorelist(BaseSwQueryModel query) {
        //开始分页
        PageHelper.startPage(query.getPage(), query.getSize());
        List<SwStoreListVo> swStoreListVos=swStoreMapper.swstorelist();
        //获取分页结果
        PageInfo<SwStoreListVo> pageInfo=new PageInfo<>(swStoreListVos);
        //封装分页信息
        SwPageVo<SwStoreListVo> pageVo=new SwPageVo<SwStoreListVo>(pageInfo);
        return pageVo;
    }

    //仓库删除
    @Transactional
    @Override
    public void swstoreupdate(SwStoreupdateDo swStoreupdateDo) {
         List<String> ids=swStoreupdateDo.getIds();
         for(String id:ids)
         {
             SwStore swStore=new SwStore();
             swStore.setUpdater(swStoreupdateDo.getUserId());
             swStore.setDeleted(new Byte("1"));
             swStore.setEndCommit(new Byte("2"));
             swStore.setIsEnabled(new Byte("2"));
             SwStoreCriteria swStoreCriteria=new SwStoreCriteria();
             swStoreCriteria.createCriteria()
                            .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                            .andIdEqualTo(id)
                            .andIsEnabledEqualTo(new Byte("1"));
             swStoreMapper.updateByExampleSelective(swStore,swStoreCriteria);
         }
    }

    //仓库的详情
    @Override
    public SwStoreListUpdateVo swstorelistUpdate(String meetingId) {
        SwStore swStore=swStoreMapper.selectByPrimaryKey(meetingId);
        if(swStore==null || DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()))
        {
            throw new SwException("没有查到该仓库");
        }

        SwStoreListUpdateVo swStoreListUpdateVo=BeanCopyUtils.coypToClass(swStore,SwStoreListUpdateVo.class,null);

        List<SwStoreListUpdateDto> users = swStoreMapper.swstoresistupdate(swStore.getId());
        String joinUsers="";
        for(SwStoreListUpdateDto user:users)
        {
            joinUsers=joinUsers+user.getStorename()+",";
        }
        if(StringUtils.isNotBlank(joinUsers))
        {
            joinUsers=joinUsers.substring(0,joinUsers.length()-1);
        }
        swStoreListUpdateVo.setJoinUser(joinUsers);
        swStoreListUpdateVo.setStorename(swStore.getStoreName());
        swStoreListUpdateVo.setStoreadmin(swStore.getStoreAdmin());
        swStoreListUpdateVo.setStoreaddress(swStore.getStoreAddress());
        swStoreListUpdateVo.setStoregoodsnum(swStore.getStoreGoodsNum());
        swStoreListUpdateVo.setStoregoodsskunum(swStore.getStoreGoodsSkuNum());
        return swStoreListUpdateVo;
    }

    //仓库编辑
    @Override
    public void updateswstoreedit(SwStoreListUpdateVo SwStoreListUpdateVo) {
        swStoreMapper.updateswstoreedit(SwStoreListUpdateVo);
    }

    //流程审核后修改仓库状态
    @Transactional
    @Override
    public void swStoreckupdate(SwStoreckUpdateDto swStoreckUpdateDto) {
         SwStore swStore=new SwStore();
         swStore.setTranNo(swStoreckUpdateDto.getTranno());
         swStore.setUpdateTime(new Date());
         swStore.setYsResult(swStoreckUpdateDto.getYsresult());
         if(StringUtils.isNotBlank(swStoreckUpdateDto.getWorkflowinstance()))
         {
              swStore.setWorkflowInstance(swStoreckUpdateDto.getWorkflowinstance());
         }
         if(StringUtils.isNotBlank(swStoreckUpdateDto.getBizobjectid()))
         {
             swStore.setBizObjectId(swStoreckUpdateDto.getBizobjectid());
         }

         SwStoreCriteria example =new SwStoreCriteria();
         example.createCriteria()
                 .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                 .andTranNoEqualTo(swStoreckUpdateDto.getTranno());
         int i=swStoreMapper.updateByExampleSelective(swStore,example);
         return;
    }

    //仓库条件查询
    @Override
    public SwPageVo<SwStoreListselectVo> swstorelistselect(String storename,String createtime,String updatetime,BaseSwQueryModel queryModel) {
        //开始分页
        PageHelper.startPage(queryModel.getPage(), queryModel.getSize());
        List<SwStoreListselectVo> swStoreListVos=swStoreMapper.swstorelistselect(storename,createtime,updatetime);
        //获取分页结果
        PageInfo<SwStoreListselectVo> pageInfo=new PageInfo<>(swStoreListVos);
        //封装分页信息
        SwPageVo<SwStoreListselectVo> pageVo=new SwPageVo<SwStoreListselectVo>(pageInfo);
        return pageVo;
    }
}
