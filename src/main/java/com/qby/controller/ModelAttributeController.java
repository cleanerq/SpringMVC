package com.qby.controller;

import com.qby.bean.Addres;
import com.qby.bean.Book;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author qby
 * @date 2020/6/25 11:28
 */
@Controller
public class ModelAttributeController {
    private Logger logger = LoggerFactory.getLogger(getClass());
    private Object o1;
    private Object o2;

    /**
     *
     *
     * @param book
     * @param model BindingAwareModelMap类型
     * @return
     */
    @RequestMapping("/updateBook")
    public String updateBook(@ModelAttribute("haha") Book book, Model model) {
        o2 = model;

        logger.info(String.valueOf(o1 == o2));
        logger.info(book.toString());
        return "success";
    }

    /**
     *
     * @param model BindingAwareModelMap类型
     */
    @ModelAttribute
    public void hahaMyModelAttribute(Model model) {
        Book book = new Book(100, "西游记", "吴承恩", 98.98, 10, 98);
        Addres addres = new Addres();
        addres.setCity("d");
        addres.setProvince("e");
        addres.setStreet("a");

        book.setAddres(addres);
        model.addAttribute("haha", book);
        o1 = model;

        logger.info(model.getClass().toString());
        logger.info("从数据库中查询到的信息:{}", book.toString());
        logger.info("hahaMyModelAttribute方法 查询到图书并保存了");
    }
}
