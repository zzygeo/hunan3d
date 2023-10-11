package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
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
@TableName("organization_data")
@ApiModel(value = "OrganizationData对象", description = "")
public class OrganizationData implements Serializable {

    private static final long serialVersionUID = 1L;
    @MppMultiId
    @TableField("organization_id")
    private Long organizationId;
    @MppMultiId
    @TableField("data_id")
    private Long dataId;


}
