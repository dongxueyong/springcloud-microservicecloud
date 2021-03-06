package com.jeesoul.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {   // boot -> spring  applicationContext.xml ---- @Configuration 配置。 ConfigBean == applicationContext.xml

    /**
     * RestTemplate 提供了多种便捷访问远程http服务的方法
     * 是一种简单便捷的访问restful服务模板类，是Spring提供的用于访问REST服务的客户端模板工具集
     *
     * @return
     */
    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

}
/**
 * @Bean public UserService
 */
// applicationContext.xml == ConfigBean(@Configuration)
// <bean id="userService" class="cn.fllday.zhdy.service.UserServiceImpl" />
