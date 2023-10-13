package com.zzy.service.impl;

import com.zzy.entity.RoleMenu;
import com.zzy.mapper.RoleMenuMapper;
import com.zzy.service.IRoleMenuService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
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
public class RoleMenuServiceImpl extends MppServiceImpl<RoleMenuMapper, RoleMenu> implements IRoleMenuService {

}
