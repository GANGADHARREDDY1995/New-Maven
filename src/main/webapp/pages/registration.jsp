<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- <link rel="stylesheet" type="text/css" href="./styles.css"> -->
<title>Registration</title>
</head>
<body>
	<form action="/MavenServletExample/register" method="post">
		<table>
			<thead>
				<tr style="background-color: aqua; color: navy;">
					<td
						style="width: 250; height: 100px; border: 1px solid red; padding-left: 20px; font-size: 32px;"><div>Application</div></td>
					<td
						style="height: 100px; width: 1000px; border: 1px solid red; font-size: 32px; text-align: right;">
						<span style="padding-right: 30px;">Welcome SivaReddy</span>
					</td>
					<td
						style="height: 100px; width: 138px; border: 1px solid red; text-align: right;"><span
						style="padding-right: 20px">logout</span></td>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td colspan="3"
						style="width: 1000px; height: 60px; border: 1px solid red; background-color: gray;"><div>
							<span style="padding-left: 20px; color: white;">Employee Data</span>
						</div></td>
				</tr>
				<tr style="background-color: orange;">
					<td colspan="3" style="border: 1px solid green; height: 500pxpx;"><div>
							<table cellpadding="10" cellspacing="10"
								style="margin-left: 20px; margin-top: 20px; border: 1px solid red; background-color: silver;">
								<tr>
									<td><label>Employ Name :</label></td>
									<td><input type="text" name="name"></td>
								</tr>
								<tr>
									<td><label>Employ Father Name :</label></td>
									<td><input type="text" name="fathe"></td>
								</tr>
								<tr>
									<td><label>Employ Mother Name :</label></td>
									<td><input type="text" name="mother"></td>
								</tr>
								<tr>
									<td><label>Employ Phone Number :</label></td>
									<td><input type="number" name="number"></td>
								</tr>
								<tr>
									<td><label>Employ Address :</label></td>
									<td><input type="text" name="address"></td>
								</tr>
								<tr>
									<td><label>Gender</label></td>
									<td>Male:<input type="radio" value="m" name="gender">Female:<input
										name="gender" type="radio" value="f">Others:<input
										type="radio" value="o" name="gender"></td>
								</tr>
							</table>
						</div></td>
				</tr>
			</tbody>

			<tfoot>
				<tr style="background-color: aqua; color: navy;">
					<td colspan="3"
						style="border: 1px solid red; width: 1366px; height: 100px; text-align: center;"><span><input
							type="submit" value="save"></span> <input type="reset"
						value="reset"></td>
				</tr>
			</tfoot>
		</table>
	</form>
</body>
</html>