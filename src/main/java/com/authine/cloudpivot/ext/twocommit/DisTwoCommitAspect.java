package com.authine.cloudpivot.ext.twocommit;

import com.authine.cloudpivot.ext.controller.base.SwBaseController;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.LocalVariableTableParameterNameDiscoverer;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.expression.EvaluationContext;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import org.springframework.integration.redis.util.RedisLockRegistry;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

/**
 * ClassName DisTwoCommitAspect
 * Description 防重复
 * Create by gfy
 * Date 2022/2/22 11:37
 */
@Aspect
@Component
@Slf4j
public class DisTwoCommitAspect extends SwBaseController {

    @Resource
    private RedisLockRegistry redisLockRegistry;

    @Resource
    private RedisTemplate redisTemplate;

    @Around(value = "@annotation(disTwoCommit)")
    public Object redisValue(ProceedingJoinPoint joinPoint, DisTwoCommit disTwoCommit) throws Throwable {
        Object result = this.getErrResponseResult(1L,"请勿重复提交，稍后再试");
        String key = null;
        Lock lock = null;
        try {
            log.debug("【注解方式获取方防止重复提交】- DisTwoCommit：${}$", disTwoCommit);

            MethodSignature signature = (MethodSignature) joinPoint.getSignature();
            Method method = signature.getMethod();
            Object[] arguments = joinPoint.getArgs();

            // 获取锁的key
            StringBuilder sb = new StringBuilder();
            key = String.valueOf(parseSpel(disTwoCommit.key(), method, arguments));
            key = sb.append(disTwoCommit.prefix())
                    .append(key)
                    .append(disTwoCommit.suffix())
                    .toString();
            ;

//            baseRedisDao.getSetIntersect()

//            lock = redisLockRegistry.obtain(key);
//            // 循环指定次数重复获取锁
            boolean ifLock=false;
            for(int i = 1 ; i <= 1; i++) {
                log.debug("【注解方式获取分布式锁】- 线程${}$开始获取锁，第${}$次", Thread.currentThread().getName(), i);
//                ifLock = lock.tryLock(disTwoCommit.timeout(), TimeUnit.SECONDS);
                // 如果设置成功即获得锁
                if(redisTemplate.opsForValue().setIfAbsent(key, 1,disTwoCommit.timeout(),TimeUnit.SECONDS)) {

                    ifLock= true;
                }

                log.debug("【注解方式获取分布式锁】- 线程${}$是否获取到了锁：${}$，第${}$次", Thread.currentThread().getName(), ifLock, i);

                if (ifLock) {
                    // 具体执行
                    result = joinPoint.proceed();
                    break;
                } else {
                    continue;
                }
            }
        } catch (Exception e) {
            log.error("【注解方式获取方防止重复提交】- 出错了：${}$", ExceptionUtils.getStackTrace(e));
            throw e;
        } finally {
//            log.debug("【注解方式获取方防止重复提交】- 准备解锁：${}$", lock);
//            try {
//                if (null != lock) {
//                    lock.unlock();
//                    log.debug("【注解方式获取方防止重复提交】- 解锁成功：${}$", lock);
//                }
//            } catch (Exception e) {
//                log.debug("【注解方式获取方防止重复提交】- 解锁失败：${}$，错误信息：${}$", lock, ExceptionUtils.getStackTrace(e));
//            }
        }

        return result;


    }

    /**
     * 解析 SpEL 表达式
     *
     * @param key SpEL表达式
     * @param method 反射得到的方法
     * @param args 反射得到的方法参数
     * @return 解析 SpEL 表达式之后得到的结果值
     */
    public static Object parseSpel(String key, Method method, Object[] args) {
        // 创建解析器
        ExpressionParser parser = new SpelExpressionParser();
        // 通过 Spring 的 LocalVariableTableParameterNameDiscoverer 获取方法参数名列表
        LocalVariableTableParameterNameDiscoverer parameterNameDiscoverer = new LocalVariableTableParameterNameDiscoverer();
        String[] parameterNames = parameterNameDiscoverer.getParameterNames(method);
        // 构造上下文
        EvaluationContext context = new StandardEvaluationContext();
        if (args.length == parameterNames.length) {
            for (int i = 0, len = args.length; i < len; i++) {
                // 使用 setVariable 方法来注册自定义变量
                context.setVariable(parameterNames[i], args[i]);
            }
        }
        return parser.parseExpression(key).getValue(context);
    }


}
