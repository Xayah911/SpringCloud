package com.atguigu.springcloud.alibaba;

/**
 * @Author Liu
 * @Date 2023/5/24 - 21:01
 **/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83{
    public static void main(String[] args){
        SpringApplication.run(OrderNacosMain83.class,args);
    }
}
