package com.zzy.service.impl;

import com.zzy.dto.user.UserAddDTO;
import com.zzy.entity.User;
import com.zzy.mapper.UserMapper;
import com.zzy.service.IUserService;
import com.github.jeffreyning.mybatisplus.service.MppServiceImpl;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import java.util.UUID;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
@Service
public class UserServiceImpl extends MppServiceImpl<UserMapper, User> implements IUserService {
    @Override
    public boolean add(UserAddDTO userAddDTO) {
        User user = new User();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
        modelMapper.map(userAddDTO, user);
        return this.save(user);
    }

    @Override
    public User selectById(Long userId) {
        return this.getById(userId);
    }
}
