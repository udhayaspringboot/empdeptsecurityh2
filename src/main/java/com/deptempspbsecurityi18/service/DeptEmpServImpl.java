package com.deptempspbsecurityi18.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deptempspbsecurityi18.dao.DeptEmpDao;
import com.deptempspbsecurityi18.model.Department;
import com.deptempspbsecurityi18.model.Employee;


@Service
@Transactional
public class DeptEmpServImpl implements DeptEmpService {
    
	@Autowired
	DeptEmpDao dempServ;
	@Override
	public boolean createDeptServ(Department dept) {
		
		dempServ.createDept(dept);
		return false;
	}

	@Override
	public boolean updateDeptServ(Department dept) {

          dempServ.updateDept(dept);
		return false;
	}

	@Override
	public List<Department> readAllDeptServ() {
		List<Department> lisDept = dempServ.readAllDept();
		return lisDept;
	}

	@Override
	public boolean delteDeptServ(int deptId) {
	dempServ.delteDept(deptId);
		return false;
	}

	@Override
	public boolean createEmpServ(Employee employee) {
		dempServ.createEmp(employee);
		return false;
	}

	@Override
	public boolean updateEmpServ(Employee employee) {
		dempServ.updateEmp(employee);
		return false;
	}

	@Override
	public List<Employee> readEmpFromDeptServ(int empId) {
		List<Employee> lisEmp = dempServ.readEmpFromDept(empId);
		return lisEmp;
	}

	@Override
	public boolean deleteEmpFromDeptServ(int deptId, int empId) {
		dempServ.deleteEmpFromDept(deptId, empId);
		
		return false;
	}

	@Override
	public Page<Department> readAllDeptPage(Pageable pageable) {
		Page<Department> pgf =dempServ.readAllDeptPage(pageable);
		return pgf;
	}


}
