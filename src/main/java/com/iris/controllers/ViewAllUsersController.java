package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.iris.daos.UserDao;
import com.iris.daosimpl.UserDaoImpl;
import com.iris.models.User;

@WebServlet("/viewAllUsers")
public class ViewAllUsersController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			UserDao daoObj=new UserDaoImpl();
			
			List<User> userslist=daoObj.getAllUsers();
			System.out.println(userslist);
			request.setAttribute("uList", userslist);
			RequestDispatcher rd=request.getRequestDispatcher("ViewAllUsers.jsp");
			rd.forward(request, response);
			
			
			
	}

}
