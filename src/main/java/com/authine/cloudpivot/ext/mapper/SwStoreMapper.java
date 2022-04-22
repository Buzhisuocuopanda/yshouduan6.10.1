package com.authine.cloudpivot.ext.mapper;

import com.authine.cloudpivot.ext.entity.SwStore;
import com.authine.cloudpivot.ext.entity.SwStoreCriteria;
import java.util.List;

import com.authine.cloudpivot.ext.model.dto.SwStoreListUpdateDto;
import com.authine.cloudpivot.ext.model.vo.SwStoreListUpdateVo;
import com.authine.cloudpivot.ext.model.vo.SwStoreListVo;
import com.authine.cloudpivot.ext.model.vo.SwStoreListselectVo;
import org.apache.ibatis.annotations.Param;

public interface SwStoreMapper {
    long countByExample(SwStoreCriteria example);

    int deleteByExample(SwStoreCriteria example);

    int deleteByPrimaryKey(String id);

    int insert(SwStore record);

    int insertSelective(SwStore record);

    List<SwStore> selectByExample(SwStoreCriteria example);

    SwStore selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SwStore record, @Param("example") SwStoreCriteria example);

    int updateByExample(@Param("record") SwStore record, @Param("example") SwStoreCriteria example);

    int updateByPrimaryKeySelective(SwStore record);

    int updateByPrimaryKey(SwStore record);

    //仓库列表内容
    List<SwStoreListVo> warehousedetails();

    //查询仓库详情列表
    List<SwStoreListUpdateDto> listofwarehousedetails(String id);

    //仓库编辑
    void updateswstoreedit(SwStoreListUpdateVo swStoreListUpdateVo);

    //仓库条件查询
    List<SwStoreListselectVo> swstorelistselect(String storename, String createtime, String updatetime);

}