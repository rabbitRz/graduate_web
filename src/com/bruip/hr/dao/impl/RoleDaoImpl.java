package com.bruip.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bruip.hr.bean.role;
import com.bruip.hr.dao.RoleDao;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.bruip.hr.web.common.utils.DBUtils;

public class RoleDaoImpl implements RoleDao {
	//根据角色id查看角色信息
	public role SelRole(int id) throws DataAccessException {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select * from role where id=?";
		PreparedStatement st=null;
		ResultSet rs=null;
		role r=new role();
		try {
			st=conn.prepareStatement(sql);
			st.setInt(1, id);
			rs=st.executeQuery();
			if(rs.next()) {
				r.setId(rs.getInt("id"));
				r.setRole_desc(rs.getString("role_desc"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return r;
	}

}
