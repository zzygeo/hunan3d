package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.zzy.entity.BaseEntity;
import java.io.Serializable;
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
@TableName("menu")
@ApiModel(value = "Menu对象", description = "")
public class Menu extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("菜单id")
    @TableId(value = "menu_id", type = IdType.AUTO)
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

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


}
