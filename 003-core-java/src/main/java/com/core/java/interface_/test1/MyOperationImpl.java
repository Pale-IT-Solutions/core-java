package com.core.java.interface_.test1;

import java.util.ArrayList;
import java.util.List;

public class MyOperationImpl extends MyOpration {

	@Override
	public List<?> findAll() {
		final ArrayList<String> lst = new ArrayList<>();
		lst.add("findAll Method");
		lst.forEach(System.out::println);
		return lst;
	}

	@Override
	public void delete() {
		System.out.println("Delete interface deleteMethod");
	}

	@Override
	public void save() {
		System.out.println("Save interface saveMethod");
	}

	@Override
	void doOperation() {
		System.out.println("MyOperation abstract class doOperation");
	}

}
