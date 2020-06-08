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
	//根据用户名查看信息是否正确,0表示完全相同，1表示email不同，2表示name不同，3表示idcard不同
	int CheckUserByUsername(String username,String email,String name,String idcard) throws DataAccessException;
	//重置密码
	boolean ModifyPassword(String username,String password,String email) throws DataAccessException;
}
