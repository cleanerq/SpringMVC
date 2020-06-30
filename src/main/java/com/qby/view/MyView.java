package com.qby.view;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.View;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author qby
 * @date 2020/6/30 23:42
 */
public class MyView implements View {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public String getContentType() {
        return "text/html";
    }

    @Override
    public void render(Map<String, ?> model, HttpServletRequest request,
                       HttpServletResponse response) throws Exception {
        logger.info("model:{}", model);

        List<String> list = (List<String>) model.get("video");


        response.setContentType("text/html");
        response.getWriter().write("哈哈<h1>即将展现经常内容</h1>");

        list.forEach(str -> {
            try {
                response.getWriter().write("<a href='http://www.baidu.com'>下载" + str + ".avi</a><br>");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
