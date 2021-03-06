package com.authine.cloudpivot.ext.service.goods.impl;

import com.authine.cloudpivot.ext.entity.*;
import com.authine.cloudpivot.ext.enums.DeleteFlagEnum;
import com.authine.cloudpivot.ext.enums.StoreEnum;
import com.authine.cloudpivot.ext.exception.SwException;
import com.authine.cloudpivot.ext.mapper.HOrgUserMapper;
import com.authine.cloudpivot.ext.mapper.SwGoodsMapper;
import com.authine.cloudpivot.ext.mapper.SwGoodsSkuMapper;
import com.authine.cloudpivot.ext.mapper.SwStoreMapper;
import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwGoodsListDo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.dto.GoodsQueryParam;
import com.authine.cloudpivot.ext.model.dto.SwGoodsListDto;
import com.authine.cloudpivot.ext.model.vo.*;
import com.authine.cloudpivot.ext.service.goods.GoodsService;
import com.authine.cloudpivot.ext.utils.BeanCopyUtils;
import com.authine.cloudpivot.ext.utils.IdUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
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
    public SwPageVo<SwGoodResult> goodslist(GoodsQueryParam goodsQueryParam, BaseSwQueryModel query) {
        PageHelper.startPage(query.getPage(), query.getSize());

        List<SwGoodResult> swGoods1 = swGoodsMapper.getInfo(goodsQueryParam);

        //获取分页结果
        PageInfo<SwGoodResult> pageInfo = new PageInfo<>(swGoods1);
        //封装分页信息
        SwPageVo<SwGoodResult> pageVO = new SwPageVo<SwGoodResult>(pageInfo);

        return pageVO;

    }


    @Transactional
    @Override
    public List<SwgetstoreVo> getenableswstore() {
        List<SwgetstoreVo> res=new ArrayList<>();
       SwStoreCriteria example=new SwStoreCriteria();
       example.createCriteria()
               .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
               .andIsEnabledEqualTo(StoreEnum.ISENDLED.getCode());
        List<SwStore> swStores = swStoreMapper.selectByExample(example);

        for(SwStore swStore : swStores){
            SwgetstoreVo swgetstoreVo = BeanCopyUtils.coypToClass(swStore, SwgetstoreVo.class, null);
            swgetstoreVo.setId(swStore.getId());


            res.add(swgetstoreVo);
        }
        return res;
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




    //多条件查询
    @Transactional
    @Override
    public SwPageVo<SwGoods> list(SwGoodslistVo swGoodslistVo, BaseSwQueryModel query) {
        PageHelper.startPage(query.getPage(), query.getSize());
        SwGoodsCriteria productExample = new SwGoodsCriteria();
        SwGoodsCriteria.Criteria criteria = productExample.createCriteria();
        criteria.andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode());
        if (swGoodslistVo.getGoodsName() != null) {
            criteria.andGoodsNameEqualTo(swGoodslistVo.getGoodsName());
        }
        if (swGoodslistVo.getGoodsCode() != null) {
            criteria.andGoodsCodeEqualTo(swGoodslistVo.getGoodsCode());
        }
        if(swGoodslistVo.getStartTime()!=null){
            criteria.andCreateTimeGreaterThanOrEqualTo(swGoodslistVo.getStartTime());
        }
        if(swGoodslistVo.getEndTime()!=null){
            criteria.andCreateTimeLessThanOrEqualTo(swGoodslistVo.getEndTime());
        }
        List<SwGoods> swGoods = swGoodsMapper.selectByExample(productExample);
        //获取分页结果
        PageInfo<SwGoods> pageInfo = new PageInfo<>(swGoods);
        //封装分页信息
        SwPageVo<SwGoods> pageVO = new SwPageVo<SwGoods>(pageInfo);

        return pageVO;
    }


    //关联查询
    @Transactional
    @Override
    public List <SwGSlistVo> getgslist(String id) {
        List<SwGSlistVo> list=new ArrayList<>();

        SwGoods swGoods = swGoodsMapper.selectByPrimaryKey(id);
        if(swGoods==null || DeleteFlagEnum.DELETE.getCode().equals(swGoods.getDeleted())){
            throw new SwException("没有找到此id");
        }
        list = swGoodsMapper.getgslist(id);


        return list;
    }

    @Override
    public SwPageVo<SwGoodsListtVo> goodsList(BaseSwQueryModel query) {
        //开始分页
        PageHelper.startPage(query.getPage(), query.getSize());
        List<SwGoodsListtVo> SwGoodslistVos=swGoodsMapper.goodsList();
        //获取分页结果
        PageInfo<SwGoodsListtVo> pageInfo=new PageInfo<>(SwGoodslistVos);
        //封装分页信息
        SwPageVo<SwGoodsListtVo> pageVo=new SwPageVo<SwGoodsListtVo>(pageInfo);
        return pageVo;
    }

    @Override
    public SwGoodsListtVo goodList(String id) {
        SwGoods swGoods = swGoodsMapper.selectByPrimaryKey(id);
        SwGoodsListtVo swGoodsListtVo=BeanCopyUtils.coypToClass(swGoods,SwGoodsListtVo.class,null);
        List<SwGoodsListDto> selectgoodlist = swGoodsMapper.selectgoodlist(swGoods.getId());
        swGoodsListtVo.setGoodsname(swGoods.getGoodsName());
        swGoodsListtVo.setGoodscode(swGoods.getGoodsCode());
        swGoodsListtVo.setGoodscompany(swGoods.getGoodsCompany());
        swGoodsListtVo.setSwstorename(swGoods.getSwStoreName());
        swGoodsListtVo.setGoodstotalnum(swGoods.getGoodsTotalNum());
        swGoodsListtVo.setId(swGoods.getId());
        swGoodsListtVo.setGoodsdetail(swGoods.getGoodsDetail());
        return swGoodsListtVo;
    }

    //货物删除
    @Override
    public void goodlistUpdate(SwMeetingZoomupdateDO swMeetingZoomupdateDO) {
        List<String> ids=swMeetingZoomupdateDO.getIds();
        for(String id:ids){
            SwGoods swGoods=new SwGoods();
            swGoods.setDeleted(DeleteFlagEnum.DELETE.getCode());
            SwGoodsCriteria example=new SwGoodsCriteria();
            example.createCriteria()
                    .andDeletedEqualTo(DeleteFlagEnum.NOT_DELETE.getCode())
                    .andIdEqualTo(id);
            swGoodsMapper.updateByExampleSelective(swGoods,example);
        }

    }

    @Override
    public void UpdategoodslistEdit(SwGSlistVo swGSlistVo) {
      /*  SwGoods swGoods = swGoodsMapper.selectByPrimaryKey(swGSlistVo.getId());
        if(swGoods.getGoodsCode().equals(swGSlistVo.getGoodscode())){
            throw new SwException("货物编号重复");
        }*/

        swGoodsMapper.updategoodslistEdit(swGSlistVo);
    }


}
