package com.authine.cloudpivot.ext.controller.base;

import com.authine.cloudpivot.engine.api.model.system.AdminModel;
import com.authine.cloudpivot.web.api.controller.base.BaseController;
import org.apache.commons.lang3.StringUtils;

/**
 * ClassName SwBaseController
 * Description
 * Create by gfy
 * Date 2022/2/22 10:30
 */
public class SwBaseController extends BaseController {


    public String getUserName(){
        String userId = this.getUserId();
        if(StringUtils.isBlank(userId)){
            return null;
        }

        AdminModel dataManaerByUserId = this.getDataManaerByUserId(userId);
        if(dataManaerByUserId==null){
            return null;
        }

        return dataManaerByUserId.getUserId();
    }


}
