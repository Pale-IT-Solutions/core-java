package com.kmh.spring.dao.impl;

import java.util.List;

import com.kmh.spring.dao.CompanyDao;
import com.kmh.spring.dao.utils.DBUtils;
import com.kmh.spring.entity.Company;

public class CompanyDaoImpl extends BaseDaoImpl<Company> implements CompanyDao {

	private static final long serialVersionUID = 1L;

	@Override
	public Company findByCompanyName(final String companyName) {
		return null;
	}

	@Override
	public List<Company> findAll() {
		if (0 == DBUtils.getInstance().findAllCompanies().size()) {
			System.out.println("Company Data is empty ....... in DAO");
		} else {
			System.out.println("Company Data is not empty ....... in DAO");
		}

		return DBUtils.getInstance().findAllCompanies();
	}
}