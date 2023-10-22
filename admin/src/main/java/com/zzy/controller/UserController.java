package com.zzy.controller;

import com.zzy.dto.user.UserAddDTO;
import com.zzy.entity.User;
import com.zzy.result.Result;
import com.zzy.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@RestController
@Api(value = "用户管理")
@Validated
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping
    @ApiOperation(value = "添加用户")
    public Result addUser(@Valid @RequestBody UserAddDTO userAddDTO) {
        boolean add = userService.add(userAddDTO);
        return add ? Result.success() : Result.error();
    }

    @GetMapping("/{userId}")
    @ApiOperation(value = "根据userId获取用户")
    public Result getUserById(@PathVariable @NotNull @Positive Long userId) {
        User user = userService.selectById(userId);
        return user != null ? Result.success("查询成功", user) : Result.success("不存在的用户", null);
    }
}
