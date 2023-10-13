package com.zzy.service.impl;

import com.zzy.entity.Menu;
import com.zzy.mapper.MenuMapper;
import com.zzy.service.IMenuService;
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
public class MenuServiceImpl extends MppServiceImpl<MenuMapper, Menu> implements IMenuService {

}
