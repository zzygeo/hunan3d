package com.zzy.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.dto.role.RoleAddDTO;
import com.zzy.dto.role.RolePageDTO;
import com.zzy.dto.role.RoleSetDTO;
import com.zzy.dto.role.RoleSetStatusDTO;
import com.zzy.entity.Role;
import com.zzy.result.Result;
import com.zzy.service.IRoleService;
import com.zzy.validate.anotation.ZeroOrOne;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;


@RestController
@RequestMapping("/role")
@Api(value = "角色管理")
@Validated
public class RoleController {
    @Autowired
    IRoleService roleService;
    @GetMapping("/list")
    @ApiOperation(value = "分页查询角色")
    public Result<Page<Role>> page(
            @Valid @ModelAttribute RolePageDTO RolePageDTO
            ) {
        Page<Role> list = roleService.getList(RolePageDTO.getPageNum(), RolePageDTO.getPageSize(),
                RolePageDTO.getRoleName(), RolePageDTO.getStatus());
        return Result.success(list);
    }

    @PostMapping()
    @ApiOperation(value = "添加角色")
    public Result add( @Valid @RequestBody RoleAddDTO roleAddDTO) {
        // 判断roleKey和roleName是否唯一
        if (roleService.isRoleKeyUnique(roleAddDTO.getRoleKey()) ) {
            return Result.error("roleKey已存在，无法新增角色");
        }
        if (roleService.isRoleNameUnique(roleAddDTO.getRoleName())) {
            return Result.error("roleName已存在，无法新增角色");
        }
        boolean add = roleService.add(roleAddDTO);
        return add ? Result.success() : Result.error();
    }

    @DeleteMapping("/{roleIds}")
    @ApiOperation(value = "批量删除角色")
    public Result delete(@PathVariable Long[] roleIds) {
        return roleService.deleteByIds(roleIds) ? Result.success() : Result.error();
    }

    @PutMapping()
    @ApiOperation(value = "更新角色")
    public Result update(@RequestBody @Valid RoleSetDTO roleSetDTO) {
        if (roleSetDTO.getRoleKey() != null && roleService.isRoleKeyUnique(roleSetDTO.getRoleKey())) {
            return Result.error("修改角色失败, " + "roleKey: " + roleSetDTO.getRoleKey() + " 已存在", null);
        }
        if (roleSetDTO.getRoleName() != null && roleService.isRoleNameUnique(roleSetDTO.getRoleName())) {
            return Result.error("修改角色失败, " + "roleName: " + roleSetDTO.getRoleName() + " 已存在", null);
        }
        boolean b = roleService.setRole(roleSetDTO);
        return b ? Result.success("更新成功", null) : Result.error("更新失败", null);
    }

    @GetMapping("/{roleId}")
    @ApiOperation(value = "根据roleId查询角色")
    public Result getRoleById(@PathVariable @Positive Long roleId, String name) {
        Role role = roleService.getRoleById(roleId);
        return role != null ? Result.success("查询成功", role) : Result.error("查询失败", null);
    }

    @PutMapping("/setStatus")
    @ApiOperation(value = "更新角色状态")
    public Result updateStatusById(@Valid @RequestBody RoleSetStatusDTO roleSetStatusDTO ){
        boolean b = roleService.setStatusByIds(roleSetStatusDTO);
        return b ? Result.success() : Result.error();
    }
}
