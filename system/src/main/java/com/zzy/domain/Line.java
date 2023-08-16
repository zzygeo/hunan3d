package com.zzy.domain;

import lombok.Data;

@Data
public class Line extends BaseEntity{
    /**
     * 线路id
     */
    private Long lineId;
    /**
     * 线路名称
     */
    private String lineName;
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
