package com.prasan.gc;

public class GCTest1 {

	public static void main(String[] args) {
		X x1 = new X(10);
		X x2 = x1;
		x1 = null;
		
		X x3 = x2;
		x2 = new X(30);
		x3 = x1 ;
		x3 = new X(20);
		for(int i=0;i<=20;i++){
		System.gc(); // suggest GC
		}
	}

}

class X{

	private int i;
	public X(int i) {
		super();
		this.i = i;
	}
	 @Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("garbage collecting the object value " + i);
	}
	
}