package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.locationtech.jts.geom.Point;

import java.math.BigDecimal;
@Data
@ApiModel(value = "uav entity")
public class Uav extends BaseEntity{
    /**
     * 无人机id
     */
    @ApiModelProperty(value = "无人机id")
    private Long uavId;
    /**
     * 无人机名称
     */
    @ApiModelProperty(value = "无人机名称")
    private String uavName;
    /**
     * 经纬度
     */
    @ApiModelProperty(value = "经纬度")
    private Point lonLat;
    /**
     * 海拔高度
     */
    @ApiModelProperty(value = "高度")
    private BigDecimal altitude;
    /**
     * 模型地址
     */
    @ApiModelProperty(value = "模型地址")
    private String url;
    /**
     * 部门id
     */
    @ApiModelProperty(value = "部门id")
    private Long deptId;
}
