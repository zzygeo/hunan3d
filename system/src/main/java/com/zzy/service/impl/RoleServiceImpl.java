package com.zzy.service.impl;

import com.zzy.domain.Role;
import com.zzy.mapper.RoleMapper;
import com.zzy.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        Role role = roleMapper.selectById(roleId);
        return role;
    }
}
