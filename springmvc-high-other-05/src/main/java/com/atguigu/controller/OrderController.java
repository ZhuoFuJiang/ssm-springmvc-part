package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Controller
@RequestMapping("order")
public class OrderController {

    @GetMapping("data")
    public String data() {
        System.out.println("OrderController data");
        return "ok";
    }
}
