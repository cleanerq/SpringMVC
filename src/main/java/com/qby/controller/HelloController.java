package com.qby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qby
 * @date 2020/6/23 19:19
 */
@Controller
public class HelloController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    /**
     * / 代表从当前项目开始
     * @return
     */
    @RequestMapping("/hello")
    public String hello() {
        // 视图解析器自动拼串
        return "success";
    }
}
