package com.qby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * 数据传到页面
 *
 * @author qby
 * @date 2020/6/25 0:38
 */
@SessionAttributes(value = "msg", types = String.class)
@RequestMapping("/data")
@Controller
public class OutputController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/toTest")
    public String toTest() {
        return "dataoutputtest";
    }

    @RequestMapping("/handle01")
    public String handle01(Map<String, Object> map) {
        map.put("msg", "你好");
        map.put("haha", "哈哈哈");
        logger.info("map 类型:{}", map.getClass());
        return "success_data";
    }

    @RequestMapping("/handle02")
    public String handle02(Model model) {
        model.addAttribute("msg", "你好坏");
        model.addAttribute("haha", 18);
        logger.info("model 类型:{}", model.getClass());
        return "success_data";
    }

    @RequestMapping("/handle03")
    public String handle03(ModelMap model) {
        model.addAttribute("msg", "你好棒");
        logger.info("ModelMap 类型:{}", model.getClass());
        return "success_data";
    }

    @RequestMapping("/handle04")
    public ModelAndView handle04() {
        // 之前的返回值就叫视图名，视图解析器会帮我们最终拼串得到页面的真实地址
        ModelAndView modelAndView = new ModelAndView("success");
        modelAndView.addObject("msg", "你好快！");
        return modelAndView;
    }
}
