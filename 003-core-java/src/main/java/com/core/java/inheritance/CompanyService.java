package com.core.java.inheritance;

public class CompanyService extends BaseService {

	@Override
	protected void save() {

		System.out.println("CompanyService save() Method");

	}

	@Override
	protected void edit() {
		super.edit();
	}
}