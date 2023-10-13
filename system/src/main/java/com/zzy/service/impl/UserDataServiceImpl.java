package com.zzy.service.impl;

import com.zzy.entity.UserData;
import com.zzy.mapper.UserDataMapper;
import com.zzy.service.IUserDataService;
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
public class UserDataServiceImpl extends MppServiceImpl<UserDataMapper, UserData> implements IUserDataService {

}
