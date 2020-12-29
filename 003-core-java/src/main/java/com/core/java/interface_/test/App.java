package com.core.java.interface_.test;

public class App {

	public static void main(final String[] args) {

		final Order order = new Order();

		final Juice juice1 = new AppleJuice();

		order.doOrder(juice1);

		final Juice juice2 = new OrangeJuice();

		order.doOrder(juice2);

	}

}
