package com.core.java.abstract_;

public abstract class BaseService {

	protected abstract void doValidate();

	protected abstract void addBusinessLogic();

	final public void save() {

		this.doValidate();
		this.addBusinessLogic();
		this.insert();
	}

	protected void insert() {
		System.out.println("insert data");

	}
}