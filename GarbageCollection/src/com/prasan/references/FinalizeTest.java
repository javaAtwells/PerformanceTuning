package com.prasan.references;

public class FinalizeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 40; i++) {
			Y y = new Y(i);
			try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		for (int i = 0; i <= 40; i++) {
			System.gc();
		}
		throw new OutOfMemoryError();
	}

}

class Y {
	private int i;

	Y(int i) {
		super();
		this.i = i;
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("finalizing the object value " + i);
	}
}
