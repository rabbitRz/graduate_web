package com.bruip.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bruip.hr.dao.LoginDao;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.bruip.hr.web.common.utils.DBUtils;
import com.bruip.hr.bean.login_person;
public class LoginDaoImpl implements LoginDao {

	public login_person login(String username, String password) throws DataAccessException {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select * from login where username=? and password=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		//boolean flag=false;
		login_person lo=new login_person();
		try {
			st=conn.prepareStatement(sql);
			st.setString(1,username);
			st.setString(2, password);
			rs=st.executeQuery();
			if(rs.next())
				//flag=true;
				lo.setId(rs.getInt("id"));
				lo.setPassword(password);
				lo.setUser_id(rs.getInt("user_id"));
				lo.setUsername(username);
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				DBUtils.close(rs, st, conn);
			}
		return lo;
	}

}
