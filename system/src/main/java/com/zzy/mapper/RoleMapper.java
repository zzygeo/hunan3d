package com.zzy.mapper;

import com.zzy.domain.Role;
import org.apache.ibatis.annotations.Mapper;

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
}
