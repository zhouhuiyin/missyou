package com.example.missyou.api.v1;

import com.example.missyou.dto.PersonDTO;
import com.example.missyou.exception.http.ForbiddenException;
import com.example.missyou.exception.http.NotFoundException;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Max;
import java.awt.*;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @GetMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Max(10) Integer id) throws Exception {
//        throw new Exception("这里出错了");
//        return "hello world";
//        PersonDTO dto = new PersonDTO();
//        @Buider方式
        PersonDTO dto = PersonDTO.builder()
                .name("张三")
                .age(18)
                .build();
//        throw new ForbiddenException(10001);
        return dto;

    }

}
