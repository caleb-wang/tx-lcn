package com.it;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 17:13
 */

@SpringBootApplication
@EnableFeignClients //springcloud feign调用
@EnableDiscoveryClient //springcloud服务发现
@MapperScan("com.it.mapper") //扫描mapper文件所在包
@EnableDistributedTransaction //开启LcnTransaction分布式事务框架
public class TxlcnBaseBServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnBaseBServiceApplication.class,args);
    }
}
