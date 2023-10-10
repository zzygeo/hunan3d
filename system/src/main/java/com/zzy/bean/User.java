package com.zzy.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
@ApiModel(value = "user entity")
public class User extends BaseEntity {
    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "用户名")
    private String userName;
    @ApiModelProperty(value = "手机号")
    private String phone;
    @ApiModelProperty(value = "邮箱")
    private String email;
    @ApiModelProperty(value = "性别")
    private String sex;
    @ApiModelProperty(value = "用户状态")
    private String status;
    @ApiModelProperty(value = "角色id")
    private Long roleId;
    @ApiModelProperty(value = "最后登录ip")
    private String loginIp;
    @ApiModelProperty(value = "最后登录时间")
    private Date loginTime;
}
