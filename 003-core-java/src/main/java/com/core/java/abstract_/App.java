package com.core.java.abstract_;

public class App {

	public static void main(final String[] args) {

		final BaseService comService = new CompanyService();

		final BaseService depService = new DeparmentService();

		final BaseService emService = new EmployeeService();

		comService.save();
		System.out.println();

		depService.save();
		System.out.println();

		emService.save();

	}

}
