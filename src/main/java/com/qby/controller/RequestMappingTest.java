package com.qby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/antTest01")
    public String antTest01() {
        return "success";
    }

    /**
     * ? 能替代任意一个字符，0个多个都不行
     *      模糊和精确多个匹配情况下，精确优先
     *
     * @return
     */
    @RequestMapping("/antTest0?")
    public String antTest02() {
        return "success";
    }

    /**
     * *：能替代任意多个字符，和一层路径
     *
     * @return
     */
    @RequestMapping("/antTest0*")
    public String antTest03() {
        return "success";
    }

    /**
     * *：能替代任意多个字符，和一层路径
     *
     * @return
     */
    @RequestMapping("/a/*/antTest0")
    public String antTest04() {
        return "success";
    }

    /**
     * **：能替代多层路径
     *
     * @return
     */
    @RequestMapping("/a/**/antTest0")
    public String antTest05() {
        return "success";
    }

    /**
     * 路径上可以有占位符
     * 占位符语法就是可以在任意路径的地方写一个{变量名}
     * @return
     */
    @RequestMapping("/user/{id}")
    public String pathVariableTest(@PathVariable("id") String id) {
        logger.info("id：{}", id);
        return "success";
    }

}
