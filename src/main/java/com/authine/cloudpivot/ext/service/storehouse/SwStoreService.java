package com.authine.cloudpivot.ext.service.storehouse;

import com.authine.cloudpivot.ext.model.base.BaseSwQueryModel;
import com.authine.cloudpivot.ext.model.base.SwPageVo;
import com.authine.cloudpivot.ext.model.doo.SwMeetingZoomupdateDO;
import com.authine.cloudpivot.ext.model.doo.SwStoreDo;
import com.authine.cloudpivot.ext.model.doo.SwStoreupdateDo;
import com.authine.cloudpivot.ext.model.dto.SwMesstingZoomDto;
import com.authine.cloudpivot.ext.model.dto.SwStoreckUpdateDto;
import com.authine.cloudpivot.ext.model.vo.*;

public interface SwStoreService {

    //添加仓库
    SwStoreResult addSwStore(SwStoreDo swStoreDo);

    //仓库列表内容
    SwPageVo<SwStoreListVo> warehousedetails(BaseSwQueryModel queryModel);

    //仓库列表删除
    void cancelwarehouse(SwStoreupdateDo swStoreupdateDo);

    //查询仓库详情列表
    SwStoreListUpdateVo listofwarehousedetails(String stockid);

    //仓库列表编辑
    void updateswstoreedit(SwStoreListUpdateVo SwStoreListUpdateVo);

    //流程审核后修改仓库状态
    void swStoreckupdate(SwStoreckUpdateDto swStoreckUpdateDto);

    //仓库条件查询
    SwPageVo<SwStoreListselectVo> swstorelistselect(String storename,String createtime,String updatetime,BaseSwQueryModel queryModel);

}
