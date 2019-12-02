package com.jeesoul.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;


//@EnableEurekaClient    // 开启客户端注册进入到erureka服务中
@SpringBootApplication
//@RibbonClient(name="microservicecloud-dept",configuration=MyselfRule.class)
public class DeptConsumer80_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class, args);
    }
}
