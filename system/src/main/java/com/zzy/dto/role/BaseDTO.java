package com.zzy.dto.role;

import com.zzy.validate.anotation.ZeroOrOne;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.validation.constraints.*;

@ApiModel(value = "role dto")
@Getter
@Setter
@Accessors(chain = true)
public class BaseDTO {
    @ApiModelProperty(value = "角色名称", required = true)
    @NotEmpty
    @Size(max = 32)
    private String roleName;

    @ApiModelProperty(value = "角色关键字", required = true)
    @NotEmpty
    @Size(max = 32)
    private String roleKey;

    @ApiModelProperty("角色排序")
    @PositiveOrZero
    private Integer roleSort;

    @ApiModelProperty("角色状态，1表示使用，0表示停用")
    @ZeroOrOne
    private String status;

    @ApiModelProperty("备注")
    private String remark;
}
