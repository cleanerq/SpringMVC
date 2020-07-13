package com.qby.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author qby
 * @date 2020/7/11 0:14
 */
@Controller
public class UploadController {

    @RequestMapping("/upload")
    public String upload(String username,
                         @RequestParam("headerimg") MultipartFile multipartFile,
                         Model model) {

        System.out.println("上传的文件信息");
        System.out.println("上传的文件名字:" + multipartFile.getName());
        System.out.println("上传的文件名字:" + multipartFile.getOriginalFilename());
        model.addAttribute("msg", "文件上传成功！");
        try {
            multipartFile.transferTo(new File("f:\\hahas.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("msg", e.getMessage());
        }


        return "forward:/uploadjsp.jsp";
    }

    /**
     * 多文件上传
     *
     * @param username
     * @param multipartFile
     * @param model
     * @return
     */
    @RequestMapping("/uploads")
    public String uploads(String username,
                          @RequestParam("headerimg") MultipartFile[] multipartFile,
                          Model model) {

        System.out.println("上传的文件信息");


        try {

            for (MultipartFile file : multipartFile) {
                if (!file.isEmpty()) {
                    model.addAttribute("msg", "文件上传成功！");
                    file.transferTo(new File("f:\\haha\\" + file.getOriginalFilename()));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            model.addAttribute("msg", e.getMessage());
        }


        return "forward:/uploadjsp.jsp";
    }
}
