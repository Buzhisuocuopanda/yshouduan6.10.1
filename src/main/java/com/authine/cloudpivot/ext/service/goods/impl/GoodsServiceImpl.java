package com.authine.cloudpivot.ext.service.goods.impl;

import com.authine.cloudpivot.ext.constant.SwStatusConstant;
import com.authine.cloudpivot.ext.entity.*;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.HOrgUserMapper;
import com.authine.cloudpivot.ext.mapper.SwGoodsMapper;
import com.authine.cloudpivot.ext.mapper.SwGoodsSkuMapper;
import com.authine.cloudpivot.ext.mapper.SwStoreMapper;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.vo.SwGoodslistVo;
import com.authine.cloudpivot.ext.service.goods.GoodsService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class GoodsServiceImpl implements GoodsService {

@Resource
private SwStoreMapper swStoreMapper;

@Resource
private SwGoodsMapper swGoodsMapper;

@Resource
private HOrgUserMapper hOrgUserMapper;

@Resource
private SwGoodsSkuMapper swGoodsSkuMapper;



    //多表条件查询
    @Transactional
    @Override
    public List<GoodsQueryParam> goodslist(Byte isEnabled, Date startTime, Date endTime,String goodsName, String goodsCode) {

        List<GoodsQueryParam> list=new ArrayList<>();
        list=swGoodsMapper.getInfo(isEnabled,startTime,endTime,goodsName,goodsCode);
        return list;
    }


    //好用
    @Transactional
    @Override
    public void addGoods(SwGoodsListDo swGoodsListDo) {

      /*  //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swGoodsListDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }*/

        //检查货物编号是否重复
        SwGoodsCriteria example=new SwGoodsCriteria();
        example.createCriteria().andGoodsCodeEqualTo(swGoodsListDo.getSkuCode());
        List<SwGoods> list = swGoodsMapper.selectByExample(example);
        if(list.size()> 0){
            throw new SwException("货物编号重复");
        }


        /*//检查仓库是否可用
        SwStore swStore =swStoreMapper.selectByPrimaryKey(swGoodsListDo.getLocalStore());
        if(swStore==null ||
                DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swStore.getIsEnabled())
        ){
            throw new SwException("仓库无法使用");
        }*/

        //属性copy
        SwGoodsSku swGoodsSku = BeanCopyUtils.coypToClass(swGoodsListDo, SwGoodsSku.class, null);
        swGoodsSku.setId(IdUtils.getId());
        swGoodsSku.setSwGoodsId(swGoodsListDo.getSwGoodsId());
        swGoodsSku.setSkuCode(swGoodsListDo.getSkuCode());
        swGoodsSku.setSkuNum(swGoodsListDo.getSkuNum());
        swGoodsSku.setSkuPrice(swGoodsListDo.getSkuPrice());
        swGoodsSkuMapper.insert(swGoodsSku);

        return ;
    }




    //多表查询
    @Transactional
    @Override
    public List<SwGoods> list(SwGoodslistVo swGoodslistVo, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);
        SwGoodsCriteria productExample = new SwGoodsCriteria();
        SwGoodsCriteria.Criteria criteria = productExample.createCriteria();
        criteria.andDeletedEqualTo((byte) 0);
        if (swGoodslistVo.getGoodsName() != null) {
            criteria.andGoodsNameEqualTo(swGoodslistVo.getGoodsName());
        }
        if (swGoodslistVo.getGoodsCode() != null) {
            criteria.andGoodsCodeEqualTo(swGoodslistVo.getGoodsCode());
        }
        /*if(swGoodslistVo.getCreateTime()!=null){
            criteria.andCreateTimeBetween(swGoodslistVo.getStartTime(),swGoodslistVo.getEndTime());
                    //andCreateTimeEqualTo(swGoodslistVo.getCreateTime());
        }*/
        if(swGoodslistVo.getStartTime()!=null){
            criteria.andCreateTimeGreaterThanOrEqualTo(swGoodslistVo.getStartTime());
            //andCreateTimeEqualTo(swGoodslistVo.getCreateTime());
        }
        if(swGoodslistVo.getEndTime()!=null){
            criteria.andCreateTimeLessThanOrEqualTo(swGoodslistVo.getEndTime());
            //andCreateTimeEqualTo(swGoodslistVo.getCreateTime());
        }
        return swGoodsMapper.selectByExample(productExample);
    }


}
