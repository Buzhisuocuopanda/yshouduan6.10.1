package com.authine.cloudpivot.ext.service.goods.impl;

import com.alibaba.fastjson.JSONObject;
import com.authine.cloudpivot.engine.enums.ErrCode;
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
import com.authine.cloudpivot.ext.model.vo.SwGoodResult;
import com.authine.cloudpivot.ext.model.vo.SwGoodsResult;
import com.authine.cloudpivot.ext.service.goods.StorageManageService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import lombok.extern.slf4j.Slf4j;
import net.bytebuddy.implementation.bytecode.Throw;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Objects;

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


    public static final Object lockHelper = new Object();

    //入库操作
    @Transactional
    @Override
    public SwGoodsResult stockInOperation(SwGoodsDo swGoodsDo) throws Exception {
        //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swGoodsDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }


         //判断是否删除更新
        SwGoodsCriteria example=new SwGoodsCriteria();
        example.createCriteria().andDeletedEqualTo(DeleteFlagEnum.DELETE.getCode());
        List<SwGoods> swGoods1 = swGoodsMapper.selectByExample(example);
        if(swGoods1.size()>0){
            SwGoods SwGoods = new SwGoods();
            swGoodsMapper.update(SwGoods);
        }


  /*      //检查仓库是否可用
        SwStore swStore = swStoreMapper.selectByPrimaryKey(swGoodsDo.getSwStoreId());
        if (swStore == null ||
                DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swStore.getIsEnabled())
        ) {
            throw new SwException("仓库无法使用");
        }*/



    SwGoods swGoods = BeanCopyUtils.coypToClass(swGoodsDo, SwGoods.class, null);
    swGoods.setId(IdUtils.getId());

    Date date = new Date();
    swGoods.setId(IdUtils.getId());
    swGoods.setCreateTime(date);

    swGoods.setDeleted(DeleteFlagEnum.NOT_DELETE.getCode());
    swGoods.setTranNo(IdUtils.getId());
    swGoods.setEndCommit(EndCommit.NOT_COMMIT.getCode());
    swGoods.setGoodsName(swGoodsDo.getGoodsName());
    swGoods.setGoodsCode(swGoodsDo.getGoodsCode());
    swGoods.setSwStoreId(swGoodsDo.getSwStoreId());
    swGoods.setGoodsCompany(swGoodsDo.getGoodsCompany());
    swGoods.setSwStoreName(swGoodsDo.getSwStoreName());
    swGoods.setGoodsDetail(swGoodsDo.getGoodsDetail());
    swGoodsMapper.insert(swGoods);



       //生成货物库存表


        Skudto kuPic = new Skudto();
        swGoodsDo.getDetails().add(kuPic);
        for (Skudto detail : swGoodsDo.getDetails()) {
            SwGoodsSku swGoodsSku = BeanCopyUtils.coypToClass(detail, SwGoodsSku.class, null);
            swGoodsSku.setId(IdUtils.getId());

            swGoodsSku.setSwGoodsId(swGoods.getId());
            swGoodsSku.setSkuCode(swGoodsDo.getSkuCode());
            swGoodsSku.setSkuPrice(swGoodsDo.getSkuPrice());
            swGoodsSku.setSkuNum(swGoodsDo.getSkuNum());

            swGoodsSkuMapper.insert(swGoodsSku);
        }



        SwGoodsResult swGoodsResult = new SwGoodsResult();
        swGoodsResult.setTranNo(swGoods.getTranNo());
        return swGoodsResult;


    }


   //更新
    @Transactional
    @Override
    public  void updatestock(SwUpdateStockDo swUpdateStockDo) {

     /*   //检查仓库是否可用
        SwGoods swGoodsDo = new SwGoods();
        SwStore swStore = swStoreMapper.selectByPrimaryKey(swGoodsDo.getSwStoreId());
        if (swStore == null ||
                DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swStore.getIsEnabled())
        ) {
            throw new SwException("仓库无法使用");
        }*/


        //for update查询
        SwGoods selectforupdate = swGoodsMapper.selectforupdate(swUpdateStockDo);

          if(selectforupdate==null && Objects.equals(selectforupdate.getDeleted(), DeleteFlagEnum.DELETE.getCode())){
              throw new SwException("货物没找到");
          }
          /*if(Objects.equals(selectforupdate.getDeleted(), DeleteFlagEnum.DELETE.getCode())){
            throw new SwException("货物已被删除");
          }*/

        selectforupdate.setEndCommit(EndCommit.COMMIT.getCode());
        selectforupdate.setId(swUpdateStockDo.getId());
        selectforupdate.setSequeceNo(swUpdateStockDo.getSequeceNo());
        selectforupdate.setTranNo(swUpdateStockDo.getTranNo());
        selectforupdate.setYsResult(swUpdateStockDo.getYsResult());
        selectforupdate.setGoodsTotalNum(swUpdateStockDo.getGoodsTotalNum()+ selectforupdate.getGoodsTotalNum());


        if(StringUtils.isNotBlank(swUpdateStockDo.getWorkflowInstance())){
            selectforupdate.setWorkflowInstance(swUpdateStockDo.getWorkflowInstance());
        }
        if(StringUtils.isNotBlank(swUpdateStockDo.getBizObjectId())){
            selectforupdate.setBizObjectId(swUpdateStockDo.getBizObjectId());

        }

        int i = swGoodsMapper.updateByPrimaryKey(selectforupdate);
        if(i<=0){
           // throw new SwException(swGoods.toString());
            throw new SwException("更新不成功");


        }
return;
    }
}




