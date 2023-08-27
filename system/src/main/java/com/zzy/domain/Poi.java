package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.locationtech.jts.geom.Point;

import java.math.BigDecimal;

/**
 * 兴趣点表
 */
@Data
@ApiModel(value = "poi entity", description = "标记点类")
public class Poi extends BaseEntity{
    /**
     * 标记点id
     */
    @ApiModelProperty(value = "标记点id")
    private Long poiId;
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id")
    private Long userId;
    /**
     * 描述信息
     */
    @ApiModelProperty(value = "描述")
    private String description;
    /**
     * icon字符串名称
     */
    @ApiModelProperty(value = "icon字符串名称")
    private String iconName;
    /**
     * 点填充信息
     */
    @ApiModelProperty(value = "点填充信息")
    private String fillColor;
    /**
     * 经纬度
     */
    @ApiModelProperty(value = "经纬度")
    private Point lonLat;
    /**
     * 高度
     */
    @ApiModelProperty(value = "高度")
    private BigDecimal altitude;
}
