package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzy.entity.BaseEntity;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user")
@ApiModel(value = "User对象", description = "")
public class User extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    @TableId(value = "user_id", type = IdType.AUTO)
    private Long userId;

    @ApiModelProperty("用户名")
    @TableField("username")
    private String username;

    @ApiModelProperty("电话")
    @TableField("phone")
    private String phone;

    @ApiModelProperty("邮箱")
    @TableField("email")
    private String email;

    @ApiModelProperty("性别，0表示男, 1表示女")
    @TableField("sex")
    private String sex;

    @ApiModelProperty("用户状态，1表示使用，0表示停用")
    @TableField("status")
    private String status;

    @ApiModelProperty("用户角色，一个用户只能有一个角色")
    @TableField("role_id")
    private Long roleId;

    @ApiModelProperty("最后登陆ip")
    @TableField("login_ip")
    private String loginIp;

    @ApiModelProperty("最后登陆时间")
    @TableField("login_time")
    private LocalDateTime loginTime;

    @ApiModelProperty(value = "密码", hidden = true)
    @TableField("password")
    private String password;
}
