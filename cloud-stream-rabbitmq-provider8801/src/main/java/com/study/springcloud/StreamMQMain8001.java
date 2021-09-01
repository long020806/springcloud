package com.study.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author TODO
 * @date 2021/9/1 14:48
 **/
@SpringBootApplication
@EnableEurekaClient
public class StreamMQMain8001 {
    public static void main(String[] args) {
        SpringApplication.run(StreamMQMain8001.class,args);
    }
}
