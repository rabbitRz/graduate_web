package com.bruip.hr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bruip.hr.bean.user;
import com.bruip.hr.dao.UserDao;
import com.bruip.hr.dao.impl.UserDaoImpl;
import com.bruip.hr.web.common.exception.DataAccessException;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("UTF-8");
		String ro=request.getParameter("role");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		String confirm_password=request.getParameter("confirm_password");
		String name=request.getParameter("name");
		String birth=request.getParameter("birth");
		String sex=request.getParameter("sex");
		String idcard=request.getParameter("idcard");
		String phone=request.getParameter("phone");
		String email=request.getParameter("email");
		//客户端响应
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		//确认密码成功
		if(password.equals(confirm_password)){
			user u=new user();
			u.setBirth(birth);
			u.setCode(0);
			u.setEmail(email);
			u.setId_card(idcard);
			u.setName(name);
			u.setPassword(confirm_password);
			u.setPhone(phone);
			u.setSex(sex);
			u.setUsername(username);
			//System.out.print(u+"\n"+ro+"\n");
			UserDao dao=new UserDaoImpl();
			boolean flag=false;
			if(ro.equals("com")) {
				//招聘者注册
				String credit_code=request.getParameter("credit_code");
				String position=request.getParameter("position");
				u.setCredit_code(credit_code);
				u.setPosition(position);
				try {
					flag=dao.register(u, ro);
				} catch (DataAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					pw.println("注册失败!");
				}
			}else if(ro.equals("stu")) {
				//求职者注册
				try {
					flag=dao.register(u, ro);
				} catch (DataAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();				
					pw.println("注册失败!");
					pw.flush();
					pw.close();
				}
			}
			System.out.print("插入结果："+flag+"\n");
			pw.println("请等待审核，审核通过方可登录！");
		}else {
			pw.println("注册失败!");
		}
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
