package com.bruip.hr.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bruip.hr.bean.role;
import com.bruip.hr.bean.user;
import com.bruip.hr.dao.RoleDao;
import com.bruip.hr.dao.UserDao;
import com.bruip.hr.dao.impl.RoleDaoImpl;
import com.bruip.hr.dao.impl.UserDaoImpl;
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
        //响应内容类型编码设置
        response.setContentType("text/html;charset=UTF-8");
		String username=request.getParameter("username");
		String pwd=request.getParameter("password");
		String rem=request.getParameter("remember");
		//System.out.print(pwd);
		UserDao dao=new UserDaoImpl();
		RoleDao dao1=new RoleDaoImpl();
		boolean flag=false;
		user u=new user();
		int role_id = 0;
		if(!"".equals(username)&&!"".equals(pwd)) {
			try {
				u=dao.login(username, pwd);
				role_id=dao.SelRoleId(u.getId());
				//能够登录的情况，查找到数据且code为1
				if(u.getId()>0&&u.getCode()==1)
					flag=true;
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//记住密码
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
		//System.out.print(role_id);
		if(flag) {
			HttpSession session=request.getSession();			
			session.setAttribute("login_user", u);
			if(role_id==2)
				response.sendRedirect("index.jsp");//求职者首页
			else if(role_id==1)
				response.sendRedirect("");//公司首页
			else if(role_id==3)
				response.sendRedirect("");//管理员首页
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
