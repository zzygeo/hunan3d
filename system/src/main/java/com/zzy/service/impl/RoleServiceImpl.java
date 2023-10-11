package com.zzy.service.impl;

import com.zzy.entity.Role;
import com.zzy.mapper.RoleMapper;
import com.zzy.service.IRoleService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzy
 * @since 2023-10-11
 */
@Service
public class RoleServiceImpl extends MppServiceImpl<RoleMapper, Role> implements IRoleService {

}
