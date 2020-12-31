package com.kmh.spring.dao.utils;

import java.util.ArrayList;
import java.util.List;

import com.kmh.spring.entity.Company;
import com.kmh.spring.entity.Department;
import com.kmh.spring.entity.Employee;

public class DBUtils {

	private static volatile DBUtils instance;

	private final List<Company> companies = new ArrayList<>();
	private final List<Department> depts = new ArrayList<>();
	private final List<Employee> emps = new ArrayList<>();

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

	public void add(final Department dept) {
		this.depts.add(dept);
	}

	public void edit(final Department dept) {

		for (final Department department : this.depts) {
			if (department.getId() == dept.getId()) {
				// TODO
			}
		}
	}

	public void remove(final Department dept) {
		this.depts.remove(dept);
	}

	public Department findDeptById(final Integer id) {
		for (final Department dept : this.depts) {
			if (dept.getId() == id) {
				return dept;
			}
		}
		return null;
	}

	public List<Department> findAllDepts() {
		return this.depts;
	}

	public void add(final Employee emp) {
		this.emps.add(emp);
	}

	public void edit(final Employee emp) {

		for (final Employee employee : this.emps) {
			if (employee.getId() == emp.getId()) {
				// TODO
			}
		}
	}

	public void remove(final Employee emp) {
		this.emps.remove(emp);
	}

	public Employee findEmployeeById(final Integer id) {
		for (final Employee employee : this.emps) {
			if (employee.getId() == id) {
				return employee;
			}
		}
		return null;
	}

	public List<Employee> findAllEmployees() {
		return this.emps;
	}

}