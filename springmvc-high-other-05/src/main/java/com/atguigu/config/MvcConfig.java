package com.atguigu.config;


import com.atguigu.interceptor.MyInterceptor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 1、controller配置ioc容器
 * 2、handlerMapping handlerAdapter加入到ioc容器
 */

@EnableWebMvc // 添加秘书 添加经理  给经理添加jackson json处理器
@Configuration
@ComponentScan({"com.atguigu.controller", "com.atguigu.error"})
public class MvcConfig implements WebMvcConfigurer {

//    @Bean
//    public RequestMappingHandlerMapping requestMappingHandlerMapping() {
//        return new RequestMappingHandlerMapping();
//    }
//
//    @Bean
//    public RequestMappingHandlerAdapter handlerAdapter() {
//        return new RequestMappingHandlerAdapter();
//    }

    // 配置jsp对应的试图解析器
    public void configureViewResolvers(ViewResolverRegistry registry) {
        registry.jsp("/WEB-INF/views/", ".jsp");
    }

    public void addInterceptors(InterceptorRegistry registry) {
        // 拦截全部请求
        registry.addInterceptor(new MyInterceptor()).addPathPatterns("/user/data").excludePathPatterns("/user/data1");
    }
}
