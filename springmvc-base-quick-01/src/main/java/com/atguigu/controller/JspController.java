package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("jsp")
public class JspController {

    /**
     * 1、方法的返回值是字符串类型
     * 2、不能添加ResquestBody，否则直接返沪字符串给浏览器了，不找试图，不走试图解析器
     * 3、返回值，对应中间的试图名称即可
     * @param model
     * @return
     */
    @GetMapping("jump")
    public String jumpJsp(Model model) {
        System.out.println("FileController jumpJsp");
        model.addAttribute("msg", "request data!");
        return "home";
    }

    /**
     * 转发：只能是项目下的资源
     * 1、方法的返回值写成字符串
     * 2、不能添加RequestBody
     * 3、返回值对应中间的视图名称即可
     * @return
     */
    // 转发
    @GetMapping("forward")
    public String forward() {
        System.out.println("FileController forward");
        return "forward:/jsp/jump";
    }

    /**
     * 1、方法返回值写成字符串类型
     * 2、不能添加ResponseBody
     * 3、返回字符串前面redirect:/重定向的地址
     *
     * springmvc 给重定向做了优化，不需要写项目名称，会自动帮助你加，如果是其他项目网站，写全部路径
     * @return
     */
    // 重定向
    @GetMapping("redirect")
    public String redirect() {
        System.out.println("FileController redirect");
        return "redirect:/jsp/jump";
    }

    @GetMapping("redirect/baidu")
    public String redirectBaidu() {
        System.out.println("FileController redirectBaidu");
        return "redirect:http://www.baidu.com";
    }
}
