package com.it.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author wanglb@belink.com
 * @version V1.0
 * @title
 * @description
 * @date 2024-06-17 17:30
 */
@Data
@Table(name = "tb_test")
public class TestPO {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
}
