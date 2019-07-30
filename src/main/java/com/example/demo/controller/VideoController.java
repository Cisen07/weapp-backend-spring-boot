package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@RestController
@RequestMapping("/video")
public class VideoController {

    @RequestMapping("/upload")
    public String upload(HttpServletRequest request, @RequestParam(value = "file",
            required = false) MultipartFile file) throws IOException {
        System.out.println("执行视频upload");
        request.setCharacterEncoding("UTF-8");
        System.out.println("执行视频上传");
        String user = request.getParameter("user");
        System.out.println("the user is " + user);
        if(!file.isEmpty()) {
            System.out.println("成功获取视频");
            String fileName = file.getOriginalFilename();
            String path;
            String type;
            type = fileName.indexOf(".") != -1 ? fileName.substring(fileName.lastIndexOf(".") + 1, fileName.length()) : null;
            System.out.println("视频初始名称为：" + fileName + " 类型为：" + type);
            if (type != null) {
                if ("MP4".equals(type.toUpperCase())) {
                    // 项目在容器中实际发布运行的根路径
                    String realPath = "E:\\apache\\uploadForTomcat\\video\\";
//                    String realPath = request.getSession().getServletContext().getRealPath("/");
                    // 自定义的文件名称
                    String trueFileName = String.valueOf(System.currentTimeMillis()) + fileName;
                    // 设置存放图片文件的路径
                    path = realPath + trueFileName;
                    System.out.println("存放视频文件的路径:" + path);
                    file.transferTo(new File(path));
                    System.out.println("视频文件成功上传到指定目录下\n");
                }else {
                    System.out.println("不是我们想要的文件类型,请按要求重新上传\n");
                    return "error1";
                }
            }else {
                System.out.println("文件类型为空\n");
                return "error2";
            }
        }else {
            System.out.println("没有找到相对应的文件\n");
            return "error3";
        }
        return "success";
    }
}
