package org.capgemini.buspass.service;

import java.sql.SQLException;
import java.util.List;

import org.capgemini.buspass.dao.BPDaoImpl;
import org.capgemini.buspass.dao.IBPDao;
import org.capgemini.buspass.model.AdminLogin;
import org.capgemini.buspass.model.RouteDetails;

public class BPServiceImpl implements IBPService {

	IBPDao dao=new BPDaoImpl();
	public boolean isValid(AdminLogin adminLogin) throws SQLException {
		if(dao.isValid(adminLogin)) {
			return true;
		}
		
		return false;
	}
	@Override
	public boolean addRouteDetails(RouteDetails routeDetails) {
		try {
			if(dao.addRouteDetails(routeDetails)) {
				return true;
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return false;
	}
	@Override
	public List<RouteDetails> getAllRoutesDetails() {
		List<RouteDetails> routeList=dao.getAllRoutesDetails();
		return routeList;
	}

}
