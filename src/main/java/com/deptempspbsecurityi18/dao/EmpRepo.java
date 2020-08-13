package com.deptempspbsecurityi18.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deptempspbsecurityi18.model.Employee;
@Repository
public interface EmpRepo extends CrudRepository<Employee, Integer> {

	@Query(value="select * from employee where dept_emp_fk=?1",nativeQuery = true)
	List<Employee> findByDepartment(int deptId);

	
	//boolean deleteByEmpIdAndDepartment(int empId, int deptId);
	@Modifying
	@Query(value="delete from employee where emp_id=?1 and dept_emp_fk=?2",nativeQuery = true)
	void deleteByEmpIdAndDepartment(int empId, int deptId);

}
