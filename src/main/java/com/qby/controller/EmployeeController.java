package com.qby.controller;

import com.qby.bean.Department;
import com.qby.bean.Employee;
import com.qby.dao.DepartmentDao;
import com.qby.dao.EmployeeDao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author qby
 * @date 2020/6/5 16:13
 */
@Controller
public class EmployeeController {

    private Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private DepartmentDao departmentDao;

    @GetMapping("/emps")
    public String list(Model model) {
        Collection<Employee> list = employeeDao.getAll();
        model.addAttribute("emps", list);

        return "emp/list";
    }

    /**
     * 去员工添加页面
     *
     * @param model
     * @return
     */
    @GetMapping("/emp")
    public String toAddPage(Model model) {

        model.addAttribute("employee", new Employee());
        return "emp/add";
    }

    /**
     * @param employee
     * @return
     */
    @PostMapping("/emp")
    public String addEmp(@Valid Employee employee, BindingResult bindingResult, Model model) {
        // 获取是否有校验错误
        boolean result = bindingResult.hasErrors();
        if (result) {
            List<FieldError> fieldErrors = bindingResult.getFieldErrors();
            Map<String, Object> map = new HashMap<>();
            fieldErrors.forEach(bean -> {
                System.out.println("错误消息提示：" + bean.getDefaultMessage());
                System.out.println("错误字段：" + bean.getField());
                System.out.println(bean);
                System.out.println("------");

                map.put(bean.getField(), bean.getDefaultMessage());
            });
            model.addAttribute("errorInfo", map);
            logger.info("有校验错误！");
            return "emp/add";
        } else {
            logger.info("插入");
            employeeDao.save(employee);
            // 重定向到员工列表
            return "redirect:/emps";
        }
    }

    @GetMapping("/emp/{id}")
    public String toEditPage(@PathVariable("id") Integer id, Model model) {
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee", employee);

        return "emp/edit";
    }

    @PutMapping("/emp")
    public String updateEmployee(Employee employee) {
        logger.info("修改");
        employeeDao.save(employee);
        return "redirect:/emps";
    }

    @DeleteMapping("/emp/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id, Model model) {
        employeeDao.delete(id);

        return "redirect:/emps";
    }

    @ModelAttribute
    public void myModelAttribute(@RequestParam(value = "id", required = false) Integer id, Model model) {
        if (id != null) {
            Employee employee = employeeDao.get(id);
            model.addAttribute("employee", employee);
        }
        // 把共通处理放在 @ModelAttribute里面
        Collection<Department> departments = departmentDao.getDepartments();
        model.addAttribute("depts", departments);
    }

    /**
     * 发送的请求是什么？
     * quickAdd?empinfo=empAdmin-admin@qq.com-1-101
     * <p>
     * 可以写一个自定义类型转换器让其工作
     *
     * @param employee
     * @return
     */
    @RequestMapping("/quickAdd")
    public String quickAdd(@RequestParam("empinfo") Employee employee) {
        employeeDao.save(employee);
        return "redirect:/emps";
    }
}
