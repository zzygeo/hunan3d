package com.zzy.controller;

import com.zzy.domain.User;
import com.zzy.result.Result;
import com.zzy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(value = "用户相关")
public class UserController {
    @Autowired
    private UserService userService;
    // 注册用户
    @PostMapping
    @ApiOperation(value = "添加用户")
    public Result addUser(@RequestBody User user) {
        // 判断用户是否存在
        boolean b = userService.addUser(user);
        return b ? Result.ok() : Result.fail();
    }
    // 用户登陆
    // 用户更新
    // 根据id删除用户
    // 根据id查询用户
    // 根据id停用用户
    // 分页查询用户
}
