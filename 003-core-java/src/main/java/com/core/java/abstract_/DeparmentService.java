package com.core.java.abstract_;

public class DeparmentService extends BaseService {

	@Override
	protected void doValidate() {
		System.out.println("doValidate in DeparmentService");
	}

	@Override
	protected void addBusinessLogic() {
		System.out.println("addBusinessLogic in DeparmentService");
	}

}