package com.core.java.interface_;

public interface BaseService {

	String msg = "Hello...";

	default void show() {
		System.out.println("Show Method in BaseService......");
	}

	default int add(final int num1, final int num2) {
		System.out.println("add Method in BaseService......" + (num1 + num2));
		return (num1 + num2);
	}

	void save();

}