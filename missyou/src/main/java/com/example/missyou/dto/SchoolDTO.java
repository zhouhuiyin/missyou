package com.example.missyou.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Builder
@Getter
@Setter
public class SchoolDTO {
    @Length(min = 2)
    private String schoolName;
}
