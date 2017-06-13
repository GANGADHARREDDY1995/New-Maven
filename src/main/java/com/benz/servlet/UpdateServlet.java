package com.benz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.benz.entity.Employee;
import com.benz.service.EmployeeService;

public class UpdateServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Calling Update Servlet DO GET............");
		EmployeeService employeeService = EmployeeService.getEmployeeService();
		Employee employee = employeeService.getEmployee(Integer
				.parseInt(request.getParameter("emp_id")));
		request.setAttribute("employeeToUpdate", employee);
		System.out.println("Employee to Update: " + employee);
		request.getRequestDispatcher("/pages/update.jsp").forward(request,
				response);
	}

	@Override
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Calling Update Servlet DO POST............");
		EmployeeService service = EmployeeService.getEmployeeService();
		Employee employee = getEmployeeToUpdate(request);
		service.updateEmployee(employee);
		System.out
				.println("Employee details Updated successfully: " + employee);
		request.getRequestDispatcher("./display").forward(
				request, response);
	}

	private Employee getEmployeeToUpdate(ServletRequest request) {
		Employee employee = new Employee();
		// System.out.println("Emp Id ::::::::::: "+request.getParameter("id"));
		System.out.println("Emp Id ::::::::::: "+request.getParameter("empId"));
		employee.setId(Integer.parseInt(request.getParameter("empId")));
		employee.setName(request.getParameter("name"));
		employee.setFatherName(request.getParameter("father"));
		employee.setMotherName(request.getParameter("mother"));
		employee.setAddress(request.getParameter("address"));
		employee.setPhoneNumber(Long.parseLong(request.getParameter("phone")));
		employee.setGender(request.getParameter("gender"));
		return employee;
	}
}
