package com.deptempspbsecurityi18.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.deptempspbsecurityi18.model.Department;

public interface DeptPageRepo extends PagingAndSortingRepository<Department, Integer> {

}
