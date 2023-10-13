package com.zzy.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.dto.role.BaseDTO;
import com.zzy.entity.Role;
import com.zzy.mapper.RoleMapper;
import com.zzy.service.IRoleService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

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
    public boolean add(BaseDTO baseDTO) {
        ModelMapper modelMapper = new ModelMapper();
        Role role = modelMapper.map(baseDTO, Role.class);
        return  this.save(role);
    }
}
