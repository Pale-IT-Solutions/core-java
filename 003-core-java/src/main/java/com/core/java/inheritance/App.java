package com.core.java.inheritance;

public class App {

	public static void main(final String[] args) {

		final BaseService baseService = new BaseService();

		final BaseService comService = new CompanyService();

		final BaseService depService = new DeparmentService();

		final BaseService emService = new EmployeeService();

		baseService.save();
		comService.save();
		depService.save();
		emService.save();

		System.out.println();

		baseService.showBaseService();
		comService.showBaseService();
		depService.showBaseService();
		emService.showBaseService();

	}

}
