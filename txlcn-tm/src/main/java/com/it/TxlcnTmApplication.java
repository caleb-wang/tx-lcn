package com.it;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 16:44
 */
@SpringBootApplication
@EnableTransactionManagerServer
public class TxlcnTmApplication {
    public static void main(String[] args) {
        SpringApplication.run(TxlcnTmApplication.class,args);
    }
}
