package com.ofss.main;

import com.ofss.domain.MyClass;
import com.ofss.domain.MyInteface;

public class InterfaceMain {
	public static void main(String[] args) {
		// Cannot create objet of interface
		// MyInteface inteface = new MyInteface();

		MyInteface myInteface = new MyClass();
		myInteface.show();

		MyClass myClass = new MyClass();
		myClass.show();
		myClass.display();

	}
}
