package com.core.java.singleton.lazy;

public class App {

	public static void main(final String[] args) {

		Common.getInstance().getList().forEach(System.out::println);
	}
}