package org.capgemini.buspass.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.capgemini.buspass.model.AdminLogin;
import org.capgemini.buspass.service.BPServiceImpl;
import org.capgemini.buspass.service.IBPService;

@WebServlet("/BuspassServlet")
public class BuspassServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public BuspassServlet() {
		super();
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("username");
		String password=request.getParameter("pwd");
		AdminLogin adminLogin=new AdminLogin(username,password);
		IBPService ibpService=new BPServiceImpl();
		PrintWriter printwriter=response.getWriter();
		response.setContentType("text/html");
		try {
			if(ibpService.isValid(adminLogin)) {
				response.sendRedirect("pages/main.html");
			}else {
				request.getRequestDispatcher("NewFile.html");
				printwriter.println("Invalid");
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
