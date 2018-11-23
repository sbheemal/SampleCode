package org.capgemini.buspass.model;

import java.time.LocalDate;
import java.util.Date;

public class BuspassBean {
	
	private Integer request;
	private String empiId;
	private String firstName;
	private String lastName;
	private String gender;
	private String email;
	private String address;
	private LocalDate dateOfJoining;
	private String location;
	private String pickuplocation;
	private String time;
	
	
	public BuspassBean() {
		super();
	}
	public BuspassBean(Integer request, String empiId, String firstName, String lastName, String gender, String email,
			String address, LocalDate dateOfJoining, String location, String pickuplocation, String time) {
		super();
		this.request = request;
		this.empiId = empiId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.address = address;
		this.dateOfJoining = dateOfJoining;
		this.location = location;
		this.pickuplocation = pickuplocation;
		this.time = time;
	}
	public Integer getRequest() {
		return request;
	}
	public void setRequest(Integer request) {
		this.request = request;
	}
	public String getEmpId() {
		return empiId;
	}
	public void setEmpId(String empiId) {
		this.empiId = empiId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPickuplocation() {
		return pickuplocation;
	}
	public void setPickuplocation(String pickuplocation) {
		this.pickuplocation = pickuplocation;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "BuspassBean [request=" + request + ", empiId=" + empiId + ", firstName=" + firstName + ", lastName="
				+ lastName + ", gender=" + gender + ", email=" + email + ", address=" + address + ", dateOfJoining="
				+ dateOfJoining + ", location=" + location + ", pickuplocation=" + pickuplocation + ", time=" + time
				+ "]";
	}
	
	
	
}
