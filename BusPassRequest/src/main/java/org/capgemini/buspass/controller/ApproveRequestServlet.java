package org.capgemini.buspass.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.capgemini.buspass.model.BuspassBean;
import org.capgemini.buspass.service.BPServiceImpl;
import org.capgemini.buspass.service.IBPService;


@WebServlet("/ApproveRequestServlet")
public class ApproveRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out=response.getWriter();
		IBPService ibpService=new BPServiceImpl();
		List<BuspassBean> buspassList=ibpService.getAllBuspassRequests();
		if(buspassList==null) {
			out.println("NOT");
		}else {
			for(BuspassBean bean:buspassList) {
				System.out.println(bean.getEmpId());
			}
			request.setAttribute("Approve", buspassList);
			request.getRequestDispatcher("approvereq.jsp").include(request, response);
		}
	}

}
