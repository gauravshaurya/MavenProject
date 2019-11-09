package com.iris.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.iris.daos.UserDao;
import com.iris.daosimpl.UserDaoImpl;
import com.iris.models.Address;
import com.iris.models.User;


@WebServlet("/address")
public class AddressController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html");
			PrintWriter out=response.getWriter();
			
			String s1=request.getParameter("hno");
			String s2=request.getParameter("addressline1");
			String s3=request.getParameter("addressline2");
			String s4=request.getParameter("city");
			String s5=request.getParameter("state");
			String s6=request.getParameter("pincode");
			
			int hno=Integer.parseInt(s1);
			int pincode=Integer.parseInt(s6);
			
			Address aObj=new Address();
			
			aObj.setHouseNo(hno);
			aObj.setAddress1(s2);
			aObj.setAddress2(s3);
			aObj.setCity(s4);
			aObj.setState(s5);
			aObj.setPincode(pincode);
			
			HttpSession session=request.getSession();
			User user=(User)session.getAttribute("uObj");
			user.getAddressSet().add(aObj);		
			
			//Set<Address> addresses=user.getAddressSet();
			//System.out.println(addresses);
			
			
			//addresses.add(aObj);
			
			UserDao daoObj=new UserDaoImpl();
			boolean b=daoObj.updateUser(user);
			
			if(b==true) {
				request.setAttribute("uObj", user);
				RequestDispatcher rd=request.getRequestDispatcher("ViewAddresses.jsp");
				rd.forward(request,response);
			}
					
	}

}
