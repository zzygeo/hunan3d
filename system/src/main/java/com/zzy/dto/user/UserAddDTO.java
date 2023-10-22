package com.zzy.dto.user;

import com.zzy.validate.anotation.ZeroOrOne;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.*;

@ApiModel(value = "用户添加DTO")
@Getter
@Setter
public class UserAddDTO {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty
    @Size(min = 3, max = 32)
    private String username;

    @ApiModelProperty(value = "电话", required = true)
    @NotEmpty
    @Pattern(regexp = "^((13[0-9])|(14[5,7,9])|(15[0-3,5-9])|(166)|(17[3,5,6,7,8])|(18[0-9])|(19[8,9]))\\d{8}$",
    message = "手机号格式不正确")
    private String phone;

    @ApiModelProperty(value = "邮箱", required = true)
    @NotEmpty
    @Pattern(regexp = "^(\\w+([-.][A-Za-z0-9]+)*){3,18}@\\w+([-.][A-Za-z0-9]+)*\\.\\w+([-.][A-Za-z0-9]+)*$",
    message = "邮箱格式不正确")
    private String email;

    @ApiModelProperty(value = "性别，0表示男, 1表示女", required = true)
    @NotNull
    @ZeroOrOne
    private String sex;

    @ApiModelProperty("用户状态，1表示使用，0表示停用")
    @ZeroOrOne
    private String status;

    @ApiModelProperty(value = "用户角色，一个用户只能有一个角色", required = true)
    @NotNull
    @Positive
    private Long roleId;

    @ApiModelProperty(value = "用户密码", required = true)
    @NotEmpty
    @Size(min = 6, max = 100)
    private String password;
}
