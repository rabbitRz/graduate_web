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
 * Servlet implementation class FindCompanyServlet
 */
@WebServlet("/Fc")
public class FindCompanyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCompanyServlet() {
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
		String place=request.getParameter("place");
		String enter=request.getParameter("enterprise");
		String totalString=request.getParameter("total_people");
		System.out.println(place+" "+enter+" "+totalString);
		
		//分情况
		if(place.equals("全部"))
			place="";
		if(enter.equals("不限"))
			enter="";
		String min="",max="";
		switch (totalString) {
		case "1":
			min="0";
			max="20";
			break;
		case "2":
			min="21";max="99";break;
		case "3":
			min="100";max="499";break;
		case "4":
			min="500";max="999";break;
		case "5":
			min="1000";max="9999";break;
		case "6":
			min="10000";max="99";break;
		default:
			break;
		}
		CompanyDaoImpl daoImpl=new CompanyDaoImpl();
		List<company> list=new ArrayList<company>();
		try {
			list=daoImpl.findCompanies(place, enter, min, max);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
		response.setContentType("application/json;charset=UTF-8");
		PrintWriter pWriter=response.getWriter();
		pWriter.println(data);;
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
