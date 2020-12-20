package com.core.java.forloop;

import java.util.List;

import com.core.java.common.Common;

public class App {

	public static void main(final String... args) {

		final List<String> lst = new Common().getList();

		for (final String string : lst) {
			System.out.println(string);
		}

		lst.forEach(l -> System.out.println(l));

		lst.forEach(l -> {
			System.out.println(l);
			System.out.println();
		});

		lst.forEach(System.out::println);

	}

}