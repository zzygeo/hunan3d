package com.zzy.domain;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class Point extends BaseEntity{
    /**
     * 点id
     */
    private Long pointId;
    /**
     * 点名称
     */
    private String pointName;
    /**
     * 经纬度
     */
    private org.locationtech.jts.geom.Point point;
    /**
     * 高度
     */
    private BigDecimal altitude;
    /**
     * 权限字符
     */
    private String powerKey;
    /**
     * 数据范围
     */
    private String dataScope;
    /**
     * 台账报告url
     */
    private String reportUrl;
    /**
     * 全景图地址
     */
    private String imageUrl;
}
