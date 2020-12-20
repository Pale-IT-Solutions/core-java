package com.core.java.singleton.eager;

import java.util.ArrayList;
import java.util.List;

public class Common {

	private static final Common instance = new Common();

	private Common() {
	}

	public static Common getInstance() {
		return instance;
	}

	public List<String> getList() {

		final List<String> lst = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			lst.add("Mg Mg " + i);
		}
		return lst;
	}
}