package com.kmh.spring.dao;

import com.kmh.spring.entity.Company;

public interface CompanyDao extends BaseDao<Company> {

	Company findByCompanyName(String companyName);
}