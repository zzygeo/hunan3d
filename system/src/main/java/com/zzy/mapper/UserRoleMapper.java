package com.zzy.mapper;

import com.zzy.domain.UserRole;

public interface UserRoleMapper {
    /**
     * 添加用户角色关系
     *
     * @param userRole
     * @return
     */
    boolean addUserRole(UserRole userRole);
}
