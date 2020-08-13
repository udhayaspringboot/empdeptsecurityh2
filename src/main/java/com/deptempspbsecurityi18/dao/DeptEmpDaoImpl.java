package com.deptempspbsecurityi18.dao;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.deptempspbsecurityi18.model.Department;
import com.deptempspbsecurityi18.model.Employee;
@Repository
public class DeptEmpDaoImpl implements DeptEmpDao{

	
	@Autowired
	DeptRepo deptRepo;
	@Autowired
	DeptPageRepo deptPage;
	@Autowired
	EmpRepo empRepo;
	
	@Override
	public boolean createDept(Department dept) {
		System.out.println("dao layer "+dept.getDeptName());
		
		
		deptRepo.save(dept);
		
		return true;
	}

	@Override
	public boolean updateDept(Department dept) {
		deptRepo.save(dept);
		return false;
	}

	@Override
	public List<Department> readAllDept() {
		List<Department> lDept = (List<Department>) deptRepo.findAll();
		return lDept;
	}
	
	@Override
	public Page<Department> readAllDeptPage(Pageable pageable) {
		Page<Department> lDept = (Page<Department>) deptPage.findAll(pageable);
		return lDept;
	}

	@Override
	public boolean delteDept(int deptId) {
		deptRepo.deleteByDeptId(deptId);
		//deptRepo.deleteAll(deptId);
		return false;
	}

	@Override
	public boolean createEmp(Employee employee) {
		empRepo.save(employee);
		return false;
	}

	@Override
	public boolean updateEmp(Employee employee) {
		empRepo.save(employee);
		return false;
	}

	@Override
	public List<Employee> readEmpFromDept(int deptId) {
		List<Employee> lEmp = empRepo.findByDepartment(deptId);
		return lEmp;
	}

	@Override
	public boolean deleteEmpFromDept(int deptId, int empId) {
		System.out.println("values at dao impl "+" dept id "+deptId + " empId" +empId);
		empRepo.deleteByEmpIdAndDepartment(empId,deptId);
		return false;
	}

	
	
	
	

}
