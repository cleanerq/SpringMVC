package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * 数据传到页面
 *
 * @author qby
 * @date 2020/6/25 0:38
 */
@RequestMapping("/data")
@Controller
public class OutputController {

    @RequestMapping("/toTest")
    public String toTest() {
        return "dataoutputtest";
    }

    @RequestMapping("/handle01")
    public String handle01(Map<String, Object> map) {
        map.put("msg", "你好");
        return "success_data";
    }

    @RequestMapping("/handle02")
    public String handle02(Model model) {
        model.addAttribute("msg", "你好坏");
        return "success_data";
    }

    @RequestMapping("/handle03")
    public String handle03(ModelMap model) {
        model.addAttribute("msg", "你好棒");
        return "success_data";
    }
}
