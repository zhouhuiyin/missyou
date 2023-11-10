package com.example.missyou.api.v1;

import com.example.missyou.exception.http.ForbiddenException;
import com.example.missyou.exception.http.NotFoundException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;

@RestController
@RequestMapping("/banner")
public class BannerController {
    @GetMapping("/test")
    public String test() throws Exception {
//        throw new Exception("这里出错了");
//        return "hello world";
        throw new ForbiddenException(10001);
    }
}
