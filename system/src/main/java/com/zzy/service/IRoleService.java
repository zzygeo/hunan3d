package com.zzy.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.dto.role.BaseDTO;
import com.zzy.entity.Role;
import com.github.jeffreyning.mybatisplus.service.IMppService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zzy
 * @since 2023-10-12
 */
public interface IRoleService extends IMppService<Role> {
    /**
     * 分页查询角色
     * @param pageNum
     * @param pageSize
     * @param roleName
     * @param status
     * @return
     */
    public Page<Role> getList(int pageNum, int pageSize, String roleName, String status);

    /**
     * 添加角色
     * @param baseDTO
     * @return
     */
    public boolean add(BaseDTO baseDTO);

    /**
     * 通过角色标识符删除角色
     * @param roleKey
     * @return
     */
//    public boolean delete(String roleKey);
//
//    /**
//     * 设置角色的状态
//     * @param status
//     * @return
//     */
//    public boolean setStatus(String status);
//
//    /**
//     * 修改角色的信息
//     * @param role
//     * @return
//     */
//    public boolean setRole(Role role);
//
//    /**
//     * 角色名称是否唯一
//     * @param roleName
//     * @return
//     */
//    public boolean isRoleNameUnique(String roleName);
//
//    /**
//     * 角色字符是否唯一
//     * @param roleKey
//     * @return
//     */
//    public boolean isRoleKeyUnique(String roleKey);
}
