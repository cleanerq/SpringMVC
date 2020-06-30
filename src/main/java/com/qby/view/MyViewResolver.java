package com.qby.view;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;

import java.util.Locale;

/**
 * @author qby
 * @date 2020/6/30 23:40
 */
public class MyViewResolver implements ViewResolver, Ordered {
    private int order;

    @Override
    public View resolveViewName(String viewName, Locale locale) throws Exception {
        // 根据视图名返回视图对象
        if (viewName != null && viewName.startsWith("meinv:")) {
            return new MyView();
        } else {
            // 如果不能处理返回null即可
            return null;
        }
    }

    @Override
    public int getOrder() {
        return this.order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
