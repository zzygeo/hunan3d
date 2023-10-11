package com.zzy.service.impl;

import com.zzy.entity.Data;
import com.zzy.mapper.DataMapper;
import com.zzy.service.IDataService;
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
public class DataServiceImpl extends MppServiceImpl<DataMapper, Data> implements IDataService {

}
