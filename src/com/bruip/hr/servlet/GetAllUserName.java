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

import com.bruip.hr.bean.user;
import com.bruip.hr.dao.UserDao;
import com.bruip.hr.dao.impl.UserDaoImpl;
import com.bruip.hr.web.common.exception.DataAccessException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Servlet implementation class GetAllUserName
 */
//获取所有用户名
@WebServlet("/AllUserName")
public class GetAllUserName extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllUserName() {
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
		List<user> list=new ArrayList<user>();
		UserDaoImpl dao=new UserDaoImpl();
		try {
			//获取所有用户信息
			list=dao.GetAllUser();
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ObjectMapper mapper=new ObjectMapper();
		String data=mapper.writeValueAsString(list);
		//System.out.println(data);
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
