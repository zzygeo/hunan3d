package com.zzy.mapper;

import com.zzy.domain.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    /**
     * 添加角色
     *
     * @param role
     * @return
     */
    boolean add(Role role);

    /**
     * 根据角色id查询角色
     * @param roleId
     * @return
     */
    Role selectById(Long roleId);

    /**
     * 分页查询role，pageHelper
     * @param roleName 角色名称
     * @return
     */
    List<Role> selectAll(String roleName);

    /**
     * 通过id删除角色
     * @param roleId
     * @return
     */
    boolean deleteById(Long roleId);

    /**
     * 更新角色
     * @param role
     * @return
     */
    boolean updateRole(Role role);

    /**
     * 判断roleKey是否唯一
     * @param roleKey
     * @return
     */
    List<Role> selectByRoleKey(String roleKey);
}
