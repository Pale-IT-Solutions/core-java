package com.core.java.builder;

public class Common {

	private static volatile Common instance = null;

	private Common() {
	}

	public static Common getInstance() {
		if (null == instance) {
			synchronized (Common.class) {
				if (null == instance) {
					instance = new Common();
				}
			}
		}
		return instance;
	}

	public Company getCompany() {

		final Company company = Company.builder()
				.id(1).name("Pale It Solutions Co., Ltd.")
				.address("Tokyo, Japan.")
				.phone("0987654321123")
				.type(CompanyType.FOREIGN)
				.size(CompanySize.SIZE_100)
				.build();

		return company;
	}

}