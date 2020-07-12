package com.qby.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 1、集中处理所有异常的类加入到IOC容器中
 * 2、@ControllerAdvice 专门处理异常的类
 *
 * @author qby
 * @date 2020/7/12 15:14
 */
@ControllerAdvice
public class MyJiZhongExceptionController {

    /**
     * 告诉SpirngMVC 这个方法专门处理这个类发生的异常
     * 1、给方法上写一个Exception，用来接受发生的异常
     * 2、要携带异常信息，不能给参数位置写Model
     * 3、返回ModelAndView就行了
     * 4、如果有多个 @ExceptionHandler 都能处理这个异常，精确优先
     * 5、全局异常与本类同时存在，本类优先
     * @return
     */
    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView handleException01(Exception exception) {
        System.out.println("handleException01");

        ModelAndView mv = new ModelAndView("error");
        mv.addObject("ex", exception.getMessage());

        // 视图解析器处理
        return mv;
    }


    @ExceptionHandler(value = {NullPointerException.class})
    public ModelAndView handleException02(Exception exception) {
        System.out.println("handleException02");

        ModelAndView mv = new ModelAndView("error");
        mv.addObject("ex", exception.getMessage());

        // 视图解析器处理
        return mv;
    }

}
