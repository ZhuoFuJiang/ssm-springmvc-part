package com.atguigu.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("path")
@ResponseBody
public class PathController {
    // 接收路径参数，必须使用@PathVariable
    @RequestMapping("{account}/{password}")
    @ResponseBody
    public String login(@PathVariable(value = "account") String username, @PathVariable String password) {
        String re = "username: " + username + " password: " + password;
        System.out.println(re);
        return re;
    }
}
