package com.bruip.hr.dao;

import java.util.List;

import com.bruip.hr.bean.company;
import com.bruip.hr.web.common.exception.DataAccessException;

public interface CompanyDao {
	//查看所有公司的信息；
	public List<company> GetAllCompany() throws DataAccessException;

}

