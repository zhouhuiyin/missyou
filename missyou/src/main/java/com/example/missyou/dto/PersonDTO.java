package com.example.missyou.dto;

import lombok.*;

@Data
//自动生成全参构造函数(参数不能为空)
//@AllArgsConstructor
//自动生成无参构造函数
//@NoArgsConstructor
//@RequiredArgsConstructor
@Builder
public class PersonDTO {
    private String name;
    private Integer age;
}
