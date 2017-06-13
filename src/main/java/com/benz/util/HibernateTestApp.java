package com.benz.util;

import java.util.List;

import org.hibernate.Session;

import com.benz.entity.Employee;

public class HibernateTestApp {

	public static void main(String[] args) {
		Session session = HibernateConfig.getHibernateconfig();
		System.out.println("Session:" + session);
		List<Employee> employees = session.createCriteria(Employee.class)
				.list();
		for (Employee emp : employees) {
			System.out.println("Emp: " + emp);
		}
	}
}
