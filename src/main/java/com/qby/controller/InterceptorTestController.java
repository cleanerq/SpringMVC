package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author qby
 * @date 2020/7/11 19:17
 */
@Controller
public class InterceptorTestController {

    @RequestMapping("/testit")
    public String testit() {
        System.out.println("testit");
//        int i = 10 / 0;
        return "success";
    }

}
