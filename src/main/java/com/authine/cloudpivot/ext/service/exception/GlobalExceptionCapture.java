package com.authine.cloudpivot.ext.service.exception;

import com.authine.cloudpivot.engine.api.model.ResponseResult;

import com.authine.cloudpivot.engine.enums.ErrCode;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName GlobalExceptionCapture
 * Description
 * Create by gfy
 * Date 2021/11/12 9:48
 */
@ControllerAdvice
public class GlobalExceptionCapture{
    private static final Logger log = LoggerFactory.getLogger(GlobalExceptionCapture.class);

    public GlobalExceptionCapture() {
    }

    @ExceptionHandler({Exception.class})
    @ResponseBody
    public ResponseResult exceptionHandler(Exception e) {
        log.error("【全局异常捕获】-出现新异常了：${}$", ExceptionUtils.getStackTrace(e));
//        ResponseResult resultDTO = ServerResponse.createByErrorWithExceptionRes("服务请求失败",e.getMessage());
        ResponseResult resultDTO = ResponseResult.builder().data(null).errcode(Integer.valueOf(ErrCode.UNKNOW_ERROR.getErrCode()+"")).errmsg(ErrCode.UNKNOW_ERROR.getErrMsg()).build();
//        ServerResponse resultDTO = ServerResponse.createByParamError("参数异常");
        return resultDTO;
    }
}