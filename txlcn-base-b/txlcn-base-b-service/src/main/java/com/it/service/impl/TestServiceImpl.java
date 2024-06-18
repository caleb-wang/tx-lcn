package com.it.service.impl;

import com.codingapi.txlcn.tc.annotation.LcnTransaction;
import com.it.mapper.TestMapper;
import com.it.pojo.TestPO;
import com.it.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 17:44
 */
@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;


    @Override
    @Transactional
    @LcnTransaction
    public void insert(TestPO po) {
        testMapper.insert(po);
    }
}
