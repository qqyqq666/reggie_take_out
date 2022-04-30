package com.example.reggie;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @author JlX
 * @create 2022-04-29 16:59
 */
@Slf4j  //打印有关日志  使用log变量输出日志
@SpringBootApplication
@ServletComponentScan  //扫描过滤器的
public class ReggieApplication {
    public static void main(String[] args) {
        SpringApplication.run(ReggieApplication.class);
        log.info("项目启动成功");
    }
}
