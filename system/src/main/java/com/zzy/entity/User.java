package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
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
 * @since 2023-10-11
 */
@Getter
@Setter
@Accessors(chain = true)
@TableName("user")
@ApiModel(value = "User对象", description = "")
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户id")
    @TableId("user_id")
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

    @ApiModelProperty("创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;

    @ApiModelProperty("创建者")
    @TableField("create_by")
    private String createBy;

    @ApiModelProperty("更新时间")
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;

    @ApiModelProperty("更新者")
    @TableField("update_by")
    private String updateBy;


}
