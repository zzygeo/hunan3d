package com.zzy.controller;
/**
 * 角色管理部分只允许管理员可见
 */

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zzy.domain.Role;
import com.zzy.page.Paging;
import com.zzy.result.Result;
import com.zzy.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.oas.annotations.EnableOpenApi;

import java.util.concurrent.locks.ReentrantLock;

@EnableOpenApi
@Api(value = "角色相关")
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping
    @ApiOperation(value = "添加角色")
    public Result addRole(@RequestBody Role role) {
        // 判断用户是不是管理员
        // 判断role_key和role_name是否重复
        // 添加角色
        boolean b = roleService.addRole(role);
        return b ? Result.ok() : Result.fail();
    }

    @GetMapping
    @ApiOperation(value = "根据角色id查询")
    public Result<Role> selectRoleById(@RequestParam(value = "roleId") Long roleId) {
        // 判断用户是不是管理员
        // 查询角色
        Role role = roleService.selectById(roleId);
        return Result.ok(role);
    }

    // 分页查询角色
    @ApiOperation(value = "角色分页查询")
    @GetMapping("/page")
    public Paging<Role> page(@RequestParam(value = "page") Integer page, @RequestParam(value = "pageSize") Integer pageSize, String roleName) {
        // 判断用户是不是管理员
        Page<Role> rolePage = PageHelper.startPage(page, pageSize).doSelectPage(() -> {
            roleService.selectAll(roleName);
        });
        Paging<Role> rolePaging = new Paging<>(rolePage);
        return rolePaging;
    }

    // 删除角色
    @DeleteMapping
    @ApiOperation(value = "根据角色id删除")
    public Result deleteById(@RequestParam(value = "roleId") Long roleId) {
        // 判断是不是管理员
        // 若是，则执行删除
        boolean b = roleService.deleteById(roleId);
        return b ? Result.ok() : Result.fail();
    }

    // 更新角色
    @PostMapping("/updateById")
    @ApiOperation(value = "根据角色id更新")
    public Result updateById(@RequestBody Role role) {
        // 判断是不是管理员, 若是管理员则允许进行更新操作
        boolean b = roleService.updateRole(role);
        return b ? Result.ok() : Result.fail();
    }
}
