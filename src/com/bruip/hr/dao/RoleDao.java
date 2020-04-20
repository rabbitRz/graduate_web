package com.bruip.hr.dao;

import com.bruip.hr.bean.role;
import com.bruip.hr.web.common.exception.DataAccessException;

public interface RoleDao {
	//根据角色id查看角色信息
	role SelRole(int id) throws DataAccessException;
}
