package com.zzy.domain;

import lombok.Data;

@Data
public class Role extends BaseEntity{
    /**
     * 角色id
     */
    private Long roleId;
    /**
     * 角色名称
     */
    private String roleName;
    /**
     * 角色权限字符
     */
    private String roleKey;
    /**
     * 显示顺序
     */
    private Integer roleSort;
    /**
     * 数据范围
     */
    private String dataScope;
    /**
     * 角色状态
     */
    private String status;
}
