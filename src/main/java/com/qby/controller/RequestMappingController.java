package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 为当前所有的方法的请求地址指定一个基准路径
 *
 * @author qby
 * @date 2020/6/23 23:34
 */
@RequestMapping("/haha")
@Controller
public class RequestMappingController {

    @RequestMapping("/handle01")
    public String handle01() {
        return "success";
    }


    /**
     * method：限定请求方法
     * GET, HEAD, POST, PUT, PATCH, DELETE, OPTIONS, TRACE
     * 指定请求方式时 只接收指定请求方式的请求
     * method = RequestMethod.POST 只接受这种类型请求，默认时什么都可以
     * 不是规定方式时报错，HTTP状态 405 - 方法不允许
     * 4XX错误都是客户端错误
     *
     * params
     * headers
     * consumes
     * produces
     *
     * @return
     */
    @RequestMapping(value = "/handle02", method = RequestMethod.POST)
    public String handle02() {
        return "success";
    }
}
