package com.zzy.service.impl;

import com.zzy.domain.User;
import com.zzy.mapper.UserMapper;
import com.zzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public boolean addUser(User user) {
        boolean b = userMapper.addUser(user);
        return b;
    }
}
