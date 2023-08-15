package com.zzy.domain;

import lombok.Data;
import org.locationtech.jts.geom.Point;

import java.math.BigDecimal;

/**
 * 兴趣点表
 */
@Data
public class Poi extends BaseEntity{
    /**
     * 标记点id
     */
    private Long poiId;
    /**
     * 用户id
     */
    private Long userId;
    /**
     * 描述信息
     */
    private String description;
    /**
     * icon字符串名称
     */
    private String iconName;
    /**
     * 点填充信息
     */
    private String fillColor;
    /**
     * 经纬度
     */
    private Point lonLat;
    /**
     * 高度
     */
    private BigDecimal altitude;
}
