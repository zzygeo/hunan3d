package com.zzy.service.impl;

import com.zzy.domain.Role;
import com.zzy.mapper.RoleMapper;
import com.zzy.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;
    @Override
    public boolean addRole(Role role) {
        log.info(role.toString());
        boolean add = roleMapper.add(role);
        return add;
    }

    @Override
    public Role selectById(Long roleId) {
        if (roleId != null) {
            Role role = roleMapper.selectById(roleId);
            return role != null ? role : null;
        }
        return null;
    }

    @Override
    public List<Role> selectAll(String roleName) {
        List<Role> roles = roleMapper.selectAll(roleName);
        return roles;
    }

    @Override
    public boolean deleteById(Long roleId) {
        if (roleId != null) {
            boolean b = roleMapper.deleteById(roleId);
            return b;
        } else {
         return false;
        }
    }

    @Override
    public boolean updateRole(Role role) {
        if (role.getRoleId() != null) {
            boolean b = roleMapper.updateRole(role);
            return b;
        } else {
            return false;
        }
    }

    @Override
    public List<Role> selectByRoleKey(String roleKey) {
        if (roleKey != null && roleKey != "") {
            List<Role> roles = roleMapper.selectByRoleKey(roleKey);
            return roles;
        } else {
            return null;
        }
    }
}
