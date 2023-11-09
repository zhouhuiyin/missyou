package com.example.missyou.api.v1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/banner")
public class BannerController {
    @GetMapping("/test")
    public String test() throws Exception {
        throw new Exception("这里出错了");
//        return "hello world";
    }
}
