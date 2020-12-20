package com.core.java.abstract_;

public class CompanyService extends BaseService {

	@Override
	protected void doValidate() {
		System.out.println("doValidate in CompanyService");
	}

	@Override
	protected void addBusinessLogic() {
		System.out.println("addBusinessLogic in CompanyService");
	}

}