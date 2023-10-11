package com.zzy.service.impl;

import com.zzy.entity.Organization;
import com.zzy.mapper.OrganizationMapper;
import com.zzy.service.IOrganizationService;
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
public class OrganizationServiceImpl extends MppServiceImpl<OrganizationMapper, Organization> implements IOrganizationService {

}
