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
@TableName("role")
@ApiModel(value = "Role对象", description = "")
public class Role implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("角色id")
    @TableId("role_id")
    private Long roleId;

    @ApiModelProperty("角色名称")
    @TableField("role_name")
    private String roleName;

    @ApiModelProperty("角色关键字")
    @TableField("role_key")
    private String roleKey;

    @ApiModelProperty("角色排序")
    @TableField("role_sort")
    private Integer roleSort;

    @ApiModelProperty("角色状态，1表示使用，0表示停用")
    @TableField("status")
    private String status;

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

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


}
