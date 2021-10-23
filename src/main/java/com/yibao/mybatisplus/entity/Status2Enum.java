package com.yibao.mybatisplus.entity;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author liyi
 * @create 2021 -10 -19 -15:58
 */
// 枚举类  ---  状态2 --- 用于测试
public enum Status2Enum implements IEnum<Integer> {
    ONE(1, "状态1"),
    TWO(2, "状态2");


    private Integer code;
    private String msg;

    Status2Enum() {
    }

    Status2Enum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getValue() {
        return this.code;
    }
}
