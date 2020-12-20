package com.core.java.common;

import java.util.ArrayList;
import java.util.List;

public class Common {

	public List<String> getList() {

		final List<String> lst = new ArrayList<>();

		for (int i = 1; i < 10; i++) {
			lst.add("Mg Mg " + i);
		}
		return lst;
	}
}