package com.prasan.threadDump;

public class DeadLockTest {

	public static void main(String[] args) {

		X x1 = new X();
		X y1 = new X();
		// Passing objects
		Thread1 t1 = new Thread1(x1, y1);
		t1.setName("Thread1");
		t1.start();
		//Passing objects in other way
		Thread1 t2 = new Thread1(y1, x1);
		t1.setName("Thread2");
		t2.start();
	}

}

class X {

}

class Thread1 extends Thread {
	private X x1;
	private X y1;

	public Thread1(X x1, X y1) {
		super();
		this.x1 = x1;
		this.y1 = y1;
	}

	@Override
	public void run() {

		synchronized (x1) {
			System.out.println("Thread1 acquired the lock on x1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Thread1 is waiting lock on y1");
			synchronized (y1) {
				System.out.println("Thread1 trying lock on y1");
			}
		}
	}
}
