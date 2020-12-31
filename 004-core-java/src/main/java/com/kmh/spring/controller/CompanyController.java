package com.kmh.spring.controller;

import java.util.List;

import com.kmh.spring.dao.BaseDao;
import com.kmh.spring.dao.impl.CompanyDaoImpl;
import com.kmh.spring.entity.Company;
import com.kmh.spring.service.BaseService;
import com.kmh.spring.service.impl.CompanyServiceImpl;

public class CompanyController {

	private final BaseDao<Company> dao = new CompanyDaoImpl();
	private final BaseService<Company> service = new CompanyServiceImpl(this.dao);

	public void add(final Company company) {
		this.service.save(company);
	}

	public void edit(final Company company) {
		this.service.edit(company);
	}

	public void delete(final Company company) {
		this.service.delete(company);
	}

	public List<Company> findAll() {
		return this.service.findAll();
	}
}