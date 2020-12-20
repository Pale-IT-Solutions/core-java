package com.core.java.abstract_;

public class EmployeeService extends BaseService {

	@Override
	protected void doValidate() {
		System.out.println("doValidate in EmployeeService");
	}

	@Override
	protected void addBusinessLogic() {
		System.out.println("addBusinessLogic in EmployeeService");
	}

}