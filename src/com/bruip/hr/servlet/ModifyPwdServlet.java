package com.bruip.hr.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bruip.hr.dao.impl.UserDaoImpl;
import com.bruip.hr.web.common.exception.DataAccessException;

/**
 * Servlet implementation class authenticationServlet
 * 重置账户密码
 */
@WebServlet("/modifyPwd")
public class ModifyPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifyPwdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		String username=request.getParameter("username");
		String email=request.getParameter("email");
		String name=request.getParameter("name");
		String idcard=request.getParameter("idcard");
		String password=request.getParameter("password");
		UserDaoImpl daoImpl=new UserDaoImpl();
		//UserDaoImpl daoImpl2=new UserDaoImpl();
		int flag=0;
		boolean flag1=false;
		try {
			flag=daoImpl.CheckUserByUsername(username, email, name, idcard);
		} catch (DataAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter pWriter=response.getWriter();
		if(flag==0||flag==1) {
			try {
				flag1=daoImpl.ModifyPassword(username, password, email);
				//System.out.println(username+" "+password+" "+email+"\n");
			} catch (DataAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				pWriter.println("重置密码失败！");
			}
			System.out.println("修改结果："+flag1+"\n");
			if(flag==0) {
				if(flag1) {
					pWriter.println("重置密码成功！");
				}else {
					pWriter.println("重置密码失败！");
				}
			}else if(flag==1) {
				if(flag1) {
					pWriter.println("电子邮件进行更换，重置密码成功！");
				}else {
					pWriter.println("重置密码失败！");
				}
			}
		}else if(flag==2) {
			pWriter.println("账号与姓名不匹配,重置失败！");
		}else if(flag==3) {
			pWriter.println("账号与身份证号不匹配，重置失败！");
		}
		pWriter.flush();
		pWriter.close();
	}

}
