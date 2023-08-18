package com.zzy.service;

import com.zzy.domain.User;

public interface UserService {
    /**
     * 添加用户
     * @param user
     * @return
     */
    boolean addUser(User user);
}
