package com.kmh.spring.service.impl;

import com.kmh.spring.dao.BaseDao;
import com.kmh.spring.entity.Employee;
import com.kmh.spring.service.EmployeeService;

public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements EmployeeService {

	private static final long serialVersionUID = 1L;

	public EmployeeServiceImpl(final BaseDao<Employee> dao) {
		super(dao);
	}

}