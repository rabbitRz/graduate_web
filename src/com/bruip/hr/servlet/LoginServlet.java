package com.bruip.hr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bruip.hr.bean.login_person;
import com.bruip.hr.dao.LoginDao;
import com.bruip.hr.dao.impl.LoginDaoImpl;
import com.bruip.hr.web.common.exception.DataAccessException;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public LoginServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//设置字符编码
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        //响应内容类型编码设置
        response.setContentType("text/html;charset=UTF-8");
		String username=request.getParameter("username");
		String pwd=request.getParameter("password");
		String rem=request.getParameter("remember");
		System.out.print(rem);
		LoginDao dao=new LoginDaoImpl();
		boolean flag=false;
		login_person lo=new login_person();
		if(!"".equals(username)&&!"".equals(pwd)) {
			try {
				lo=dao.login(username, pwd);
				if(lo.getId()>0)
					flag=true;
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if("true".equals(rem)&&flag) {
			Cookie ck1=new Cookie("remember",rem);
			ck1.setMaxAge(60*6);
			response.addCookie(ck1);
			Cookie ck2=new Cookie("username",username);
			ck2.setMaxAge(60*60);
			response.addCookie(ck2);
			Cookie ck3=new Cookie("password",pwd);
			ck3.setMaxAge(60*60);
			response.addCookie(ck3);
		}else {
			//清除cookie
			Cookie[] cks=request.getCookies();
			if(cks!=null) {
				for(Cookie c:cks) {
					c.setMaxAge(0);
					response.addCookie(c);
				}
			}
		}
		if(flag) {
			HttpSession session=request.getSession();
			session.setAttribute("login_person", lo);
			response.sendRedirect("NewFile.html");
		}
		else {
			response.getWriter().write("登陆失败！");
			response.sendRedirect("login.html");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
