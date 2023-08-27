package com.zzy.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "menu entity", description = "菜单类")
public class Menu extends BaseEntity{
    /**
     * 菜单id
     */
    @ApiModelProperty(value = "菜单id")
    private Long menuId;
    /**
     * 菜单名称
     */
    @ApiModelProperty(value = "菜单名称")
    private String menuName;
    /**
     * 父菜单id
     */
    @ApiModelProperty(value = "父菜单id")
    private Long parentId;
    /**
     * 显示顺序
     */
    @ApiModelProperty(value = "显示顺序")
    private Integer orderNum;
    /**
     * 路由地址
     */
    @ApiModelProperty(value = "路由地址")
    private String path;
    /**
     * 路由组件路径
     */
    @ApiModelProperty(value = "路由组件路径")
    private String component;
    /**
     * 路由参数
     */
    @ApiModelProperty(value = "路由参数")
    private String query;
    /**
     * 是否为外链
     */
    @ApiModelProperty(value = "是否为外链")
    private Integer isFrame;
    /**
     * 是否缓存
     */
    @ApiModelProperty(value = "是否缓存")
    private Integer isCache;
    /**
     * 菜单类型
     */
    @ApiModelProperty(value = "菜单类型")
    private String menuType;
    /**
     * 菜单状态
     */
    @ApiModelProperty(value = "菜单状态（是否可见）")
    private String visible;
    /**
     * 菜单状态
     */
    @ApiModelProperty(value = "菜单状态（是否禁用）")
    private String status;
    /**
     * 权限表示
     */
    @ApiModelProperty(value = "权限标识")
    private String perms;
    /**
     * 菜单图标
     */
    @ApiModelProperty(value = "菜单图标")
    private String icon;
}
