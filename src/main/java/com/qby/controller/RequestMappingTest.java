package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * RequestMapping-ant风格的url
 * url地址可以写模糊的通配符
 * ？：能替代任意一个字符
 * *：能替代任意多个字符，和一层路径
 * **：能替代多层路径
 *
 * @author qby
 * @date 2020/6/24 16:39
 */
@Controller
public class RequestMappingTest {

    @RequestMapping("/antTest01")
    public String antTest01() {
        return "success";
    }
}
