package com.bruip.hr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bruip.hr.bean.enterprise_kind;
import com.bruip.hr.dao.impl.CompanyDaoImpl;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class EnterpriseKindServlet
 * 查看所有行业类型
 */
@WebServlet("/EnterpriseKindServlet")
public class EnterpriseKindServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterpriseKindServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		List<enterprise_kind> list=new ArrayList<enterprise_kind>();
		CompanyDaoImpl daoImpl=new CompanyDaoImpl();
		try {
			list=daoImpl.getAllEnterprise_kinds();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pWriter=response.getWriter();
		pWriter.println(data);
		pWriter.flush();
		pWriter.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
