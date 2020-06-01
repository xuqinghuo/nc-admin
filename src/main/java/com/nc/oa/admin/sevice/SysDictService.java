package com.nc.oa.admin.sevice;

import java.util.List;

import com.nc.oa.admin.model.SysDict;
import com.louis.kitty.core.service.CurdService;

/**
 * 字典管理
 * @author robin
 * @date May 29, 2020
 */
public interface SysDictService extends CurdService<SysDict> {

	/**
	 * 根据名称查询
	 * @param lable
	 * @return
	 */
	List<SysDict> findByLable(String lable);
}
