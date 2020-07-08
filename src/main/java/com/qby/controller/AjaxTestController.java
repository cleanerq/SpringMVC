package com.qby.controller;

import com.qby.bean.Employee;
import com.qby.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;

/**
 * @author qby
 * @date 2020/7/9 0:08
 */
@Controller
public class AjaxTestController {
    @Autowired
    EmployeeDao employeeDao;

    /**
     * 将返回的数据放在响应体中
     * 如果是对象，jackson包自动将对象转为json格式
     *
     * @return
     */
    @ResponseBody
    @RequestMapping("/getallajax")
    public Collection<Employee> ajaxGetAll() {
        Collection<Employee> all = employeeDao.getAll();
        return all;
    }
}
