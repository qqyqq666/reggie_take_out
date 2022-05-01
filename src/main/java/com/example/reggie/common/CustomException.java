package com.example.reggie.common;

/**
 * @author JlX
 * @create 2022-05-01 10:08
 */

/**
 * 自定义业务异常类
 */
public class CustomException extends RuntimeException {
    public CustomException(String message){
        super(message);
    }
}

