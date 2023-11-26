package com.example.missyou.api.v1;

import com.example.missyou.dto.PersonDTO;
import com.example.missyou.exception.http.ForbiddenException;
import com.example.missyou.exception.http.NotFoundException;
import com.example.missyou.service.BannerService;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Max;
import java.awt.*;

@RestController
@RequestMapping("/banner")
@Validated
public class BannerController {
    @Autowired
    private BannerService bannerService;

    @GetMapping("/name/{name}")
    public void getByName(@PathVariable String name){


    }
    @PostMapping("/test/{id}")
    public PersonDTO test(@PathVariable @Range(min = 1,max = 10,message = "不可以超过10") Integer id,
                          @RequestParam @Length(min = 8) String name,
                          @RequestBody @Validated PersonDTO person) throws Exception {
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
