package com.qby.controller;

import com.qby.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/book")
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    public BookController() {
        System.out.println("BookController");
    }

    @RequestMapping("/hello")
    public String hello() {
        System.out.println(bookService);
        return "success";
    }
}
