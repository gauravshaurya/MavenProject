package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.iris.daos.UserDao;
import com.iris.daosimpl.UserDaoImpl;
import com.iris.models.User;


@WebServlet("/updateRequest")
public class UpdateRequestController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			int id=Integer.parseInt(request.getParameter("uId"));
			
			UserDao daoObj=new UserDaoImpl();
			User user=daoObj.getUser(id);
		//	out.print("he");
			
			request.setAttribute("obj",user);
			RequestDispatcher rd=request.getRequestDispatcher("Update.jsp");
			rd.forward(request,response);
	}

}
