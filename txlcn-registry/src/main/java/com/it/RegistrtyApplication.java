package com.it;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 16:30
 */

@SpringBootApplication
@EnableEurekaServer
public class RegistrtyApplication {

    public static void main(String[] args){
        SpringApplication.run(RegistrtyApplication.class);
    }
}
