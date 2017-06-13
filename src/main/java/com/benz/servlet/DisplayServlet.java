package com.benz.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import com.benz.entity.Employee;
import com.benz.service.EmployeeService;

public class DisplayServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmployeeService employeeService = EmployeeService.getEmployeeService();

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Calling display servlet.........");
		List<Employee> employees = employeeService.getAllEmployees();
		System.out.println("Loading " + employees.size() + " employee details....");

		request.setAttribute("employeeList", employees);

		request.getRequestDispatcher("./pages/display.jsp").forward(request, response);
	}

}
