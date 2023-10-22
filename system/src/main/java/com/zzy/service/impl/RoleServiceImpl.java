package com.zzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.dto.role.RoleAddDTO;
import com.zzy.dto.role.RoleSetDTO;
import com.zzy.dto.role.RoleSetStatusDTO;
import com.zzy.entity.Role;
import com.zzy.mapper.RoleMapper;
import com.zzy.service.IRoleService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
@Service
public class RoleServiceImpl extends MppServiceImpl<RoleMapper, Role> implements IRoleService {
    @Override
    public Page<Role> getList(int pageNum, int pageSize, String roleName, String status) {
        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(roleName != null, Role::getRoleName, roleName);
        wrapper.eq(status != null, Role::getStatus, status);
        Page<Role> rolePage = new Page<>(pageNum, pageSize);
        Page<Role> page = this.page(rolePage, wrapper);
        return page;
    }

    @Override
    public boolean add(RoleAddDTO roleAddDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(roleAddDTO, Role.class);
        return  this.save(role);
    }

    @Override
    @Transactional
    public boolean deleteByIds(Long[] roleIds) {
        // 判断删除的角色里面是否有超级管理员，如果有则不能删除
        // 根据登录用户获取所管辖的组织的角色，并且判断要删除的角色是不是在这个管辖范围之内
        // 判断角色底下是否分配了用户
        ArrayList<Long> longs = new ArrayList<>();
        Collections.addAll(longs, roleIds);
        return this.removeBatchByIds(longs);
    }

    @Override
    public boolean setRole(RoleSetDTO roleSetDTO) {
        Role role = new Role();
        new ModelMapper().map(roleSetDTO, role);
        boolean b = this.updateById(role);
        return b;
    }

    @Override
    public Role getRoleById(Long roleId) {
        Role role = this.getById(roleId);
        return role;
    }

    @Override
    public boolean setStatusByIds(RoleSetStatusDTO roleSetStatusDTO) {
        Role role = new Role();
        role.setRoleId(roleSetStatusDTO.getRoleId()).setStatus(roleSetStatusDTO.getStatus());
        return this.updateById(role);
    }

    @Override
    public boolean isRoleKeyUnique(String roleKey) {
        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(roleKey != null, Role::getRoleKey, roleKey);
        wrapper.last("LIMIT 1");
        Role one = this.getOne(wrapper);
        return one != null ? true : false;
    }

    @Override
    public boolean isRoleNameUnique(String roleName) {
        LambdaQueryWrapper<Role> wrapper = new LambdaQueryWrapper<>();
        wrapper.eq(roleName != null, Role::getRoleName, roleName);
        wrapper.last("LIMIT 1");
        Role one = this.getOne(wrapper);
        return one != null ? true : false;
    }
}
