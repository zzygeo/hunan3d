package com.zzy.service.impl;

import com.zzy.domain.User;
import com.zzy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public boolean addUser(User user) {
        return false;
    }
}
