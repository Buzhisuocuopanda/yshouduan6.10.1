package com.authine.cloudpivot.ext.service.goods.impl;

import com.authine.cloudpivot.ext.constant.SwStatusConstant;
import com.authine.cloudpivot.ext.entity.*;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.HOrgUserMapper;
import com.authine.cloudpivot.ext.mapper.SwGoodsListMapper;
import com.authine.cloudpivot.ext.mapper.SwGoodsMapper;
import com.authine.cloudpivot.ext.mapper.SwStoreMapper;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.dto.GoodsDto;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.dto.SwMeetingUserDto;
import com.authine.cloudpivot.ext.model.vo.SwGoodsVo;
import com.authine.cloudpivot.ext.model.vo.SwGoodslistVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingDateVo;
import com.authine.cloudpivot.ext.model.vo.SwMeetingDetailVo;
import com.authine.cloudpivot.ext.service.goods.GoodsService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
private SwGoodsListMapper swGoodsListMapper;

    @Transactional
    @Override
    public List<GoodsQueryParam> goodslist(Byte isEnabled, Date createTime, String goodsName, String goodsCode) {

        List<GoodsQueryParam> list=new ArrayList<>();


        list=swGoodsMapper.getInfo(isEnabled,createTime,goodsName,goodsCode);
     /*   SwStore swStore=new SwStore();
        SwGoods swGoods=new SwGoods();

        GoodsQueryParam goodsQueryParam = BeanCopyUtils.coypToClass(swGoods, GoodsQueryParam.class, null);
        goodsQueryParam.setCreateTime(swGoods.getCreateTime());

        List<GoodsDto> info = swGoodsMapper.getInfo(swStore.getIsEnabled(), swGoods.getCreateTime(), swGoods.getGoodsName(), swGoods.getGoodsCode());
        String joinUsers="";
        for (GoodsDto infos : info) {
            joinUsers=joinUsers+infos.getGoodsCode()+","
                               +infos.getGoodsName()+","
                                +infos.getIsEnabled()+",";
        }
        if(org.apache.commons.lang3.StringUtils.isNotBlank(joinUsers)){
            joinUsers=joinUsers.substring(0,joinUsers.length()-1);
        }
        goodsQueryParam.setJoinUser(joinUsers);
        return goodsQueryParam;*/
     return list;
    }


    //好用
    @Transactional
    @Override
    public void addGoods(SwGoodsListDo swGoodsListDo) {

        //检查创建用户是否存在
        HOrgUser hOrgUser = hOrgUserMapper.selectByPrimaryKey(swGoodsListDo.getCreater());
        if (hOrgUser == null || DeleteFlagEnum.DELETE.getCode().equals(hOrgUser.getDeleted())) {
            throw new SwException("该创建者没有查到");
        }

        //检查货物编号是否重复
        SwGoodsCriteria example=new SwGoodsCriteria();
        example.createCriteria().andGoodsCodeEqualTo(swGoodsListDo.getGoodsCode());
        List<SwGoods> list = swGoodsMapper.selectByExample(example);
        if(list.size()> 0){
            throw new SwException("货物编号重复");
        }


        //检查仓库是否可用
        SwStore swStore =swStoreMapper.selectByPrimaryKey(swGoodsListDo.getLocalStore());
        if(swStore==null ||
                DeleteFlagEnum.DELETE.getCode().equals(swStore.getDeleted()) ||
                SwStatusConstant.NOCANUSE.equals(swStore.getIsEnabled())
        ){
            throw new SwException("仓库无法使用");
        }

        SwGoodsList swGoodsList = BeanCopyUtils.coypToClass(swGoodsListDo, SwGoodsList.class, null);
        swGoodsList.setId(IdUtils.getId());

        Date date = new Date();
        swGoodsList.setCreateTime(date);
        swGoodsList.setGoodsName(swGoodsListDo.getGoodsName());
        swGoodsList.setGoodsCode(swGoodsListDo.getGoodsCode());
        swGoodsList.setGoodsCompany(swGoodsListDo.getGoodsCompany());
        swGoodsList.setGoodsNum(swGoodsListDo.getGoodsNum());
        swGoodsListMapper.insert(swGoodsList);


        return ;
    }


    @Transactional
    @Override
    public List<SwGoodsList> list(String keyword) {
        //是否可用
        SwStoreCriteria ssc=new SwStoreCriteria();
        ssc.createCriteria().andIsEnabledEqualTo((byte) 0);
        List<SwStore> swStores = swStoreMapper.selectByExample(ssc);
        if(swStores.size()>0){
            SwStore swStore=swStores.get(0);
        }


        SwGoodsListCriteria example=new SwGoodsListCriteria();
        SwGoodsListCriteria.Criteria criteria = example.createCriteria();

        if(!StringUtils.isEmpty(keyword)){
            criteria
                    .andGoodsNameLike("%"+keyword+"%");

            example.or().andGoodsCodeLike("%"+keyword+"%");

        }
        return swGoodsListMapper.selectByExample(example);
    }


    //单表查询
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
        if(swGoodslistVo.getCreateTime()!=null){
            criteria.andCreateTimeEqualTo(swGoodslistVo.getCreateTime());
        }

        return swGoodsMapper.selectByExample(productExample);
    }



    @Transactional
    @Override
    public List<SwGoodsVo> list(GoodsQueryParam goodsQueryParam, Integer pageSize, Integer pageNum) {
        PageHelper.startPage(pageNum, pageSize);

        return swGoodsListMapper.getInfo(goodsQueryParam);
    }


}
