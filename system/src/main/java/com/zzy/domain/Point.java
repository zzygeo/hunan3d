package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
@Data
@ApiModel(value = "point entity", description = "杆塔点类")
public class Point extends BaseEntity{
    /**
     * 点id
     */
    @ApiModelProperty(value = "点id")
    private Long pointId;
    /**
     * 点名称
     */
    @ApiModelProperty(value = "点名称")
    private String pointName;
    /**
     * 经纬度
     */
    @ApiModelProperty(value = "经纬度")
    private org.locationtech.jts.geom.Point lonLat;
    /**
     * 高度
     */
    @ApiModelProperty(value = "高度")
    private BigDecimal altitude;
    /**
     * 台账报告url
     */
    @ApiModelProperty(value = "台账报告id")
    private String reportUrl;
    /**
     * 全景图地址
     */
    @ApiModelProperty(value = "全景图地址")
    private String imageUrl;
    /**
     * 部门id
     */
    @ApiModelProperty(value = "部门id")
    private Long deptId;
    /**
     * 线id
     */
    @ApiModelProperty(value = "线路id")
    private Long lineId;
}
