package com.atguigu.error;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

// 全局异常发生，会走此类写的handler
//@ControllerAdvice // 可以返回逻辑视图，转发和重定向的
@RestControllerAdvice // @ResponseBody直接返回json字符串
public class GlobalExceptionHandler {

    // 发生异常 -》 ControllerAdvice注解的类型 -> @Exception指定的异常
    @ExceptionHandler(value = ArithmeticException.class)
    public Object ArithmeticExceptionHandler(ArithmeticException e) {
        // 自定义处理异常即可
        String message = e.getMessage();
        System.out.println("ArithmeticException: " + message);
        return message;
    }

    @ExceptionHandler(value = Exception.class)
    public Object ExceptionHandler(Exception e) {
        String message = e.getMessage();
        System.out.println("Exception: " + message);
        return message;
    }
}
