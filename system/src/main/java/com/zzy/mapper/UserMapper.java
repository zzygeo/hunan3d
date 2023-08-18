package com.zzy.mapper;

import com.zzy.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    boolean addUser(User user);
}
