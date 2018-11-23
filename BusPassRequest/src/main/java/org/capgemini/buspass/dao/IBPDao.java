package org.capgemini.buspass.dao;

import java.sql.SQLException;
import java.util.List;

import org.capgemini.buspass.model.AdminLogin;
import org.capgemini.buspass.model.RouteDetails;

public interface IBPDao {

	public boolean isValid(AdminLogin adminLogin) throws SQLException;

	public boolean addRouteDetails(RouteDetails routeDetails) throws SQLException;

	public List<RouteDetails> getAllRoutesDetails();
	
	public void greetings();
}
