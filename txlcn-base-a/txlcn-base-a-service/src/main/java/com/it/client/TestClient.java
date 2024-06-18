package com.it.client;

//import com.it.api.TestApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description FeignClient必须写服务提供方的服务名称,insert方法必须与提供方的controller方法声明完全一致;
 * 调用方不可以依赖提供方的任何类,"Feign客户端"写在调用方模块,且请求方式一致
 * @date 2024-06-17 17:53
 */
@FeignClient(value = "txlcn-base-b-service")
public interface TestClient{

    @GetMapping("/test/insert")
    public String insert(@RequestParam("name") String name);
}
