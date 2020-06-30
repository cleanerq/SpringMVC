package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义视图解析器 视图对象
 *
 * @author qby
 * @date 2020/6/30 23:27
 */
@Controller
public class MyViewResolverController {

    @RequestMapping("/handlePlus")
    public String handlePlus(Model model) {
        List<String> vnameList = new ArrayList<>();
        vnameList.add("张老师");
        vnameList.add("宋老师");


        List<String> imgname = new ArrayList<>();
        imgname.add("萌萌");



        model.addAttribute("video", vnameList);
        model.addAttribute("imgs", imgname);
        // meinv:xxx等
        return "meinv:/gaoqing";
    }
}
