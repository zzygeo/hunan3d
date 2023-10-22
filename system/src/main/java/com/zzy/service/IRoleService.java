package com.zzy.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zzy.dto.role.RoleAddDTO;
import com.zzy.dto.role.RoleSetDTO;
import com.zzy.dto.role.RoleSetStatusDTO;
import com.zzy.entity.Role;
import com.github.jeffreyning.mybatisplus.service.IMppService;

import java.util.List;

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
     * @param roleAddDTO
     * @return
     */
    public boolean add(RoleAddDTO roleAddDTO);

    public boolean deleteByIds(Long[] roleIds);


    /**
     * 修改角色的信息
     * @param roleSetDTO
     * @return
     */
    public boolean setRole(RoleSetDTO roleSetDTO);

    /**
     *
     * @param roleId 角色ID
     * @return
     */
    public Role getRoleById(Long roleId);

    public boolean setStatusByIds(RoleSetStatusDTO roleSetStatusDTO);

    /**
     * 角色名称是否唯一
     * @param roleName
     * @return
     */
    public boolean isRoleNameUnique(String roleName);

    /**
     * 角色字符是否唯一
     * @param roleKey
     * @return
     */
    public boolean isRoleKeyUnique(String roleKey);
}
