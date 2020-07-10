package com.bruip.hr.dao;

import java.util.List;

import com.bruip.hr.bean.company;
import com.bruip.hr.bean.enterprise_kind;
import com.bruip.hr.web.common.exception.DataAccessException;

public interface CompanyDao {
	//查看所有公司的信息；
	public List<company> GetAllCompany() throws DataAccessException;
	//查看所有行业类型的信息
	public List<enterprise_kind> getAllEnterprise_kinds() throws DataAccessException;
	//根据公司地点、行业类型、公司规模查找符合公司的信息
	public List<company> findCompanies(String place,String enterprise,String min,String max) throws DataAccessException;
	//根据公司id查看公司信息
	public company getInfoById(String company_id) throws DataAccessException;
}    

