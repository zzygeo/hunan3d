package com.zzy.dto.role;

import com.zzy.validate.anotation.ZeroOrOne;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@Getter
@Setter
@ApiModel(value = "角色分页查询DTO")
public class RolePageDTO {
    @Positive
    @NotNull
    @ApiModelProperty(value = "页码数", required = true)
    private Integer pageNum;
    @Positive
    @NotNull
    @ApiModelProperty(value = "每页展示的数量", required = true)
    private Integer pageSize;
    @Size(max = 32)
    @ApiModelProperty(value = "角色名称")
    private String roleName;
    @ZeroOrOne
    @ApiModelProperty(value = "角色状态")
    private String status;
}
