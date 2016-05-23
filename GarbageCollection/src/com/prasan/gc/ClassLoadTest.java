package com.prasan.gc;

public class ClassLoadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("INvoking the main method ClassLoad Test");
		P p1;
		System.out.println("Going to access class P.i");
		System.out.println(P.i);

	}
	static{
		System.out.println("main class is loaded");
	}

}
class P{
	static int i = 10;
	static{
		System.out.println("static block of P");
	}
}
