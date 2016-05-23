package com.prasan.references;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X x = new X(20);
		WeakReference<X> wr = new WeakReference<X>(x);
		
		if(wr.get() != null){
			System.out.println("Object is available" + wr.get());
		}
		x=null;
		for(int i =0;i<20;i++){
			System.gc();
		}
		if(wr.get() != null){
			System.out.println("Object is available" + wr.get());
		}else{
			System.out.println("Object is not available");
		}
		
	}

}
class X{
	private int i;
	public X(int i){
		super();
		this.i = i;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "X[i = " + i + "]";
	}
}
