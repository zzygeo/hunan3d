package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "role entity")
public class Role extends BaseEntity{
    /**
     * 角色id
     */
    @ApiModelProperty(value = "角色id, 系统自动生成", example = "1")
    private Long roleId;
    /**
     * 角色名称
     */
    @ApiModelProperty(value = "角色名称", example = "管理员")
    private String roleName;
    /**
     * 角色权限字符
     */
    @ApiModelProperty(value = "角色权限字符", example = "admin")
    private String roleKey;
    /**
     * 显示顺序
     */
    @ApiModelProperty(value = "角色显示顺序", example = "1")
    private Integer roleSort;
    /**
     * 数据范围
     */
    @ApiModelProperty(value = "数据范围", example = "1")
    private String dataScope;
    /**
     * 角色状态
     */
    @ApiModelProperty(value = "角色状态", example = "0")
    private String status;
}
