package com.authine.cloudpivot.ext.utils;



import com.authine.cloudpivot.ext.exception.SwException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

/***
 * 接口字段校验参数
 * <a href="https://www.jianshu.com/p/67d3637493c7">相关注释使用</a>
 * @Author：ALong  <br>
 * @Date：2020/8/23
 */
public class ValidUtils {

    public static void bindvaild(BindingResult bindingResult) {
        if (!bindingResult.hasErrors()) {
            return;
        }

        for (FieldError fieldError : bindingResult.getFieldErrors()) {
            throw new SwException(fieldError.getDefaultMessage());
        }
    }
}
