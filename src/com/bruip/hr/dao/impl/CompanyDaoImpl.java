package com.bruip.hr.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bruip.hr.bean.company;
import com.bruip.hr.bean.enterprise_kind;
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
	//查看所有行业类型的信息
	@Override
	public List<enterprise_kind> getAllEnterprise_kinds() throws DataAccessException {
		// TODO Auto-generated method stub
		List<enterprise_kind> list=new ArrayList<enterprise_kind>();
		Connection conn=DBUtils.getConnection();
		String sql="select * from enterprise_kind ORDER BY id asc";
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while (rs.next()) {
				enterprise_kind en=new enterprise_kind();
				en.setEnterprise(rs.getString("enterprise"));
				en.setId(rs.getInt("id"));
				list.add(en);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}	
	@Override
	//根据公司地点、行业类型、公司规模查找符合公司的信息
	public List<company> findCompanies(String place,String enterprise,String min,String max) throws DataAccessException {
		// TODO Auto-generated method stub
		Connection conn=DBUtils.getConnection();
		String sql="select * from company";
		PreparedStatement st=null;
		ResultSet rs=null;
		boolean flag=false;
		List<company> list=new ArrayList<company>();
		if(place!=""&&place!=null) {
			if(!flag)
				sql+=" where ";
			sql+="address like '%"+place+"%'";
			flag=true;
		}
		if(enterprise!=""&&enterprise!=null) {
			if(!flag)
				sql+=" where ";
			else {
				sql+=" and ";
			}
			sql+="enterprise='"+enterprise+"'";
			flag=true;
		}
		if(min!=""&&min!=null) {
			if(!flag)
				sql+=" where ";
			else {
				sql+=" and ";
			}
			if(min=="10000")
				sql+="total_people >="+min;
			else
				sql+="total_people between "+min+" and "+max;
			flag=true;
		}
		System.out.println(sql);
		try {
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			while(rs.next()) {
				company com=new company();
				com.setAddress(rs.getString("address"));
				com.setBuild_time(rs.getString("build_time"));
				com.setBusiness(rs.getString("business"));
				com.setCredit_code(rs.getString("credit_code"));
				com.setEnterprises(rs.getString("enterprise"));
				com.setIcon(rs.getString("icon"));
				com.setId(rs.getInt("id"));
				com.setIntroduction(rs.getString("introduction"));
				com.setName(rs.getString("name"));
				com.setTotal_people(rs.getInt("total_people"));
				com.setTotal_value(rs.getDouble("total_value"));
				list.add(com);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBUtils.close(rs, st, conn);
		}
		return list;
	}
	//根据公司id查看公司信息
	@Override
	public company getInfoById(String company_id) throws DataAccessException {
		// TODO Auto-generated method stub
		Connection connection=DBUtils.getConnection();
		String sql="select * from company where id="+company_id;
		PreparedStatement st=null;
		ResultSet rs=null;
		company c=new company();
		
		return null;
	}
	
	public static void main(String args[]){
		CompanyDaoImpl dao=new CompanyDaoImpl();
		List<company> list=new ArrayList<company>();
		List<company> list1=new ArrayList<company>();
		List<company> list2=new ArrayList<company>();
		List<company> list3=new ArrayList<company>();
		try {
			list=dao.findCompanies("澳门", "旅游", "0", "20");
			list1=dao.findCompanies("", "旅游", "0", "20");
			list2=dao.findCompanies("", "", "0", "20");
			list3=dao.findCompanies("", "", "", "20");
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		System.out.println("--------");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println("--------");
		for(int i=0;i<list2.size();i++) {
			System.out.println(list2.get(i));
		}
		System.out.println("--------");
		for(int i=0;i<list3.size();i++) {
			System.out.println(list3.get(i));
		}
	}
}
