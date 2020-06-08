package com.bruip.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bruip.hr.bean.company;
import com.bruip.hr.dao.CompanyDao;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.bruip.hr.web.common.utils.DBUtils;

public class CompanyDaoImpl implements CompanyDao   {
	//查看所有公司信息
	public List<company> GetAllCompany() throws DataAccessException{
		Connection conn=DBUtils.getConnection();
		String sql="select * from company";
		PreparedStatement st=null;
		ResultSet rs=null;
		List<company> list=new ArrayList<company>();
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				company c=new company();
				c.setAddress(rs.getString("address"));
				c.setBuild_time(rs.getString("build_time"));
				c.setCredit_code(rs.getString("credit_code"));
				c.setIcon(rs.getString("icon"));
				c.setId(rs.getInt("id"));
				c.setIntroduction(rs.getString("introduction"));
				c.setName(rs.getString("name"));
				c.setBusiness(rs.getString("business"));
				c.setTotal_people(rs.getInt("total_people"));
				c.setTotal_value(rs.getDouble("total_value"));
				c.setEnterprises(rs.getString("enterprise"));
				//System.out.print(c);
				//System.out.print("\n");
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
public static void main(String args[]){
		CompanyDaoImpl dao=new CompanyDaoImpl();
		try {
			dao.GetAllCompany();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}	
}
