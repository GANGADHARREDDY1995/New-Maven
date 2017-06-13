package com.benz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import com.benz.entity.Employee;
import com.benz.service.EmployeeService;

public class FetchingServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response)
			throws ServletException, IOException {
		EmployeeService employeeService = EmployeeService.getEmployeeService();
		Employee employee = employeeService.getEmployee(Integer
				.parseInt(request.getParameter("emp_Id")));
		request.setAttribute("employeeToUpdate", employee);
		System.out.println("Employee to Update: " + employee);
		request.getRequestDispatcher("/pages/update.jsp").forward(request,
				response);

	}
}
