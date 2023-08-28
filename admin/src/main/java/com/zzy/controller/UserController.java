package com.zzy.controller;

import com.zzy.domain.User;
import com.zzy.domain.vo.LoginVo;
import com.zzy.page.Paging;
import com.zzy.result.Result;
import com.zzy.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        // 判断菜单权限
        // 判断用户是否存在,手机号唯一
        boolean b = userService.addUser(user);
        return b ? Result.ok() : Result.fail();
    }

    // 用户登陆
    @PostMapping("/login")
    @ApiOperation(value = "用户登录")
    public Result login(@RequestBody LoginVo loginVo) {
        // 判断用户是否存在，账号密码是否正确，账号是否禁用
        // 判断验证码是否正确
        // 若都通过则登录成功
        return null;
    }

    // 发送验证码
    @GetMapping("/getCode")
    @ApiOperation(value = "发送验证码")
    public Result sendCode() {
        // 随机生产验证码，生成图片的字符串形式
        // 将验证码存入session等进行存储
        return null;
    }

    // 用户更新
    @PostMapping
    @ApiOperation(value = "用户更新")
    public Result updateUser(@RequestBody User user) {
        // 判断菜单权限
        return null;
    }

    // 根据id删除用户
    @DeleteMapping
    @ApiOperation(value = "根据用户id删除用户")
    public Result deleteUser(@RequestParam(value = "userId") Long userId) {
        // 判断菜单权限
        return null;
    }

    // 根据id查询用户
    @GetMapping
    @ApiOperation(value = "根据id查询用户")
    public Result<User> getUserById(@RequestParam(value = "userId") Long userId) {
        // 判断菜单权限
        return null;
    }

    // 根据id更新用户状态
    @PostMapping("/setStatus")
    @ApiOperation(value = "根据id更新用户状态")
    public Result setStatus(@RequestParam(value = "userId") Long userId, String status) {
        // 判断菜单权限
        return null;
    }

    // 分页查询用户
    @GetMapping("/page")
    @ApiOperation(value = "分页查询用户")
    public Paging<User> page(@RequestParam(value = "page") Integer page, @RequestParam(value = "pageSize") Integer pageSize, String userName) {
        // 判断菜单权限
        return null;
    }
}
