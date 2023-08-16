package com.zzy.domain;

import lombok.Data;

@Data
public class Tower extends BaseEntity{
    /**
     * 杆塔id
     */
    private Long towerId;
    /**
     * 杆塔名称
     */
    private String towerName;
    /**
     * 权限字符
     */
    private String powerKey;
    /**
     * 数据范围
     */
    private String dataScope;
    /**
     * 模型地址
     */
    private String url;
}
