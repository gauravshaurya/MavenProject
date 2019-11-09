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

@WebServlet("/delete")
public class DeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("uId"));
		
		UserDao userDao = new UserDaoImpl();
		try {
			userDao.deleteUser(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		out.println("<div align='center' style='color:red'>Successfully deleted.</div>");
		RequestDispatcher rd=request.getRequestDispatcher("viewAllUsers");
		rd.include(request, response);
	}

}
