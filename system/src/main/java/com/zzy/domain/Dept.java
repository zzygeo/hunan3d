package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "dept entity", description = "部门类")
@Data
public class Dept {
    /**
     * 部门id
     */
    @ApiModelProperty(value = "部门id")
    private Long deptId;
    /**
     * 部门名称
     */
    @ApiModelProperty(value = "部门名称")
    private  String deptName;
    /**
     * 部门标识符
     */
    @ApiModelProperty(value = "部门标识符")
    private String deptKey;
    /**
     * 父级id
     */
    @ApiModelProperty(value = "父级id")
    private Long parentId;
    /**
     * 负责人名字
     */
    @ApiModelProperty(value = "负责人名字")
    private String name;
    /**
     * 负责人电话
     */
    @ApiModelProperty(value = "负责人电话")
    private String phone;
    /**
     * 负责人邮箱
     */
    @ApiModelProperty(value = "负责人邮箱")
    private String email;
    /**
     * 部门状态
     */
    @ApiModelProperty(value = "部门状态")
    private String status;
}
