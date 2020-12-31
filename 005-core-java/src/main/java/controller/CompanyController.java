package controller;

import java.util.List;

import entity.Company;
import service.CompanyService;
import service.CompanyServiceImpl;

public class CompanyController {

	private final CompanyService service = new CompanyServiceImpl();

	public void add(final Company company) {

		
		this.service.save(company);
	}

	public void edit(final Company company) {
		this.service.update(company);
	}

	public void delete(final Company company) {
		this.service.delete(company);
	}

	public List<Company> findAll() {
		return this.service.findAll();
	}
}