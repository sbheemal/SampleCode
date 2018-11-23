<%@page import="org.capgemini.buspass.model.RouteDetails"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Details</h1>
	<%
		List<RouteDetails> routeList = (List<RouteDetails>) request.getAttribute("Route");
	%>
	<table>
		<tr>
			<th>Route Id</th>
			<th>Route Path</th>
			<th>Occupied Seats</th>
			<th>Total Seats</th>
			<th>Bus Number</th>
			<th>Driver NO.</th>
			<th>Total KiloMeters</th>
		</tr>
		<% for(RouteDetails routeDetails:routeList){ %>		
			
			<tr>
			<td><input type="text" name="id" value="<%=routeDetails.getRouteId() %>"></td>
			<td><input type="text" name="path" value="<%=routeDetails.getRoutePath() %>"></td>
			<td><input type="text" name="os" value="<%=routeDetails.getOccupiedSeats() %>"></td>
			<td><input type="text" name="ts" value="<%=routeDetails.getTotalSeats() %>"></td>
			<td><input type="text" name="bn" value="<%=routeDetails.getBusNo() %>"></td>
			<td><input type="text" name="dn" value="<%=routeDetails.getDriverNo() %>"></td>
			<td><input type="text" name="tkm" value="<%=routeDetails.getTotalKM() %>"></td>
			</tr>	
		<% }%>

	</table>

</body>
</html>