package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("organization")
@ApiModel(value = "Organization对象", description = "")
public class Organization implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("组织id")
    @TableId("organization_id")
    private Long organizationId;

    @ApiModelProperty("组织名称")
    @TableField("organization_name")
    private String organizationName;

    @ApiModelProperty("组织状态，1表示使用，0表示停用")
    @TableField("status")
    private String status;

    @ApiModelProperty("删除标志，0表示不删除，1表示删除")
    @TableField("del_flag")
    @TableLogic
    private String delFlag;

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
