package com.authine.cloudpivot.ext.aspect;


import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import com.authine.cloudpivot.ext.utils.redis.BaseRedisDao;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ClassName ControllerErrorAspect
 * Description
 * Create by gfy
 * Date 2021/11/12 9:34
 */
@Component
@org.aspectj.lang.annotation.Aspect
@Slf4j
public class ControllerErrorAspect extends SwBaseController {

    @Autowired
    private BaseRedisDao baseRedisDao;

    private static final String ERROR_CODE_PREFIX = "5";

    @Pointcut("execution(* com.authine.cloudpivot.web.api.controller.*.*(..)) || execution(* com.authine.cloudpivot.web.api.controller.*.*(..)) || execution(* com.authine.cloudpivot.ext.service.exception.GlobalExceptionCapture.exceptionHandler(..))")
    public void pointcutContoller() {
    }

//    @AfterReturning(value = "pointcutContoller()", returning = "result")
//    public void afterReturning(JoinPoint jp, Object result) {
//        try {
//
//            if (result instanceof ResponseResult) {
//                ServerResponse resultDTO = (ServerResponse) result;
//                int code = resultDTO.getStatus() ;
//                if (code==ResponseCode.ERROR.getCode())  {
//                    ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//                    HttpServletRequest request = servletRequestAttributes.getRequest();
//                    String requestURI = request.getRequestURI();
//
//                    InterfaceAnomalyModel interfaceAnomalyModel = new InterfaceAnomalyModel();
//                    interfaceAnomalyModel.setId(IdContant.idWorkerUtil.nextId());
//                    interfaceAnomalyModel.setUri(requestURI);
//                    interfaceAnomalyModel.setProduceTime(new Date());
//                    interfaceAnomalyModel.setCode(resultDTO.getStatus());
//                    interfaceAnomalyModel.setExceptionMsg(resultDTO.getExceptionMsg());
//                    String loginkey=getLoginKey();
//                    if(StringUtils.isBlank(loginkey)){
//                        loginkey = request.getHeader(MyConstant.FRONTTOKEN);
//
//                    }
//                    interfaceAnomalyModel.setLoginKey(loginkey);
//                    interfaceAnomalyModel.setMsg(resultDTO.getMsg());
//                    AdminUser user = getUser();
//                    if(user!=null){
//                        user.setCreateTime(null);
//                        user.setDeleteFlag(null);
//                        user.setUpdateTime(null);
//                        user.setPassword(null);
//                    }else {
//
//                        Object o = baseRedisDaoInter.get(MyConstant.FRONTLOGINPREX + loginkey);
//                        if(o!=null){
//                            WechatAccount object = JsonUtil.getObject((String) o, WechatAccount.class);
//                            interfaceAnomalyModel.setWechatAccount(object);
//                        }
//
//
//                    }
//                    interfaceAnomalyModel.setUser(user);
//
//                    InterfaceAnomalyComponent.INTERFACE_ANOMALY_MODEL_LIST.addFirst(interfaceAnomalyModel);
//                }
//            }
//
//        } catch (Exception e) {
//            InterfaceAnomalyModel interfaceAnomalyModel = new InterfaceAnomalyModel();
//            interfaceAnomalyModel.setId(IdContant.idWorkerUtil.nextId());
//            interfaceAnomalyModel.setUri("错误统计出错了");
//            interfaceAnomalyModel.setProduceTime(new Date());
//            interfaceAnomalyModel.setCode(1);
//
//            InterfaceAnomalyComponent.INTERFACE_ANOMALY_MODEL_LIST.addFirst(interfaceAnomalyModel);
//            log.error("【AOP 拦截结果判断是否出现 XXXX 系列错误】- 出错了：${}$", ExceptionUtils.getStackTrace(e));
//        }
//    }

}
