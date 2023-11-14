package com.example.missyou.dto;

import com.example.missyou.validators.PasswordEqual;
import lombok.*;
import org.hibernate.validator.constraints.Length;

import javax.validation.Valid;

@Data
//自动生成全参构造函数(参数不能为空)
//@AllArgsConstructor
//自动生成无参构造函数
//@NoArgsConstructor
//@RequiredArgsConstructor
@Builder
@PasswordEqual(message = "两次密码不一致")
public class PersonDTO {
    @Length(min = 2,max = 10,message = "xxxxxx")
    private String name;
    private Integer age;
//    @Valid
//    private SchoolDTO schoolDTO;
    private String password1;
    private String password2;
}
