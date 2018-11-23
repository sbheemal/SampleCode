package org.capgemini.buspass.model;

public class RouteDetails {

	private Integer routeId;
	private String routePath;
	private Integer occupiedSeats=0;
	private Integer totalSeats;
	private String busNo;
	private String driverNo;
	private Integer totalKM;
	
	public RouteDetails() {
		
	}
	public RouteDetails(Integer routeId, String routePath, Integer occupiedSeats, Integer totalSeats, String busNo,
			String driverNo, Integer totalKM) {
		super();
		this.routeId = routeId;
		this.routePath = routePath;
		this.occupiedSeats = occupiedSeats;
		this.totalSeats = totalSeats;
		this.busNo = busNo;
		this.driverNo = driverNo;
		this.totalKM = totalKM;
	}
	public Integer getRouteId() {
		return routeId;
	}
	public void setRouteId(Integer routeId) {
		this.routeId = routeId;
	}
	public String getRoutePath() {
		return routePath;
	}
	public void setRoutePath(String routePath) {
		this.routePath = routePath;
	}
	public Integer getOccupiedSeats() {
		return occupiedSeats;
	}
	public void setOccupiedSeats(Integer occupiedSeats) {
		this.occupiedSeats = occupiedSeats;
	}
	public Integer getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}
	public String getBusNo() {
		return busNo;
	}
	public void setBusNo(String busNo) {
		this.busNo = busNo;
	}
	public String getDriverNo() {
		return driverNo;
	}
	public void setDriverNo(String driverNo) {
		this.driverNo = driverNo;
	}
	public Integer getTotalKM() {
		return totalKM;
	}
	public void setTotalKM(Integer totalKM) {
		this.totalKM = totalKM;
	}
}
