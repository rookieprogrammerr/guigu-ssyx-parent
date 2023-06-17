package com.atguigu.ssyx.acl.service;

import com.atguigu.ssyx.model.acl.Role;
import com.atguigu.ssyx.vo.acl.RoleQueryVo;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;

public interface RoleService extends IService<Role> {
    /**
     * 角色列表（条件分页查询）
     * @param pageParam
     * @param roleQueryVo
     * @return
     */
    IPage<Role> selectRolePage(Page<Role> pageParam, RoleQueryVo roleQueryVo);
}
