package com.lanxin.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by liyu on 2019/9/26.
 */

@ControllerAdvice
public class GlobalError {

    @ExceptionHandler(value=Exception.class)
    @ResponseBody//返回json数据或String数据，那么需要在方法上加@RequestBody注解，添加return即可
    public MyResult defaultError(){
        return MyResult.no();
    }
}
