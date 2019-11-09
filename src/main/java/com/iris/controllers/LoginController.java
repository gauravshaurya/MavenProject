package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.daos.UserDao;
import com.iris.daosimpl.UserDaoImpl;
import com.iris.models.User;

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String s1=request.getParameter("userId");
			String s2=request.getParameter("password");
			
			int id=Integer.parseInt(s1);
			
			UserDao daoObj=new UserDaoImpl();
			
			User uObj=daoObj.loginUser(id,s2);
			
			if(uObj!=null){
				
				HttpSession session=request.getSession();
				session.setAttribute("uObj",uObj);
				
				if(uObj.getRole().equals("Admin")){
					RequestDispatcher rd=request.getRequestDispatcher("AdminWelcome.jsp");
					rd.forward(request, response);
				}
				else {
					RequestDispatcher rd=request.getRequestDispatcher("UserWelcome.jsp");
					rd.forward(request, response);
				}
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");
				rd.forward(request, response);
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
}

}