package com.nc.oa.admin.sevice;

import java.util.List;
import java.util.Set;

import com.nc.oa.admin.model.SysUser;
import com.nc.oa.admin.model.SysUserRole;
import com.louis.kitty.core.service.CurdService;

/**
 * 用户管理
 * @author robin
 * @date May 29, 2020
 */
public interface SysUserService extends CurdService<SysUser> {

	SysUser findByName(String username);

	/**
	 * 查找用户的菜单权限标识集合
	 * @param userName
	 * @return
	 */
	Set<String> findPermissions(String userName);

	/**
	 * 查找用户的角色集合
	 * @param userName
	 * @return
	 */
	List<SysUserRole> findUserRoles(Long userId);

}
