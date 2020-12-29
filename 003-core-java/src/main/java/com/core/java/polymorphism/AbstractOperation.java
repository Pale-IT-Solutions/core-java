package com.core.java.polymorphism;

public abstract class AbstractOperation implements Add, Multiply {

	abstract void doValidate();

	@Override
	public int multiply(final int num1, final int num2) {
		return 0;
	}

	@Override
	public int multiply(final int num1, final int num2, final int num3) {
		return 0;
	}

	@Override
	public int multiply(final int num1, final int num2, final int num3, final int num4) {
		return 0;
	}

	@Override
	public int multiply(final double num1, final double num2) {
		return 0;
	}

	@Override
	public int multiply(final double num1, final double num2, final double num3) {
		return 0;
	}

	@Override
	public int multiply(final double num1, final double num2, final double num3, final double num4) {
		return 0;
	}

	@Override
	final public int add(final int num1, final int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(final int num1, final int num2, final int num3) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(final int num1, final int num2, final int num3, final int num4) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(final double num1, final double num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add(final double num1, final double num2, final double num3) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public abstract int add(final double num1, final double num2, final double num3, final double num4);

}
