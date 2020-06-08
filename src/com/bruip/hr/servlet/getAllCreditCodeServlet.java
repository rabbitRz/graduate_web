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

import com.bruip.hr.bean.company;
import com.bruip.hr.dao.impl.CompanyDaoImpl;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class getAllCompanyCreditCodeServlet
 */
@WebServlet("/AllCreditCode")
//获取所有公司的信用代码
public class getAllCreditCodeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getAllCreditCodeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("utf-8");
		List<company> list=new ArrayList<company>();
		CompanyDaoImpl dao=new CompanyDaoImpl();
		try {
			list=dao.GetAllCompany();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*JSON格式
		 * {
		 * {"key":"value","key":"value"},
		 * {"key":"value","key":"value"},
		 * }
		 */
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
		//System.out.println(data);
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pw=response.getWriter();
		pw.println(data);
		pw.flush();
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
