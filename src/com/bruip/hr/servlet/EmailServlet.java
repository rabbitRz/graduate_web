package com.bruip.hr.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bruip.hr.web.common.utils.EmailUtil;

/**
 * Servlet implementation class EmailServlet
 */

public class EmailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String email;  // 获取的收件人邮箱
	private String vCode;  // 后台产生的验证码
	private String vCodeReceive;  // 接收到前端输入的验证码
	private String method;  // 要接收的方法
	private PrintWriter out;  // 输出流
	private EmailUtil emailUtil = EmailUtil.instance;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmailServlet() {
    	System.out.println("初始化");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		//语言编码
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		out = resp.getWriter();
		// 获取来自前端的参数
		email = req.getParameter("email");
		vCodeReceive = req.getParameter("vcode");
		method = req.getParameter("method");

		switch (method) {
		case "getVCode":
			mGetVCode();
			break;
		case "verify":
			mVerify();
			break;
		default:
			break;
		}

		out.flush();
		out.close();
	}
	/*
	 * 产生验证码，并发送邮件
	 */
	private void mGetVCode() {
		// TODO Auto-generated method stub
		if(!isEmail(email)) {  // 邮箱不正确
			out.print(-1);
			return;
		}
		try {
			emailUtil.sendEmail(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vCode = emailUtil.getVCode();
		System.out.println("验证码为：" + vCode);
		out.print(1);
	}
	/*
	 * 邮箱正确性检测
	 * @param 邮箱字符串
	 * @return true/false
	 */
	private boolean isEmail(String email) {
		if(email.length() == 0 || email == null) {
			return false;
		}
		// 正则表达式验证邮箱
		Pattern pattern = Pattern.compile("^[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)+$");
		return pattern.matcher(email).matches();
	}
	
	/*
	 * 验证码验证
	 */
	private void mVerify() {
		// TODO Auto-generated method stub
		//System.out.println(vCode+" "+vCodeReceive+"\n");
		if(vCode.equals(vCodeReceive)) {
			out.print(1);
		}
		else {
			out.print(-1);
		}
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
}
