package com.zzy.service;

import com.zzy.dto.user.UserAddDTO;
import com.zzy.entity.User;
import com.github.jeffreyning.mybatisplus.service.IMppService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
public interface IUserService extends IMppService<User> {
    // 用户注册
    public boolean add(UserAddDTO userAddDTO);
    // 根据userId查看信息
    public User selectById(Long userId);
    // 分页查询用户
    // 批量删除用户
    // 修改用户信息
    // 停用用户
    // 电话是否唯一
    // 邮箱是否唯一
    // 修改密码
    // 用户分配角色
}
