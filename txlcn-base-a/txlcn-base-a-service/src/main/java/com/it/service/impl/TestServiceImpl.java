package com.it.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.it.client.TestClient;
import com.it.mapper.TestMapper;

import com.it.pojo.Goods;
import com.it.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 18:10
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;
    @Autowired
    private TestClient testClient;
    static Random rd = new Random();

    @Override
    @Transactional
    @LcnTransaction
    public void insert(Goods po) {

        testMapper.insert(po);
        //client调用B服务
        testClient.insert(po.getName()+"B");

        if (rd.nextInt() % 2 == 0) {
            int result = 100 / 0;
        }
    }
}
