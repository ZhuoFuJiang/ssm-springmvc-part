package com.atguigu.controller;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;


@Controller
public class ApiController {

    @Autowired
    private ServletContext servletContext;

    public void data(HttpServletRequest req, HttpServletResponse resp, HttpSession session) {
        // 使用原生对象就可以
        // ServletContext 1、最大的配置文件 2、全局最大共享域 3、核心api getRealPath
        // 方案1：request获取session权限
        ServletContext servletContext = req.getServletContext();
        ServletContext context = session.getServletContext();

        // 方案2：ServletContext会自动装入到ioc容器，程序启动ServletContext - ioc容器
        // 直接全局注入即可
        
    }
}
