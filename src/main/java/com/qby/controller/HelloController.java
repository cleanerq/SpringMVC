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
        logger.info("hello方法执行");
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

    /**
     * 以相对路径形式
     *
     * @return
     */
    @RequestMapping("/toHello")
    public String toHello() {
        logger.info("hello方法执行");
        // 视图解析器自动拼串
        return "../../hello";
    }

    /**
     * forward:转发到一个页面
     * 一定要加上 / 不加 / 就是相对路径
     *
     * @return
     */
    @RequestMapping("/toHello01")
    public String toHello01() {
        logger.info("toHello01 方法执行");
        // 视图解析器自动拼串
        return "forward:/hello1.jsp";
    }

    @RequestMapping("/toHello02")
    public String toHello02() {
        logger.info("toHello02 方法执行");
        // 视图解析器自动拼串
        return "forward:/hello";
    }

    /**
     * 重定向到hello.jsp页面
     * 有前缀的的转发和重定向操作，配置的视图解析器就不会进行拼串操作了
     * 转发 forward:转发的路径
     * 重定向 redirect:重定向的路径
     *       /hello.jsp:代表就是从当前项目下开始:springMVC会为路径自动拼接上项目名
     *       原生的Servlet 重定向 /路径需要加上项目名 才能成功
     *       response.sendRedirect("/hello.jsp")
     *
     * @return
     */
    @RequestMapping("/toHello03")
    public String toHello03() {
        logger.info("toHello03 方法执行");
        return "redirect:/hello.jsp";
    }

    @RequestMapping("/toHello04")
    public String toHello04() {
        logger.info("toHello04 方法执行");
        return "redirect:/toHello03";
    }


    @RequestMapping("/toLoginPage")
    public String toLoginPage() {
        return "login";
    }

    @RequestMapping("/toLoginPageF")
    public String toLoginPageF() {
        return "forward:/WEB-INF/pages/login.jsp";
    }
}
