package com.atguigu.controller;


import com.atguigu.pojo.Person;
import com.atguigu.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("json")
@Controller
@ResponseBody
public class JsonController {

    /**
     * 实际上还需要导入json处理的依赖， 并且需要handlerAdapter配置json转化器
     * @param person
     * @return
     */
    @PostMapping("data")
    public String data(@RequestBody Person person) {
        System.out.println("person = " + person);
        return person.toString();
    }

    @GetMapping("data1")
    public User dataUser() {
        User user = new User();
        user.setName("two dogs!");
        user.setAge(20);
        return user; //user - handlerAdapter json responseBody json直接返回
    }

    @GetMapping("data2")
    public List<User> data2() {
        User user = new User();
        user.setName("two dogs!");
        user.setAge(20);

        List<User> users = new ArrayList<User>();
        users.add(user);
        return users; //user - handlerAdapter json responseBody json直接返回
    }
}
