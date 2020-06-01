package com.nc.oa.admin.sevice;

import java.util.List;

import com.nc.oa.admin.model.SysDept;
import com.louis.kitty.core.service.CurdService;

/**
 * 机构管理
 * @author robin
 * @date May 29, 2020
 */
public interface SysDeptService extends CurdService<SysDept> {

	/**
	 * 查询机构树
	 * @param userId 
	 * @return
	 */
	List<SysDept> findTree();
}
