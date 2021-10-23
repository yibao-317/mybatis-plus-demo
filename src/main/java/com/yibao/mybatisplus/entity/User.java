package com.yibao.mybatisplus.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * 实体类：User
 *
 * @author liyi
 * @create 2021 -10 -19 -11:42
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName(value = "user")  // 用于 Mybatis-Plus 去数据库找表，默认是找类名
public class User {
    @TableId(value = "id", type = IdType.AUTO)  // 数据库主键名称映射
    private Integer id;
    @TableField(value = "name")  // 数据库字段名称映射（非主键）
    private String name;
    @TableField(select = false)
    private Integer age;
    @TableField(value = "sex", exist = false) // 声明该字段不是数据库字段
    private String sex;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    @Version
    private Integer version;  // 乐观锁

    private StatusEnum status; // 状态

    private Status2Enum status2;  // 状态2

    @TableLogic
    private Integer flag;  // 逻辑删除
}
