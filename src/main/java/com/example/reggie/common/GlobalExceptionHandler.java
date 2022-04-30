package com.example.reggie.common;

/**
 * @author JlX
 * @create 2022-04-30 9:22
 */

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLIntegrityConstraintViolationException;

/**
 * 全局异常处理
 */
@ControllerAdvice(annotations = {RestController.class, Controller.class})//拦截加了RestController和Controller注解的类
@ResponseBody
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 异常处理方法
     * @return
     */
    @ExceptionHandler(SQLIntegrityConstraintViolationException.class)
    public R<String> exceptionHandler(SQLIntegrityConstraintViolationException ex){
        log.error(ex.getMessage());

        if(ex.getMessage().contains("Duplicate entry")){
            String[] split = ex.getMessage().split(" ");
            //Duplicate entry 'zhangsan' for key 'idx_username'  按照空格分开
            String msg = split[2] + "已存在"; //下标2是重复的字段
            return R.error(msg);
        }

        return R.error("未知错误");
    }
}
