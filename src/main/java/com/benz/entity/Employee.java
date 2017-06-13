package com.benz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEEFORM")
public class Employee {
	private int id;
	private String name;
	private String fatherName;
	private String motherName;
	private long phoneNumber;
	private String address;
	private String gender;

	public Employee() {

	}

	public Employee(String name, String fatherName, String motherName, long phoneNumber, String address,
			String gender) {
		super();
		this.name = name;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.gender = gender;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "NAME", length = 50)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "FATHER", length = 50)
	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "MOTHER", length = 50)
	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	@Column(name = "PHONE")
	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "ADDRESS", length = 100)
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "GENDER", length = 5)
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", fatherName=" + fatherName + ", motherName=" + motherName
				+ ", phoneNumber=" + phoneNumber + ", address=" + address + ", gender=" + gender + "]";
	}

}
