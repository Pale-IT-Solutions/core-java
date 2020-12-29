package com.core.java.interface_.test1;

public class App {

	public static void main(final String[] args) {

		final MyOpration myOpration = new MyOperationImpl();
		myOpration.doOperation();

		final MyOperationImpl myOprationImpl = new MyOperationImpl();
//		myOprationImpl.doOperation();
//		myOprationImpl.save();
//		myOprationImpl.delete();
//		myOprationImpl.findAll();

		final Save save1 = myOpration;
		save1.save();

		final Save save = myOprationImpl;
		save.save();

		final Delete delete = myOprationImpl;
		delete.delete();

		final FindAll findall = myOprationImpl;
		findall.findAll();

	}

}
