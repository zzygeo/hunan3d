package com.zzy.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.github.jeffreyning.mybatisplus.anno.MppMultiId;
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
@TableName("user_organization")
@ApiModel(value = "UserOrganization对象", description = "")
public class UserOrganization extends BaseEntity {

    private static final long serialVersionUID = 1L;
    @MppMultiId
    @TableField("user_id")
    private Long userId;
    @MppMultiId
    @TableField("organization_id")
    private Long organizationId;


}
