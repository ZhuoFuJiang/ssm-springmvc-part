package com.atguigu.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class MyInterceptor implements HandlerInterceptor {
    // if( ! preHandler()){return;}
    // 在处理请求的目标 handler 方法前执行

    /**
     *
     * @param request 请求对象
     * @param response 响应对象
     * @param handler 调用的方法对象
     * @return
     * @throws Exception 异常
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler);
        System.out.println("Process01Interceptor.preHandle");

        // 返回true：放行
        // 返回false：不放行
        return true;
    }

    // 在目标 handler 方法之后，handler报错不执行!

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView 返回的视图和共享域对象
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", modelAndView = " + modelAndView);
        System.out.println("Process01Interceptor.postHandle");
    }

    // 渲染视图之后执行(最后),一定执行!

    /**
     *
     * @param request
     * @param response
     * @param handler
     * @param ex handle报错了 异常对象
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("request = " + request + ", response = " + response + ", handler = " + handler + ", ex = " + ex);
        System.out.println("Process01Interceptor.afterCompletion");
    }
}
