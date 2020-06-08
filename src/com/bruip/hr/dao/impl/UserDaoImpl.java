package com.bruip.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bruip.hr.bean.user;
import com.bruip.hr.dao.UserDao;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.bruip.hr.web.common.utils.DBUtils;

public class UserDaoImpl implements UserDao {
	//根据用户名和密码查找用户,登录
	public user login(String username, String password) throws DataAccessException {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select * from user where username=? and password=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		user u=new user();
		try {
			st=conn.prepareStatement(sql);
			st.setString(1, username);
			st.setString(2, password);
			rs=st.executeQuery();
			if(rs.next()) {
				u.setBirth(rs.getString("birth"));
				u.setCode(rs.getInt("code"));
				u.setCredit_code(rs.getString("credit_code"));
				u.setEmail(rs.getString("email"));
				u.setId(rs.getInt("id"));
				u.setId_card(rs.getString("id_card"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setPhone(rs.getString("phone"));
				u.setPosition(rs.getString("position"));
				u.setSex(rs.getString("sex"));
				u.setUsername(rs.getString("username"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return u;
	}
	//查找用户的id查看角色id
	public int SelRoleId(int user_id) throws DataAccessException {
		// TODO Auto-generated method stub
		int role_id=0;
		Connection conn=DBUtils.getConnection();
		String sql="select * from user_role where user_id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			st=conn.prepareStatement(sql);
			st.setInt(1, user_id);
			rs=st.executeQuery();
			if(rs.next()) {
				role_id=rs.getInt("role_id");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return role_id;
	}
	//查看最大id
	public int SelMaxId() throws DataAccessException {
		// TODO Auto-generated method stub
		int max=0;
		Connection conn=DBUtils.getConnection();
		String sql="select max(id) from user";
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			if(rs.next()) {
				max=rs.getInt("max(id)");
			}
			//System.out.print("最大id:"+max+"\n");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return max;
	}
	//注册用户(user实例，role角色)，若rol为stu则代表student,com代表company
	public boolean register(user u, String rol) throws DataAccessException {
		// TODO Auto-generated method stub
		boolean flag=false;
		Connection conn=DBUtils.getConnection();
		String sql="insert into user(username,password,name,sex,birth,id_card,phone,email,"
				+ "credit_code,position,code,id) values(?,?,?,?,?,?,?,?,?,?,?,?)";
		String sql1="select max(id) from user";
		PreparedStatement st=null;
		
		int res=0;
		try {
			st=conn.prepareStatement(sql);
			st.setString(1, u.getUsername());
			st.setString(2,u.getPassword());
			st.setString(3,u.getName());
			st.setString(4,u.getSex());
			st.setString(5, u.getBirth());
			st.setString(6, u.getId_card());
			st.setString(7, u.getPhone());
			st.setString(8, u.getEmail());
			st.setString(9, u.getCredit_code());
			st.setString(10, u.getPosition());
			st.setInt(11, u.getCode());
			st.setInt(12, SelMaxId()+1);
			res=st.executeUpdate();//受影响行数
			if(res==1)
				flag=true;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(null, st, conn);
		}
		return flag;
	}
	//获取所有用户信息
	public List<user> GetAllUser() throws DataAccessException {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select * from user";
		PreparedStatement  st=null;
		ResultSet rs=null;
		List<user> list=new ArrayList<user>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				user u=new user();
				u.setBirth(rs.getString("birth"));
				u.setCode(rs.getInt("code"));
				u.setCredit_code(rs.getString("credit_code"));
				u.setEmail(rs.getString("email"));
				u.setId(rs.getInt("id"));
				u.setId_card(rs.getString("id_card"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("password"));
				u.setPhone(rs.getString("phone"));
				u.setPosition(rs.getString("position"));
				u.setSex(rs.getString("sex"));
				u.setUsername(rs.getString("username"));
				//System.out.println(u);
				list.add(u);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
//根据用户名查看信息是否正确,0表示完全相同，1表示email不同，2表示name不同，3表示idcard
@Override
public int CheckUserByUsername(String username, String email, String name, String idcard)
		throws DataAccessException {
	// TODO Auto-generated method stub
	Connection connection=DBUtils.getConnection();
	String sql="select email,name,id_card from user where username="+username;
	PreparedStatement st=null;
	ResultSet rs=null;
	int flag=0;
	try {
		st=connection.prepareStatement(sql);
		rs=st.executeQuery();
		if(rs.next()) {
			if(!email.equals(rs.getString("email"))) {
				flag=1;
			}else if(!name.equals(rs.getString("name"))) {
				flag=2;
			}else if(!idcard.equals(rs.getString("id_card"))) {
				flag=3;
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DBUtils.close(rs, st, connection);
	}
	return flag;
}
//重置密码
@Override
public boolean ModifyPassword(String username,String password,String email) throws DataAccessException {
	// TODO Auto-generated method stub
	Connection conn=DBUtils.getConnection();
	String sql="update user set password='"+password+"',email='"+email+"' where username="+username;
	PreparedStatement st=null;
	int rs=0;
	boolean flag=false;
	try {
		st=conn.prepareStatement(sql);
		rs=st.executeUpdate();
		if(rs==1)
			flag=true;
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		DBUtils.close(null, st,conn);
	}
	return flag;
}
public static void main(String[] args) {
	UserDaoImpl daoImpl=new UserDaoImpl();
	try {
		//daoImpl.GetAllUser();
		System.out.println("查询结果："+daoImpl.CheckUserByUsername("2", "2780085719@qq.com", "2", "2")+"\n");
		System.out.println("重置密码结果："+daoImpl.ModifyPassword("2", "22","2780085719@qq.com"));
	} catch (DataAccessException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
