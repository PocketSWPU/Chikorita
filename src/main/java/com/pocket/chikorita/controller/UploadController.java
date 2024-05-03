package com.pocket.chikorita.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;

/**
 * @author Pocket
 */
@RestController
public class UploadController {
    @Value("${upload.path}") // 配置在application.properties或application.yml中的文件上传路径
    private String uploadPath;

    @PostMapping("/upload")
    public String handleFileUpload(HttpServletRequest request) throws IOException {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = multipartRequest.getFile("file"); // 获取名为file的文件

        if (file != null && !file.isEmpty()) {
            String fileName = file.getOriginalFilename(); // 获取文件名
            File dest = new File(uploadPath + "/" + fileName); // 目标文件
            file.transferTo(dest); // 保存文件
            return "success"; // 返回图片URL，根据实际情况调整
        } else {
            return "fail";
        }
    }
}
