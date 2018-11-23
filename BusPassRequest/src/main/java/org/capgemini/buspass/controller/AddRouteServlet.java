package org.capgemini.buspass.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.capgemini.buspass.model.RouteDetails;
import org.capgemini.buspass.service.BPServiceImpl;
import org.capgemini.buspass.service.IBPService;

@WebServlet("/AddRouteServlet")
public class AddRouteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddRouteServlet() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String routePath=request.getParameter("routePath");
		String occupiedSeats=request.getParameter("seats");
		String totalSeats=request.getParameter("capacity");
		String busNo=request.getParameter("busno");
		String driverNo=request.getParameter("driverno");
		String totalKM=request.getParameter("totalkm");

		RouteDetails routeDetails=new RouteDetails();
		routeDetails.setRoutePath(routePath);

		Integer occupiedS=Integer.parseInt(occupiedSeats);
		routeDetails.setOccupiedSeats(occupiedS);

		Integer capacity=Integer.parseInt(totalSeats);
		routeDetails.setTotalSeats(capacity);

		routeDetails.setBusNo(busNo);
		routeDetails.setDriverNo(driverNo);

		Integer totalkilom=Integer.parseInt(totalKM);
		routeDetails.setTotalKM(totalkilom);

		IBPService ibpService=new BPServiceImpl();

		try {
			if(ibpService.addRouteDetails(routeDetails)) {
				request.getRequestDispatcher("route.jsp").forward(request, response);

			}else {
				PrintWriter out=response.getWriter();
				out.println("NOT");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
