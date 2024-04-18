package com.github.osinn.example.multi.tenant.entity;

import java.util.Date;
import java.util.List;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * 用户表
 * @author czw
 */
@Data
public class User {

    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     * 名称
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    @TableField("test_type")
    private Integer testType;

    @TableField("test_date")
    private Date testDate;

    private Long role;
    private String phone;

    /**
     * 租户ID
     */
    private Long tenantId;

    @TableField(exist = false)
    private List<Role> roleList;

    public User() {
    }

    public User(Long id, String name, Integer age, Integer testType) {
        this.setId(id);
        this.name = name;
        this.age = age;
        this.testType = testType;
    }

    public User(String name, Integer age, Integer testType) {
        this.name = name;
        this.age = age;
        this.testType = testType;
    }

}
