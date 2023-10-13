package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
@TableName("organization")
@ApiModel(value = "Organization对象", description = "")
public class Organization extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("组织id")
    @TableId(value = "organization_id", type = IdType.AUTO)
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

    @ApiModelProperty("备注")
    @TableField("remark")
    private String remark;


}
