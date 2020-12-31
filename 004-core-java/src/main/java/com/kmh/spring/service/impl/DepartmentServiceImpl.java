package com.kmh.spring.service.impl;

import com.kmh.spring.dao.BaseDao;
import com.kmh.spring.entity.Department;
import com.kmh.spring.service.DepartmentService;

public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements DepartmentService {

	private static final long serialVersionUID = 1L;

	public DepartmentServiceImpl(final BaseDao<Department> dao) {
		super(dao);
	}
}
