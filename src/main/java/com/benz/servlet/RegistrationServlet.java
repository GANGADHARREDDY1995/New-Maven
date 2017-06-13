package com.benz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import com.benz.entity.Employee;
import com.benz.service.EmployeeService;

public class RegistrationServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmployeeService employeeService = EmployeeService.getEmployeeService();
	
	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		System.out.println("Calling Registration Servelt...........");
		Employee employee = getEmployeeInfo(request);

		employeeService.saveEmployee(employee);
		request.getRequestDispatcher("./display").forward(request, response);
	}

	private Employee getEmployeeInfo(ServletRequest request) {
		String name = request.getParameter("name");
		String father = request.getParameter("fathe");
		String mother = request.getParameter("mother");
		long phoneNumber = Long.parseLong(request.getParameter("number"));
		String address = request.getParameter("address");
		String gender = request.getParameter("gender");
		Employee employee = new Employee(name, father, mother, phoneNumber, address, gender);
		System.out.println("Employee: " + employee);
		return employee;
	}

}
