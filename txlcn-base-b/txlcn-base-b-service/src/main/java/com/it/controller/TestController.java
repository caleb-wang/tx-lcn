package com.it.controller;

import com.it.pojo.TestPO;
import com.it.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 19:55
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/insert")
    public String insert(@RequestParam("name") String name){
        TestPO po = new TestPO();
        po.setName(name);
        testService.insert(po);
        return "";
    }
}
