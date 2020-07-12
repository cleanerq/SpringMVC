package com.qby.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author qby
 * @date 2020/7/12 14:24
 */
@Controller
public class HandleExceptionController {

    @ResponseStatus(reason = "反正我错了", value = HttpStatus.NOT_EXTENDED)
    @RequestMapping("/handleExcep")
    public String handleExcep(Integer integer) {
        System.out.println("handleExcep");
        System.out.println(10 / integer);
        return "success";
    }


}
