package com.zzy.service.impl;

import com.zzy.entity.UserOrganization;
import com.zzy.mapper.UserOrganizationMapper;
import com.zzy.service.IUserOrganizationService;
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
public class UserOrganizationServiceImpl extends MppServiceImpl<UserOrganizationMapper, UserOrganization> implements IUserOrganizationService {

}
