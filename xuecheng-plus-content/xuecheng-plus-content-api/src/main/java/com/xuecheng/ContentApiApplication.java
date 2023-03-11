package com.xuecheng;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author d
 * @version 1.0
 * @description TODO
 * @date 3/9/23 3:37 PM
 */
@EnableSwagger2Doc
@SpringBootApplication
public class ContentApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ContentApiApplication.class, args);
    }
}
