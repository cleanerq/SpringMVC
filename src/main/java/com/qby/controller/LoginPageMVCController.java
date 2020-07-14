package com.qby.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

/**
 * @author qby
 * @date 2020/7/12 10:28
 */
@Controller
public class LoginPageMVCController {

    @Autowired
    private ResourceBundleMessageSource resourceBundleMessageSource;

    @RequestMapping("/toLoginPageMVC")
    public String toLoginPageMVC(Locale locale) {

        System.out.println(locale);

        System.out.println(resourceBundleMessageSource.getMessage("welcomeinfo", null, locale));

        return "login";
    }

    @RequestMapping("/toLoginPageMVCSession")
    public String toLoginPageMVCSession(HttpServletRequest request, Locale locale) {

//        String LOCALE_SESSION_ATTRIBUTE_NAME = SessionLocaleResolver.class.getName() + ".LOCALE";

        System.out.println(locale);

//        HttpSession session = request.getSession();

//        Locale localeL = null;
//
//        String localeStr = request.getParameter("locale");
//
//        // 如果带了locale 参数就用参数指定的区域信息 如果没带就用请求头的信息
//        if (!StringUtils.isEmpty(localeStr)) {
//            String[] sz = localeStr.split("_");
//            localeL = new Locale(sz[0], sz[1]);
//        }
//
//        session.setAttribute(LOCALE_SESSION_ATTRIBUTE_NAME, localeL);

        return "login";
    }
}
