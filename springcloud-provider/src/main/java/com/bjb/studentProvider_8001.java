package com.bjb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //服务启动后，自动注册到Eureka
public class studentProvider_8001 {
    public static void main(String[] args) {
        SpringApplication.run(studentProvider_8001.class, args);
    }
}
