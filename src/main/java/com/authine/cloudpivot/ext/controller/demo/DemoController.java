package com.authine.cloudpivot.ext.controller.demo;

import com.alibaba.fastjson.JSONObject;
import com.authine.cloudpivot.ext.constant.RedisKeyConstant;
import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.model.doo.DemoDo;
import com.authine.cloudpivot.ext.utils.ReqDedupHelper;
import com.authine.cloudpivot.web.api.controller.base.BaseController;
import com.authine.cloudpivot.web.api.view.ResponseResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * ClassName DemoController
 * Description
 * Create by gfy
 * Date 2022/4/18 15:29
 */
@RestController
@RequestMapping("/api/meeting")
public class DemoController extends SwBaseController {
    @Resource
    private ReqDedupHelper reqDedupHelper;

    @PostMapping("/addGoodStudent")
//    @DisTwoCommit(key = "#demoDo", summary = "支付回调用的分布式锁", prefix = RedisKeyConstant.DIS_TEW_COMMIT_PREX)

    public ResponseResult addGoodStudent(@Valid @RequestBody DemoDo demoDo) {
        Boolean demo = reqDedupHelper.checkAnainCommit(JSONObject.toJSONString(demoDo), getUserId(), "demo");
        if(demo){
           return this.getOkResponseResult(1L,"请勿重复提交");
        }

        ResponseResult result = this.getOkResponseResult(1L,"成功");
        return result;
    }


}
