package com.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="emp_dtls")
public class EmployeeAnotationExample {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="name",nullable = false)
	private String emp_name;
	private Double salary;
	@Temporal(TemporalType.DATE)
	private Date joiningDate;
	private String email;
	private boolean status;
	@Transient
	private String token;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getemp_name() {
		return emp_name;
	}
	public void setemp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	public Date getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
	
	
}
