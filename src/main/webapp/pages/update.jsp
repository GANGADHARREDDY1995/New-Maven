<%@page import="com.benz.entity.Employee"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update jsp</title>
</head>
<body>
	<form action="./update" method="post">
		<table>

			<%
				Employee employee = (Employee) request.getAttribute("employeeToUpdate");
			%>
			
			<tr>
				<td><label>ID :</label></td>
				<td>
					<input type="hidden" value="<%=employee.getId()%>" name="empId" />
					<input type="text" value="<%=employee.getId()%>" disabled="disabled" name="id">
				</td>
			</tr>
			<tr>
				<td><label>name</label></td>
				<td><input type="text" value="<%=employee.getName()%>" name="name"></td>
			</tr>
			<tr>
				<td><label>Father Name</label></td>
				<td><input type="text" value="<%=employee.getFatherName()%>" name="father"></td>
			</tr>
			<tr>
				<td><label>Mother Name</label></td>
				<td><input type="text" value="<%=employee.getMotherName()%>" name="mother"></td>
			</tr>
			<tr>
				<td><label>Address</label></td>
				<td><input type="text" value="<%=employee.getAddress()%>" name="address"></td>
			</tr>
			<tr>
				<td><label>Phone Number</label></td>
				<td><input type="text" value="<%=employee.getPhoneNumber()%>" name="phone"></td>
			</tr>
			<tr>
				<td><label>Gender</label></td>
				<td><input type="text" value="<%=employee.getGender()%>" name="gender"></td>
			</tr>

			<tr>
				<td><input type="submit" value="Update"></td>
				<td><input type="reset" value="Reset"></td>
			</tr>

		</table>
	</form>
</body>
</html>