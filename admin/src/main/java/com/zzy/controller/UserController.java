package com.zzy.controller;

import com.zzy.bean.User;
import com.zzy.result.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户接口")
public class UserController {
    @ApiOperation(value = "根据id查询用户")
    @GetMapping
    public Result selectById(Long userId) {
        return Result.ok();
    }
    @ApiOperation(value = "添加用户")
    @PostMapping
    public Result insert(User user) {
        return Result.ok();
    }
}
