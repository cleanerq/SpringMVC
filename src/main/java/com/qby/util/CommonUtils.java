package com.qby.util;

import com.qby.bean.Employee;
import org.springframework.beans.BeanUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author qby
 * @date 2020/7/5 14:43
 */
public class CommonUtils {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Employee e = new Employee();
        e.setEmail("123");
        e.setLastName("456");
        e.setBirth(new Date());
        e.setId(1111);

        PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(Employee.class);

        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String name = propertyDescriptor.getName();



//            System.out.println(propertyDescriptor.getDisplayName());
            if (!"class".equals(name)) {
                Method readMethod = propertyDescriptor.getReadMethod();
                Object invoke = readMethod.invoke(e);
                System.out.println(invoke);
            }
        }
    }
}
