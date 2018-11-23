package org.capgemini.buspass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.capgemini.buspass.model.AdminLogin;
import org.capgemini.buspass.model.RouteDetails;



public class BPDaoImpl implements IBPDao{

	public boolean isValid(AdminLogin adminLogin) throws SQLException {

		String sql="Select * from login where username=? and password=?";

		try(PreparedStatement preparedstatement=getMySQLDBConnection().prepareStatement(sql);){
			preparedstatement.setString(1, adminLogin.getUsername());
			preparedstatement.setString(2, adminLogin.getPassword());
			ResultSet rs=preparedstatement.executeQuery();
			if(rs.next()) {
				return true;
			}
		}
		return false;
	}

	private Connection getMySQLDBConnection() {
		Connection conn=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/buspass", "root", "India123");
			return conn;
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {

		}
		return null;
	}

	@Override
	public boolean addRouteDetails(RouteDetails routeDetails) throws SQLException {

		String sql="insert into route_details(route_path,occupied_seats,total_seats,bus_no,driver_no,total_kilometers) values(?,?,?,?,?,?); ";
		try(PreparedStatement preparedstatement=getMySQLDBConnection().prepareStatement(sql);){
			preparedstatement.setString(1, routeDetails.getRoutePath());
			preparedstatement.setInt(2, routeDetails.getOccupiedSeats());
			preparedstatement.setInt(3, routeDetails.getTotalSeats());
			preparedstatement.setString(4, routeDetails.getBusNo());
			preparedstatement.setString(5, routeDetails.getDriverNo());
			preparedstatement.setInt(6, routeDetails.getTotalKM());

			int c=preparedstatement.executeUpdate();
			if(c>0) {
				return true;
			}
		}catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public List<RouteDetails> getAllRoutesDetails() {
		
		List<RouteDetails> routeList=new ArrayList<>();
		String sql="select * from route_details";

		try(Statement statement=getMySQLDBConnection().createStatement();)
		{
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				RouteDetails routeDetails=new RouteDetails();
				routeDetails.setRouteId(resultSet.getInt(1));
				routeDetails.setRoutePath(resultSet.getString(2));
				routeDetails.setOccupiedSeats(resultSet.getInt(3));
				routeDetails.setTotalSeats(resultSet.getInt(4));
				routeDetails.setBusNo(resultSet.getString(5));
				routeDetails.setDriverNo(resultSet.getString(6));
				routeDetails.setTotalKM(resultSet.getInt(7));
			
				routeList.add(routeDetails);
			
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return routeList;
	}

public void greetings() {
	
}
}

