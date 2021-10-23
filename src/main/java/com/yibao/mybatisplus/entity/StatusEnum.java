package com.yibao.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.EnumValue;

/**
 * @author liyi
 * @create 2021 -10 -19 -15:43
 */
// 枚举类
public enum StatusEnum {
    WORK(1, "上班"),
    REST(2, "休息");

    @EnumValue
    private Integer code;  // 添加此注解，用于映射数据库 status 字段值
    private String msg;

    StatusEnum() {
    }

    StatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
