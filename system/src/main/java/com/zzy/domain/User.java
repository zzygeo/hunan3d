package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "user entity")
public class User extends BaseEntity{
    /**
     * 用户id
     */
    @ApiModelProperty(value = "用户id，系统自动生成")
    private Long id;
    /**
     * 姓名
     */
    @ApiModelProperty(value = "用户姓名")
    private String name;
    /**
     * 用户名
     */
    @ApiModelProperty(value = "用户名")
    private String username;
    /**
     * 密码
     */
    @ApiModelProperty(value = "密码")
    private String password;
    /**
     * 邮箱
     */
    @ApiModelProperty(value = "邮箱")
    private String email;
    /**
     * 联系电话
     */
    @ApiModelProperty(value = "联系电话")
    private String phone;
    /**
     * 角色id
     */
    @ApiModelProperty(value = "角色id")
    private Long roleId;
    /**
     * 用户状态
     */
    @ApiModelProperty(value = "用户状态")
    private String status;
}
