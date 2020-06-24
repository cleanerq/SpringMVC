package com.qby.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author qby
 * @date 2020/6/24 17:49
 */
@Controller
public class RestController {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @RequestMapping("/resttest")
    public String toRestPage() {
        return "resttest";
    }

    @RequestMapping(value = "/book/{bid}", method = RequestMethod.POST)
    public String addBook(@PathVariable("bid") Integer bid) {
        logger.info("增加了{}", bid);
        return "redirect:/success";
    }

    @RequestMapping(value = "/book/{bid}", method = RequestMethod.DELETE)
    public String deleteBook(@PathVariable("bid") Integer bid) {
        logger.info("删除了{}", bid);
        return "redirect:/success";
    }

    @RequestMapping(value = "/book/{bid}", method = RequestMethod.PUT)
    public String modifyBook(@PathVariable("bid") Integer bid) {
        logger.info("更新了{}", bid);
        return "redirect:/success";
    }

    @RequestMapping(value = "/book/{bid}", method = RequestMethod.GET)
    public String queryBook(@PathVariable("bid") Integer bid) {
        logger.info("查询了{}", bid);
        return "redirect:/success";
    }

    @RequestMapping("/success")
    public String success() {
        return "success";
    }
}
