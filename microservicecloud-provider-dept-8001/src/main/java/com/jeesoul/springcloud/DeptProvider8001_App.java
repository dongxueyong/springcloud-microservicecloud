package com.jeesoul.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//@EnableEurekaClient    // 开启客户端注册进入到erureka服务中
//@EnableDiscoveryClient   // 服务发现
@SpringBootApplication
public class DeptProvider8001_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptProvider8001_App.class,args);
    }
}
