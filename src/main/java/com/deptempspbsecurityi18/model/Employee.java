package com.deptempspbsecurityi18.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="emp_id")
	private int empId;
	@Column(name="emp_name")
	@Size(min=3,max=12,message="atleast 3 char req")
	@NotNull
	private String empName;
	@Column(name="dob")
	@NotNull
	@Size(min=4,message="Enter dob ")
	
	private String dateOfBirth;
	@Column(name="mail_id")
	@Email
	  @Pattern(regexp=".+@.+\\..+", message="Enter The correct email")
	private String mailId;
	@Column(name="mobile_no")
	
	@Min(111111111L)
	@NotNull
	
	//@Pattern(regexp="(^$|[0-9]{10})")

	private long mobileNo;
	@Column(name="salary")
	@Min(value=4,message="min 4 digit")
	private float salary;
	//private int deptEmpId;
	@Column(name="company_name")
	@NotNull
	@Size(min=2,max=10,message="atleast 2 char req")
	private String companyName;
	@ManyToOne
	@JoinColumn(name="dept_emp_fk") 
	private Department department;
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	/*public int getDeptEmpId() {
		return deptEmpId;
	}
	public void setDeptEmpId(int deptEmpId) {
		this.deptEmpId = deptEmpId;
	}*/
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMailId() {
		return mailId;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Employee(int empId, String empName, String dateOfBirth, String mailId, long mobileNo, float salary,
			 String companyName, Department department) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.dateOfBirth = dateOfBirth;
		this.mailId = mailId;
		this.mobileNo = mobileNo;
		this.salary = salary;
		//this.deptEmpId = deptEmpId;
		this.companyName = companyName;
		this.department = department;
	}
	public Employee() {
		super();
	}
	
	
	
	

}
