package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "tower entity", description = "线路杆塔类")
public class Tower extends BaseEntity{
    /**
     * 杆塔id
     */
    @ApiModelProperty(value = "杆塔id")
    private Long towerId;
    /**
     * 杆塔名称
     */
    @ApiModelProperty(value = "杆塔名称")
    private String towerName;
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
