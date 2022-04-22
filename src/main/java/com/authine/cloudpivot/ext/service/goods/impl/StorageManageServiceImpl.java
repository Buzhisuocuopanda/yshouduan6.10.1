package com.authine.cloudpivot.ext.service.goods.impl;

import com.authine.cloudpivot.ext.constant.SwStatusConstant;
import com.authine.cloudpivot.ext.entity.*;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.enums.base.EndCommit;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.*;
import com.authine.cloudpivot.ext.model.doo.SwGoodsDo;
import com.authine.cloudpivot.ext.model.doo.SwUpdateStockDo;
import com.authine.cloudpivot.ext.model.dto.MeetingDetailModel;
import com.authine.cloudpivot.ext.model.dto.Skudto;
import com.authine.cloudpivot.ext.model.vo.SwGoodsResult;
import com.authine.cloudpivot.ext.service.goods.StorageManageService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;

@Service
@Slf4j
public class StorageManageServiceImpl implements StorageManageService {

    @Resource
    private HOrgUserMapper hOrgUserMapper;

    @Resource
    private SwGoodsSkuMapper swGoodsSkuMapper;
    @Resource
    private SwStoreMapper swStoreMapper;

    @Resource
    private SwGoodsMapper swGoodsMapper;
    @Resource
    private BizWorkflowInstanceMapper bizWorkflowInstanceMapper;
    @Resource
    private HBizCommentMapper hBizCommentMapper;

    //入库操作
    @Transactional
    @Override
    public SwGoodsResult stockInOperation(SwGoodsDo swGoodsDo) {
        //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swGoodsDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }



        /*//检查货物编号是否重复
        SwGoodsCriteria example=new SwGoodsCriteria();
        example.createCriteria().andGoodsCodeEqualTo(swGoodsDo.getGoodsCode());
        List<SwGoods> list = swGoodsMapper.selectByExample(example);
        if(list.size()> 0){
            throw new SwException("货物编号重复");
        }*/

        //检查仓库是否可用
        SwStore swStore = swStoreMapper.selectByPrimaryKey(swGoodsDo.getSwStoreId());
        if (swStore == null ||
                DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swStore.getIsEnabled())
        ) {
            throw new SwException("仓库无法使用");
        }


        SwGoods swGoods = BeanCopyUtils.coypToClass(swGoodsDo, SwGoods.class, null);
        swGoods.setId(IdUtils.getId());

        Date date = new Date();
        swGoods.setId(IdUtils.getId());
        swGoods.setCreateTime(date);

        swGoods.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
        swGoods.setTranNo(IdUtils.getId());
        swGoods.setEndCommit(EndCommit.NOT_COMMIT.getCode());
        swGoods.setGoodsTotalNum(swGoodsDo.getGoodsTotalNum());
        swGoods.setGoodsName(swGoodsDo.getGoodsName());
        swGoods.setGoodsCode(swGoodsDo.getGoodsCode());
        swGoods.setSwStoreId(swGoodsDo.getSwStoreId());
        swGoods.setGoodsCompany(swGoodsDo.getGoodsCompany());
        swGoods.setSwStoreName(swGoodsDo.getSwStoreName());
        swGoods.setGoodsDetail(swGoodsDo.getGoodsDetail());
        swGoodsMapper.insert(swGoods);

      /*  SwGoodsSku rel=null;
        for (String joninUserId : swGoodsDo.getJoninUserIds()) {
            rel = new SwGoodsSku();
            rel.setId(IdUtils.getId());
            rel.setSwGoodsId(joninUserId);
            rel.setSkuNum(swGoods.getGoodsTotalNum());
            rel.setSkuPrice(swGoodsDo.getSkuPrice());
            swGoodsSkuMapper.insert(rel);

        }*/



       // swGoodsDo.details.add(100);

       //生成货物库存表

        //swGoodsDo.details.add(1000);
        Skudto kuPic = new Skudto();
        swGoodsDo.getDetails().add(kuPic);
        for (Skudto detail : swGoodsDo.getDetails()) {
            SwGoodsSku swGoodsSku = BeanCopyUtils.coypToClass(detail, SwGoodsSku.class, null);
            swGoodsSku.setId(IdUtils.getId());

            swGoodsSku.setSwGoodsId(swGoods.getId());
            swGoodsSku.setSkuCode(swGoodsDo.getSkuCode());
            swGoodsSku.setSkuNum(swGoods.getGoodsTotalNum());
            swGoodsSku.setSkuPrice(swGoodsDo.getSkuPrice());
            swGoodsSkuMapper.insert(swGoodsSku);
        }



        SwGoodsResult swGoodsResult = new SwGoodsResult();
        swGoodsResult.setTranNo(swGoods.getTranNo());
        return swGoodsResult;

    }


   //更新
    @Transactional
    @Override
    public void updatestock(SwUpdateStockDo swUpdateStockDo) {
       // SwGoodsSku swGoodsSku=new SwGoodsSku();
        SwGoods swGoods=new SwGoods();
         swGoods.setEndCommit(EndCommit.COMMIT.getCode());
         swGoods.setSequeceNo(swUpdateStockDo.getSequeceNo());
         swGoods.setTranNo(swUpdateStockDo.getTranNo());
         swGoods.setYsResult(swUpdateStockDo.getYsResult());

         //swGoods.setGoodsTotalNum(swGoodsSku.getSkuNum());

        if(StringUtils.isNotBlank(swUpdateStockDo.getWorkflowInstance())){
            swGoods.setWorkflowInstance(swUpdateStockDo.getWorkflowInstance());
        }
        if(StringUtils.isNotBlank(swUpdateStockDo.getBizObjectId())){
            swGoods.setBizObjectId(swUpdateStockDo.getBizObjectId());

        }
        //更新总库存
        //swGoodsMapper.updatetotalnum(swUpdateStockDo);



        SwGoodsCriteria example=new SwGoodsCriteria();
        example
                .createCriteria()
                .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                .andTranNoEqualTo(swUpdateStockDo.getTranNo());
        int i=swGoodsMapper.updateByExampleSelective(swGoods,example);
        log.info("流水号更新成功");
        return;

    }
}




