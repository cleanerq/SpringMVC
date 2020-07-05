package com.qby.util;

import com.qby.bean.Employee;
import com.qby.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

/**
 * 将String转换为Employee对象
 * @author qby
 * @date 2020/7/5 17:03
 */
public class MyStringToEmployeeConverter implements Converter<String, Employee> {
    @Autowired
    private DepartmentDao departmentDao;

    /**
     * 自定义的转换规则
     *
     * @param source
     * @return
     */
    @Override
    public Employee convert(String source) {
        System.out.println(" 页面提交的字符串 " +source);
        Employee employee = new Employee();
        if (!StringUtils.isEmpty(source)) {
            String[] sz = source.split("-");
            employee.setLastName(sz[0]);
            employee.setEmail(sz[1]);
            employee.setGender(Integer.parseInt(sz[2]));
            employee.setDepartment(departmentDao.getDepartment(Integer.parseInt(sz[3])));
        }
        return employee;
    }
}
