package com.qby.controller;

import com.qby.exception.UserNameNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
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

    @RequestMapping("handleExcep02")
    public String handleExcep02(@RequestParam("username") String username) {
        if ("admin".equals(username)) {
            System.out.println("登陆失败");
            throw new UserNameNotFoundException();
        }
        System.out.println("登陆成功");
        return "success";
    }

    @RequestMapping(value = "/handleExcep03", method = RequestMethod.POST)
    public String handleExcep03() {

        return "success";
    }
}
