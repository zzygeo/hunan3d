package com.zzy.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.dto.role.BaseDTO;
import com.zzy.dto.role.RolePageParam;
import com.zzy.entity.Role;
import com.zzy.result.Result;
import com.zzy.service.IRoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/role")
@Api(value = "角色管理")
public class RoleController {
    @Autowired
    IRoleService roleService;
    @GetMapping("/list")
    @ApiOperation(value = "分页查询角色")
    public Result<Page<BaseDTO>> page(
            @Valid @ModelAttribute RolePageParam RolePageParam
            ) {
        Page<Role> list = roleService.getList(RolePageParam.getPageNum(), RolePageParam.getPageSize(),
                RolePageParam.getRoleName(), RolePageParam.getStatus());
        List<Role> records = list.getRecords();
        List<BaseDTO> dtoRecords = records.stream().map((item) -> {
            BaseDTO roleDTO = new BaseDTO();
            roleDTO.setRoleName(item.getRoleName()).setRoleKey(item.getRoleKey())
                    .setRemark(item.getRemark()).setStatus(item.getStatus()).setRoleSort(item.getRoleSort());
            return roleDTO;
        }).collect(Collectors.toList());
        Page<BaseDTO> roleDTOPage = new Page<>();
        BeanUtils.copyProperties(list,roleDTOPage);
        roleDTOPage.setRecords(dtoRecords);
        return Result.success(roleDTOPage);
    }

    @PostMapping("/add")
    @ApiOperation(value = "添加角色")
    public Result add( @Valid @RequestBody BaseDTO baseDTO) {

        boolean add = roleService.add(baseDTO);
        return add ? Result.success() : Result.error();
    }
}
