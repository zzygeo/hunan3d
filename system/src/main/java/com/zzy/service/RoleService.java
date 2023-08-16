package com.zzy.service;

import com.zzy.domain.Role;

public interface RoleService {
    boolean addRole(Role role);
    Role selectById(Long roleId);
}
