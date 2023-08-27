package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "line entity", description = "线路类")
public class Line extends BaseEntity{
    /**
     * 线路id
     */
    @ApiModelProperty(value = "线路id")
    private Long lineId;
    /**
     * 线路名称
     */
    @ApiModelProperty(value = "线路名称")
    private String lineName;
    /**
     * 模型地址
     */
    @ApiModelProperty(value = "模型地址")
    private String url;
}
