package com.zzy.controller;

import com.zzy.domain.Role;
import com.zzy.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping
    public String addRole(@RequestBody Role role) {
        boolean b = roleService.addRole(role);
        return b ? "添加成功" : "添加失败";
    }
    @GetMapping
    public Role selectRoleById(@RequestParam(value = "roleId") Long roleId) {
        Role role = roleService.selectById(roleId);
        return role;
    }
}
