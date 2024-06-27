package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * @WebServlet必须使用/开头，而@RequestMapping不需要
     *
     * 1、精准地址
     * 2、模糊地址 *
     * /user/*  user/a user/a/b不行
     * /user/** user/a/a/a/a可以
     * 3、类上和方法上添加RequestMapping的区别是
     * 类上提取通用的访问地址
     * 方法上是具体的handler地址
     * 4、请求方式制定 method=RequestMethod.GET
     * 5、注解进阶
     * @return
     */

    @GetMapping()
    public String index() {
        return null;
    }

    @RequestMapping(value = "logging", method = RequestMethod.POST)
    public String login() {
        return null;
    }
}
