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
 * Servlet implementation class Tr
 */
@WebServlet("/Tr")
public class GetCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetCompanyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		CompanyDaoImpl daoImpl=new CompanyDaoImpl();
		List<company> list=new ArrayList<company>();
		try {
			list=daoImpl.GetAllCompany();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
		response.setContentType("application/json;charest=UTF-8");
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
