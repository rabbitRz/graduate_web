package com.bruip.hr.dao;

import com.bruip.hr.bean.login_person;
import com.bruip.hr.web.common.exception.DataAccessException;

public interface LoginDao {
	login_person login(String username,String password) throws DataAccessException;

}
