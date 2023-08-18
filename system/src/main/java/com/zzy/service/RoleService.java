package com.zzy.service;

import com.zzy.domain.Role;

import java.util.List;

public interface RoleService {
    boolean addRole(Role role);
    Role selectById(Long roleId);
    List<Role> selectAll(String roleName);
    boolean deleteById(Long roleId);
    boolean updateRole(Role role);
    List<Role> selectByRoleKey(String roleKey);
}
