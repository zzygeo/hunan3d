package com.zzy.domain;

import lombok.Data;

@Data
public class User extends BaseEntity{
    /**
     * 用户id
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系电话
     */
    private String phone;
    /**
     * 角色id
     */
    private Long roleId;
    /**
     * 用户状态
     */
    private String status;
}
