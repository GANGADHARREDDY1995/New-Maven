package com.benz.util;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.benz.entity.Employee;

public class HibernateConfig {

	private static Session session = null;

	public static Session getHibernateconfig() {
		if (session == null) {
			Configuration configuration = new Configuration()
					.setProperty("hibernate.dialect",
							"org.hibernate.dialect.Oracle10gDialect")
					.setProperty("hibernate.connection.driver_class",
							"oracle.jdbc.driver.OracleDriver")
					.setProperty("hibernate.connection.url",
							"jbdc:oracle:thin:@localhost:1521:xe")
					.setProperty("hibernate.connection.username", "practice")
					.setProperty("hibernate.connection.password", "varun")
					.setProperty("hibernate.hbm2ddl.auto", "update")
					.setProperty("hibernate.show_sql", "true")
					.addAnnotatedClass(Employee.class);

			session = configuration.configure().buildSessionFactory()
					.openSession();
			System.out.println("Session: " + session);
		}
		return session;
	}

}
