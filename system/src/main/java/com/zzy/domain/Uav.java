package com.zzy.domain;

import lombok.Data;
import org.locationtech.jts.geom.Point;

import java.math.BigDecimal;
@Data
public class Uav extends BaseEntity{
    /**
     * 无人机id
     */
    private Long uavId;
    /**
     * 无人机名称
     */
    private String uavName;
    /**
     * 权限字符
     */
    private String powerKey;
    /**
     * 数据范围
     */
    private String dataScope;
    /**
     * 经纬度
     */
    private Point lonLat;
    /**
     * 海拔高度
     */
    private BigDecimal altitude;
    /**
     * 模型地址
     */
    private String url;
}
