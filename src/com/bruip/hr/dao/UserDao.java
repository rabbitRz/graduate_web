package com.bruip.hr.dao;

import java.util.List;

import com.bruip.hr.bean.user;
import com.bruip.hr.web.common.exception.DataAccessException;

public interface UserDao {
	//根据用户名和密码查找用户，登录
	user login(String username,String password) throws DataAccessException;
	//查找用户的id查看角色id
	int SelRoleId(int user_id) throws DataAccessException;
	//注册用户(user实例，role角色)，若rol为stu则代表student,com代表company
	boolean register(user u,String rol) throws DataAccessException;
	//获取所有用户信息
	List<user> GetAllUser() throws DataAccessException;
}
