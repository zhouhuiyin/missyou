package com.example.missyou.core;

import com.example.missyou.exception.http.HttpException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionAdvice {
    @ExceptionHandler(value = Exception.class)
    public void handleException(HttpServletRequest req, Exception e){
        System.out.println(e);
    }

    @ExceptionHandler(value = HttpException.class)
    public void handleHttpException(HttpServletRequest req,Exception e){
        System.out.println(e);
    }

}
