package dao;

import java.util.ArrayList;
import java.util.List;

import entity.Company;

public class DBUtils {

	private static volatile DBUtils instance;

	private final List<Company> companies = new ArrayList<Company>();

	private DBUtils() {
	}

	public static DBUtils getInstance() {
		if (null == instance) {
			synchronized (DBUtils.class) {
				if (null == instance) {
					instance = new DBUtils();
				}
			}
		}
		return instance;
	}

	public void add(final Company com) {
		this.companies.add(com);
	}

	public void edit(final Company company) {

		for (final Company com : this.companies) {
			if (com.getId() == company.getId()) {
				com.setName(company.getName());
				com.setAddress(company.getAddress());
			}
		}
	}

	public void remove(final Company company) {
		this.companies.remove(company);
	}

	public Company findCompanyById(final Integer id) {
		for (final Company company : this.companies) {
			if (company.getId() == id) {
				return company;
			}
		}
		return null;
	}

	public List<Company> findAllCompanies() {
		return this.companies;
	}

}