package org.eolang.j2eo;

public class SimpleFinalMethod {

	public static void main(String[] args) {
		InnerClass obj = new InnerClass();
		obj.method();
		System.out.println("passed");
	}

	class InnerClass {

		final void method () {}

	}
}
