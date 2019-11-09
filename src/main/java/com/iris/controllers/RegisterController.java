package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.UserDao;
import com.iris.daosimpl.UserDaoImpl;
import com.iris.models.User;


@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String s1=request.getParameter("email");
			String s2=request.getParameter("firstname");
			String s3=request.getParameter("lastname");
			String s4=request.getParameter("gender");
			String s5=request.getParameter("city");
			String s6=request.getParameter("role");
			String s7=request.getParameter("password");
			
			User uObj=new User();
			
			uObj.setEmail(s1);
			uObj.setFirstName(s2);
			uObj.setLastName(s3);
			uObj.setGender(s4);
			uObj.setCity(s5);
			uObj.setRole(s6);
			uObj.setPassword(s7);
			
			UserDao daoObj=new UserDaoImpl();
			
			boolean b=daoObj.registerUser(uObj);
			if(b) {
					
					RequestDispatcher rd=request.getRequestDispatcher("Success.jsp");
					rd.forward(request,response);
			}
			
			
			
			
	}

}
