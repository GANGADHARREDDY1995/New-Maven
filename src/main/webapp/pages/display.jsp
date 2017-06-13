<%@page import="java.util.List"%>
<%@page import="com.benz.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Employe Data</title>
</head>

<body>
	<form>
		<table>
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>father</th>
				<th>mother</th>
				<th>Address</th>
				<th>Phone</th>
				<th>Gender</th>
				<!-- <th>Select</th> -->
			</tr>

			<%
				List<Employee> employeelist = (List<Employee>) request
						.getAttribute("employeeList");
				for (Employee employee : employeelist) {
			%>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getFatherName()%></td>
				<td><%=employee.getMotherName()%></td>
				<td><%=employee.getAddress()%></td>
				<td><%=employee.getPhoneNumber()%></td>
				<td><%=employee.getGender()%></td>
				<%-- <td><input type="radio" name="emp_Id" id="emp_Id"
					value=<%=employee.getId()%>></td>
				 --%>	
				<td><a href="/MavenServletExample/delete?emp_id=<%=employee.getId()%>">Delete</a></td>
				<td><a href="/MavenServletExample/update?emp_id=<%=employee.getId()%>">Update</a></td>
			</tr>

			<%
				}
			%>
			
		</table>

	</form>
</body>
</html>