package com.deptempspbsecurityi18.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.deptempspbsecurityi18.model.Department;
@Repository
@Transactional
public interface DeptRepo extends CrudRepository<Department, Integer> {

	@Modifying
	//@Query(value="delete from department where dept_id in (?)",nativeQuery = true)
	@Query(value="delete from department where dept_id =?1",nativeQuery = true)
	void deleteByDeptId(int deptId);

}
