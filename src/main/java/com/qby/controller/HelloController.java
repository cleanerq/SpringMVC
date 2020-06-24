package com.qby.controller;

import com.qby.bean.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    /**
     *
     * @return
     */
    @RequestMapping("handle02")
    public String handle02(@RequestParam(value = "user", required = false, defaultValue = "dd") String username,
                           @RequestHeader("User-Agent") String userAgent) {
        logger.info("name:{} userAgent:{}", username, userAgent);
        return "success";
    }

    @RequestMapping("handle03")
    public String handle03(@CookieValue("JSESSIONID") String sessionId) {
        logger.info("JSESSIONID:{}", sessionId);
        return "success";
    }

    @RequestMapping("addBook")
    public String addBook(Book book) {
        logger.info(book.toString());
        return "success";
    }
}
