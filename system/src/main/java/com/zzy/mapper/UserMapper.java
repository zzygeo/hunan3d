package com.zzy.mapper;

import com.zzy.entity.User;
import com.github.jeffreyning.mybatisplus.base.MppBaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
@Mapper
public interface UserMapper extends MppBaseMapper<User> {

}
