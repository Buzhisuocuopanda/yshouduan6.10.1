package com.authine.cloudpivot.ext.service.storehouse.impl;

import com.authine.cloudpivot.ext.entity.*;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.enums.StoreEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.BizWorkflowInstanceMapper;
import com.authine.cloudpivot.ext.mapper.HBizCommentMapper;
import com.authine.cloudpivot.ext.mapper.HOrgUserMapper;
import com.authine.cloudpivot.ext.mapper.SwStoreMapper;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwStoreDo;
import com.authine.cloudpivot.ext.model.doo.SwStoreupdateDo;
import com.authine.cloudpivot.ext.model.dto.SwStoreListUpdateDto;
import com.authine.cloudpivot.ext.model.dto.SwStoreckUpdateDto;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.storehouse.SwStoreService;
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

    @Resource
    private BizWorkflowInstanceMapper bizWorkflowInstanceMapper;

    @Resource
    private HBizCommentMapper hBizCommentMapper;

    //新建仓库
    @Transactional
    @Override
    public SwStoreResult addSwStore(SwStoreDo swStoreDo) {

        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swStoreDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }

        //检查仓库名称是否重复
        SwStoreCriteria example=new SwStoreCriteria();
        example.createCriteria().andStoreNameEqualTo(swStoreDo.getStorename());
        List<SwStore> list=swStoreMapper.selectByExample(example);
        if(list.size()>0)
        {
            throw new SwException("仓库名称重复");
        }

        SwStore swStore= BeanCopyUtils.coypToClass(swStoreDo,SwStore.class,null);
        Date date=new Date();
        swStore.setDeleted(StoreEnum.NOT_DELETE.getCode());
        swStore.setId(IdUtils.getId());
        swStore.setCreateTime(date);
        swStore.setUpdateTime(date);
        swStore.setUpdater(swStoreDo.getCreater());
        swStore.setDeleted(StoreEnum.NOT_DELETE.getCode());
        swStore.setYsResult(swStoreDo.getYsresult());
        swStore.setTranNo(IdUtils.getId());
//        swStore.setBizObjectId(swStoreVo.getBizobjectid());
//        swStore.setWorkflowInstance(swStoreVo.getWorkflowinstance());
        swStore.setEndCommit(StoreEnum.ENDCOMMIT.getCode());
        swStore.setStoreName(swStoreDo.getStorename());
        swStore.setStoreAddress(swStoreDo.getStoreaddress());
        swStore.setStorePic(swStoreDo.getStorepic());
        swStore.setIsEnabled(StoreEnum.ISENDLED.getCode());
        swStore.setStoreGoodsNum(swStoreDo.getStoregoodsnum());
        swStore.setStoreGoodsSkuNum(swStoreDo.getStoregoodsskunum());
        swStore.setStoreAdmin(swStoreDo.getStoreadmin());
        swStoreMapper.insert(swStore);

        SwStoreResult swStoreResult=new SwStoreResult();
        swStoreResult.setTranNo(swStore.getTranNo());
        return swStoreResult;
    }

    //仓库详情

    @Override
    public SwPageVo<SwStoreListVo> warehousedetails(BaseSwQueryModel query) {
        //开始分页
        PageHelper.startPage(query.getPage(), query.getSize());
        List<SwStoreListVo> swStoreListVos=swStoreMapper.warehousedetails();
        //获取分页结果
        PageInfo<SwStoreListVo> pageInfo=new PageInfo<>(swStoreListVos);
        //封装分页信息
        SwPageVo<SwStoreListVo> pageVo=new SwPageVo<SwStoreListVo>(pageInfo);
        return pageVo;
    }

    //仓库删除
    @Transactional
    @Override
    public void cancelwarehouse(SwStoreupdateDo swStoreupdateDo) {
         List<String> ids=swStoreupdateDo.getIds();
         for(String id:ids)
         {
             SwStore swStore=new SwStore();
             swStore.setUpdater(swStoreupdateDo.getUserId());
             swStore.setDeleted(StoreEnum.DELETE.getCode());
             swStore.setEndCommit(StoreEnum.NOT_ENDCOMMIT.getCode());
             swStore.setIsEnabled(StoreEnum.NOT_ISENDLED.getCode());
             SwStoreCriteria swStoreCriteria=new SwStoreCriteria();
             swStoreCriteria.createCriteria()
                            .andDeletedEqualTo(StoreEnum.NOT_DELETE.getCode())
                            .andIdEqualTo(id)
                            .andIsEnabledEqualTo(StoreEnum.ISENDLED.getCode());
             swStoreMapper.updateByExampleSelective(swStore,swStoreCriteria);
         }
    }

    //仓库的详情

    @Override
    public SwStoreListUpdateVo listofwarehousedetails(String stockid) {
        SwStore swStore=swStoreMapper.selectByPrimaryKey(stockid);
        if(swStore==null || DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()))
        {
            throw new SwException("没有查到该仓库");
        }

        SwStoreListUpdateVo swStoreListUpdateVo=BeanCopyUtils.coypToClass(swStore,SwStoreListUpdateVo.class,null);

        List<SwStoreListUpdateDto> users = swStoreMapper.listofwarehousedetails(swStore.getId());
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
        BizWorkflowInstanceCriteria exapmle=new BizWorkflowInstanceCriteria();
        exapmle.createCriteria()
                .andSequencenoEqualTo(swStoreckUpdateDto.getSequeceNo());
        List<BizWorkflowInstance> bizWorkflowInstances=bizWorkflowInstanceMapper.selectByExample(exapmle);
        String YsReult="";
        if(bizWorkflowInstances.size()>0)
        {
            BizWorkflowInstance bizWorkflowInstance=bizWorkflowInstances.get(0);
            HBizCommentCriteria comex=new HBizCommentCriteria();
            comex.setOrderByClause("createdTime desc");
            comex.createCriteria().andWorkflowinstanceidEqualTo(bizWorkflowInstance.getId())
                    .andActiontypeEqualTo("审批");
            List<HBizComment> hBizComments=hBizCommentMapper.selectByExample(comex);
        }
         swStore.setSequeceNo(swStoreckUpdateDto.getSequeceNo());
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
