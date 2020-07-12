package com.qby.locale;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @author qby
 * @date 2020/7/12 11:47
 */
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {

        Locale locale = request.getLocale();
        String localeStr = request.getParameter("locale");

        // 如果带了locale 参数就用参数指定的区域信息 如果没带就用请求头的信息
        if (!StringUtils.isEmpty(localeStr)) {
            String[] sz = localeStr.split("_");
            locale = new Locale(sz[0], sz[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request,
                          HttpServletResponse response, Locale locale) {
        throw new UnsupportedOperationException(
                "Cannot change HTTP accept header - use a different locale resolution strategy");
    }
}
