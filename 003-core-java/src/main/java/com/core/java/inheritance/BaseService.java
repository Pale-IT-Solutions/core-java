package com.core.java.inheritance;

public class BaseService {

	protected void save() {
		System.out.println("Base Service save() Method");
	}

	protected void edit() {
		System.out.println("Base Service edit() Method");
	}

	protected void delete() {
		System.out.println("Base Service delete() Method");
	}

	final public void showBaseService() {
		System.out.println("Base Service showBaseService() Method");
	}

}