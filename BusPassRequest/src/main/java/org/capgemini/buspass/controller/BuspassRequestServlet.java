package org.capgemini.buspass.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.capgemini.buspass.model.BuspassBean;
import org.capgemini.buspass.service.BPServiceImpl;
import org.capgemini.buspass.service.IBPService;


@WebServlet("/BuspassRequestServlet")
public class BuspassRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empId=request.getParameter("empid");
		String firstName=request.getParameter("fn");
		String lastName=request.getParameter("ln");
		String emailId=request.getParameter("email");
		String gender=request.getParameter("gender");
		String address=request.getParameter("address");
		String doj=request.getParameter("dateofjoining");
		String location=request.getParameter("location");
		String pickupLocation=request.getParameter("pickup");
		String pickupTime=request.getParameter("ptime");
		String designation=request.getParameter("designation");
		
		
		String[] date=doj.split("-");
		for(String s:date) {
			System.out.println(s);
		}
		LocalDate dateOfJoin=LocalDate.of(Integer.parseInt(date[0]), Integer.parseInt(date[1]),Integer.parseInt(date[2]));
		String[] time=pickupTime.split(":");
		LocalTime pupt=LocalTime.of(Integer.parseInt(time[0]),Integer.parseInt(time[1]));
		BuspassBean buspassBean=new BuspassBean();
		buspassBean.setEmpId(empId);
		buspassBean.setFirstName(firstName);
		buspassBean.setLastName(lastName);
		buspassBean.setEmail(emailId);
		buspassBean.setGender(gender);
		buspassBean.setAddress(address);
		buspassBean.setDateOfJoining(dateOfJoin);
		buspassBean.setLocation(location);
		buspassBean.setPickuplocation(pickupLocation);
		buspassBean.setTime(pupt);
		buspassBean.setDesignation(designation);

		PrintWriter out = response.getWriter();
		
		IBPService ibpService = new BPServiceImpl();
		if(ibpService.createBuspassRequest(buspassBean)) {
			out.println("Added");
		}else {
			out.println("Failed to add");
		}
		
		
		
		
		
		
	}

}
