package org.jsp.servletdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/print")
public class PrintServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
		String password = request.getParameter("pswd");
		int age = Integer.parseInt(request.getParameter("age"));
		long phone = Long.parseLong(request.getParameter("phone"));
		PrintWriter writer = response.getWriter();
		User u = new User(id, age, name, password, phone);
		request.setAttribute("obj", u);
		RequestDispatcher dispatcher = request.getRequestDispatcher("print.jsp");
		dispatcher.forward(request, response);
	}

}
