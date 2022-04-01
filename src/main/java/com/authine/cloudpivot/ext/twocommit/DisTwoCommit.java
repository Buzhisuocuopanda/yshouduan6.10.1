package com.authine.cloudpivot.ext.twocommit;

import java.lang.annotation.*;

/**
 * 防止重复点击注解
 *
 * ClassName DisTwoCommit
 * Description
 * Create by gfy
 * Date 2022/2/22 11:30
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DisTwoCommit {

    /**
     * 防重复点击，可以使用 SpEL 传方法参数
     */
    String key();

    /**
     * 说明
     */
    String summary();
    /**
     * 防重复点击的标记前缀
     */
    String prefix() default "";

    /**
     * 防重复点击标记后缀
     */
    String suffix() default "";

    /**
     * 防重复点击默认的超时时间，单位：秒
     */
    int timeout() default 3;


}
