package com.zzy.service.impl;

import com.zzy.entity.User;
import com.zzy.mapper.UserMapper;
import com.zzy.service.IUserService;
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
public class UserServiceImpl extends MppServiceImpl<UserMapper, User> implements IUserService {

}
