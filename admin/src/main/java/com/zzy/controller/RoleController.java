package com.zzy.controller;

import com.zzy.domain.Role;
import com.zzy.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.oas.annotations.EnableOpenApi;

@EnableOpenApi
@Api(value = "角色相关")
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping
    @ApiOperation(value = "添加角色")
    public String addRole(@RequestBody Role role) {
        boolean b = roleService.addRole(role);
        return b ? "添加成功" : "添加失败";
    }
    @GetMapping
    @ApiOperation(value = "根据角色id查询")
    public Role selectRoleById(@RequestParam(value = "roleId") Long roleId) {
        Role role = roleService.selectById(roleId);
        return role;
    }
    // 分页查询角色
    // 删除角色
    // 更新角色
    
}
