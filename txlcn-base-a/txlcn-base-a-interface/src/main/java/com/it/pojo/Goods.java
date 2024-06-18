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
 * @date 2024-06-18 14:04
 */
@Data
@Table(name = "tb_goods")
public class Goods {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Long id;
    private String name;
}
