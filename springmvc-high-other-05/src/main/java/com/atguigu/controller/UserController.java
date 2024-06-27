package com.atguigu.controller;


import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("user")
public class UserController {

    /**
     * 1、实体类添加校验注解
     * 2、handler 添加 @Validated注解
     * param和json校验注解都有效果
     *
     * 捕捉错误绑定错误信息
     * 1、handler（校验对象 BindingResult result） bindingResult必须紧挨着校验对象
     * 2、bindingResult获取绑定错误
     * @param user
     * @return
     */
    @PostMapping("register")
    public Object registerUser(@Validated @RequestBody User user, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            // 有半绑定错误，就不直接返回了，由我们自己决定
            Map data = new HashMap();
            data.put("code", 400);
            data.put("msg", "参数校验异常");
            return data;
        }
        System.out.println(user);
        return user;
    }

    @GetMapping("data")
    public String data() {
        System.out.println("UserController data");
        String name = null;
        name.toString();
        return "ok";
    }

    @GetMapping("data1")
    public String data1() {
        System.out.println("UserController data1");
        int i = 1/0;
        return "ok";
    }
}
