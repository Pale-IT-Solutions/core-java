package dao;

import java.util.List;

import entity.Company;

public interface CompanyDao {

	void save(Company com);

	void update(Company com);

	void delete(Company com);

	Company finbyById(Integer id);

	List<Company> findAll();

}