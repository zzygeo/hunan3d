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
@TableName("menu")
@ApiModel(value = "Menu对象", description = "")
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("菜单id")
    @TableId("menu_id")
    private Long menuId;

    @ApiModelProperty("菜单名称")
    @TableField("menu_name")
    private String menuName;

    @ApiModelProperty("父菜单id")
    @TableField("parent_id")
    private Long parentId;

    @ApiModelProperty("显示顺序")
    @TableField("order")
    private Integer order;

    @ApiModelProperty("路由地址")
    @TableField("path")
    private String path;

    @ApiModelProperty("组件路径")
    @TableField("component")
    private String component;

    @ApiModelProperty("路由参数")
    @TableField("query")
    private String query;

    @ApiModelProperty("菜单类型，M表示目录，C表示菜单")
    @TableField("menu_type")
    private String menuType;

    @ApiModelProperty("菜单状态，1表示启用，0表示停用")
    @TableField("status")
    private String status;

    @ApiModelProperty("菜单可见，1表示可见，0表示不可见")
    @TableField("visible")
    private String visible;

    @ApiModelProperty("菜单权限标识符")
    @TableField("perms")
    private String perms;

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
