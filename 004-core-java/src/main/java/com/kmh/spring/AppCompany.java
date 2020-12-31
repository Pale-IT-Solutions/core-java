package com.kmh.spring;

import java.util.ArrayList;
import java.util.List;

import com.kmh.spring.controller.CompanyController;
import com.kmh.spring.entity.Company;

public class AppCompany {

	public static void main(final String[] args) {

		final CompanyController controller = new CompanyController();

		List<Company> companies = new ArrayList<>();

		companies = controller.findAll();
		companies.forEach(System.out::println);

		Company company = Company.builder().id(1).name("GIC Japan").address("Tokyo, Japan").build();
		controller.add(company);

		companies = controller.findAll();
		companies.forEach(System.out::println);

		company = Company.builder().id(1).name("GIC Myanmar").address("Yangon, Myanmar").build();
		controller.edit(company);

		companies = controller.findAll();
		companies.forEach(System.out::println);

	}
}