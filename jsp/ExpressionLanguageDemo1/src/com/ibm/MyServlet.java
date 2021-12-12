package com.ibm;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class MyServlet extends HttpServlet {

		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
			// the user object returned form servie layer
			
			User user=new User();
			user.setUsername("sarba");
			user.setPassword("ibm");
			
			HttpSession session=request.getSession();
			session.setAttribute("user",user);
			
			RequestDispatcher rd=request.getRequestDispatcher("/output.jsp");
			rd.forward(request,response);
			
			
	}

	
}
