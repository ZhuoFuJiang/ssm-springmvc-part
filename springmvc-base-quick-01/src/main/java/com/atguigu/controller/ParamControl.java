package com.atguigu.controller;

import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("param")
public class ParamControl {
    // 直接接收

    /**
     * 形参列表，填写对应名称的参数即可
     * 1、名称相同 2、可以不传递，不会报错
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("data")
    @ResponseBody
    public String data(String name, int age) {
        String re = "name = " + name + ", age = " + age;
        System.out.println(re);
        return re;
    }

    // 注解制定
    // 指定任意的请求参数名，要求必须传递，要求不必须传递，给予一个默认值
    @RequestMapping("data1")
    @ResponseBody
    public String data1(@RequestParam(value = "account") String username,
                        @RequestParam(required = false, defaultValue = "1") int page) {
        String re = "account = " + username + ", page = " + page;
        System.out.println(re);
        return re;
    }

    // 特殊值
    // 一名多值 key=1&key=2直接使用集合接值即可
    @GetMapping("data2")
    @ResponseBody
    public String data2(@RequestParam(value = "hbs") List<String> list) {
        System.out.println(list);
        return "ok";
    }

    // 使用实体对象接值，用户注册 属性值必须等于参数值
    @ResponseBody
    @RequestMapping("data3")
    public String data3(User user) {
        System.out.println(user);
        return user.toString();
    }
}
