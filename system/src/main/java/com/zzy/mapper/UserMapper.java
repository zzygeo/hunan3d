package com.zzy.mapper;

import com.zzy.domain.User;

public interface UserMapper {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean addUser(User user);
}
