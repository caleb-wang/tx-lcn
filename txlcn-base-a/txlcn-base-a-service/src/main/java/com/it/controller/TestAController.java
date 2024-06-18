package com.it.controller;

//import com.it.pojo.TestPO;
import com.it.pojo.Goods;
import com.it.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-18 11:49
 */
@RestController
@RequestMapping("/test")
public class TestAController {
    @Autowired
    private TestService testService;

    @GetMapping("/insert")
    public String insert(String name) throws Exception{
        Goods po = new Goods();
        po.setName(name);
        testService.insert(po);
        return "";
    }
}
