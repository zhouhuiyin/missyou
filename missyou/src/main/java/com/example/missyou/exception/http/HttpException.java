package com.example.missyou.exception.http;

import lombok.Data;

@Data
public class HttpException extends RuntimeException{
    protected Integer code;
    protected Integer httpStatusCode = 500;


}
