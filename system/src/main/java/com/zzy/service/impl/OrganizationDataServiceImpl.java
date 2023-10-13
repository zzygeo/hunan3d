package com.zzy.service.impl;

import com.zzy.entity.OrganizationData;
import com.zzy.mapper.OrganizationDataMapper;
import com.zzy.service.IOrganizationDataService;
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
public class OrganizationDataServiceImpl extends MppServiceImpl<OrganizationDataMapper, OrganizationData> implements IOrganizationDataService {

}
