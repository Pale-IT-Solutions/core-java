package service;

import java.util.List;

import entity.Company;

public interface CompanyService {

	void save(Company com);

	void update(Company com);

	void delete(Company com);

	Company finbyById(Integer id);

	List<Company> findAll();

}