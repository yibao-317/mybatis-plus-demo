package com.yibao.mybatisplus.entity;

import lombok.Data;
import lombok.ToString;

/**
 * @author liyi
 * @create 2021 -10 -19 -17:25
 */
// 视图类：product + user
@Data
@ToString
public class ProductVO {
    private Integer pid;
    private String pname;
    private Integer uid;
    private String uname;
}
