package com.qby.controller;

import com.qby.bean.Employee;
import com.qby.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.net.ssl.HttpsURLConnection;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    /**
     * @param body
     * @return
     * @RequestBody 请求体 获取一个请求的请求体
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        return null;
    }

    /**
     * 将返回数据放在响应体中
     *
     * @return
     */
//    @ResponseBody
    @RequestMapping("/haha")
    public ResponseEntity<String> haha() {

        HttpStatus httpStatus;

        MultiValueMap<String, String> headers = new HttpHeaders();
        String body = "<h1>success</h1>";
        headers.add("Set-Cookie", "username=hahaha");

        ResponseEntity<String> responseEntity = new ResponseEntity<String>(body, headers, HttpStatus.OK);
        return responseEntity;
    }

    @RequestMapping("/download")
    public ResponseEntity<byte[]> download(HttpServletRequest request) {
        // 得到要下载的文件流
        ServletContext servletContext = request.getServletContext();
        String realPath = servletContext.getRealPath("/index.jsp");
        ResponseEntity<byte[]> responseEntity = null;
        try {
            FileInputStream fileInputStream = new FileInputStream(realPath);

            byte[] tmp = new byte[fileInputStream.available()];

            fileInputStream.read(tmp);

            fileInputStream.close();
            MultiValueMap<String, String> headers = new HttpHeaders();

            headers.set("Content-Disposition", "attachment;filename=indes.jsp");
             responseEntity = new ResponseEntity<byte[]>(tmp, headers, HttpStatus.OK);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return responseEntity;
    }
}
