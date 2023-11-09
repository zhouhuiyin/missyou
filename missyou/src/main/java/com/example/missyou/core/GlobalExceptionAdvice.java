package com.example.missyou.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value=Exception.class)
    public void handleException(HttpServletRequest req, Exception e){
        System.out.println("hello");
    }

}
