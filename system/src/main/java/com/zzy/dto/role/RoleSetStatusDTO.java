package com.zzy.dto.role;

import com.zzy.validate.anotation.ZeroOrOne;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@ApiModel(value = "角色状态修改DTO")
@Getter
@Setter
public class RoleSetStatusDTO {
    @ApiModelProperty(value = "角色id" ,required = true)
    @NotNull
    @Positive
    private Long roleId;
    @ApiModelProperty(value = "角色状态", required = true)
    @ZeroOrOne
    private String status;
}
