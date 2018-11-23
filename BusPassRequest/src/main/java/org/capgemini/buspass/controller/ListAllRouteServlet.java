package org.capgemini.buspass.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.capgemini.buspass.model.RouteDetails;
import org.capgemini.buspass.service.BPServiceImpl;
import org.capgemini.buspass.service.IBPService;


@WebServlet("/ListAllRouteServlet")

public class ListAllRouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		IBPService ibpService=new BPServiceImpl();
		List<RouteDetails> routeList=new ArrayList<>();
		routeList=ibpService.getAllRoutesDetails();
		
		if(routeList==null) {
			PrintWriter out=response.getWriter();
			out.println("No data");
		}else {
			request.setAttribute("Route", routeList);
			request.getRequestDispatcher("displayroutes.jsp").include(request, response);;
		}
		
	}

}
