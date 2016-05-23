package com.prasan.references;

import java.lang.ref.SoftReference;

public class SoftReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		X x1 = new X(30);

		SoftReference<X> sr = new SoftReference<X>(x1);

		if (sr != null) {
			System.out.println(sr.get());
		} else {
			System.out.println("Object is not available");
		}

		x1 = null;

		for (int i = 0; i <= 20; i++) {
			System.gc();
		}
		if (sr != null) {
			System.out.println(sr.get());
		} else {
			System.out.println("Object is not available");
		}

	}

}
