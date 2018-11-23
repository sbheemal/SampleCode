package org.capgemini.buspass.service;

import java.sql.SQLException;
import java.util.List;

import org.capgemini.buspass.model.AdminLogin;
import org.capgemini.buspass.model.BuspassBean;
import org.capgemini.buspass.model.RouteDetails;

public interface IBPService {

	public boolean isValid(AdminLogin adminLogin) throws SQLException;

	public boolean addRouteDetails(RouteDetails routeDetails) throws SQLException;

	public List<RouteDetails> getAllRoutesDetails();

	public boolean createBuspassRequest(BuspassBean buspassBean);

}
