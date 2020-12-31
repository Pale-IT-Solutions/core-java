package com.kmh.spring.service.impl;

import com.kmh.spring.dao.BaseDao;
import com.kmh.spring.entity.Company;
import com.kmh.spring.service.CompanyService;

public class CompanyServiceImpl extends BaseServiceImpl<Company> implements CompanyService {

	private static final long serialVersionUID = 1L;

	public CompanyServiceImpl(final BaseDao<Company> dao) {
		super(dao);
	}
}