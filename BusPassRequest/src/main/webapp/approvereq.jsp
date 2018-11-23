<%@page import="org.capgemini.buspass.model.BuspassBean"%>
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
	<%
		List<BuspassBean> buspassList = (List<BuspassBean>) request.getAttribute("Approve");
	%>
	<table>
		<tr>
			<th>Bus pass Request Id</th>
			<th>Employee Id</th>
			<th>Get All Info</th>
		</tr>
		<%for(BuspassBean bList:buspassList){ %>
		<tr>
			<td><input type="text" name="id" value="<%= bList.getRequestId() %>"></td>
			<td><%=bList.getEmpId() %></td>
		</tr>
		<tr>

		</tr>
	</table>
	<%} %>
</body>
</html>