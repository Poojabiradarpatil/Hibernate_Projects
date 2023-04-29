package org.jsp.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		long phone = Long.parseLong(req.getParameter("phone"));
		String password = req.getParameter("pswd");
		RequestDispatcher dispatcher = null;
		PrintWriter writer = resp.getWriter();
		if (phone == 888488 && password.equals("a123")) {
			dispatcher = req.getRequestDispatcher("home.html");
			dispatcher.forward(req, resp);
		} else {
			writer.write("<html><body><h2>Invalid Phone Number or Password</h2></body></html>");
			dispatcher = req.getRequestDispatcher("login.html");
			dispatcher.include(req, resp);
		}
	}
}
