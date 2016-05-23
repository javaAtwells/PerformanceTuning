package com.prasan.threadDump;

import java.util.concurrent.locks.LockSupport;

public class ThreadParkingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new Thread(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName() + " is going to call park");
				LockSupport.park();
				System.out.println(Thread.currentThread().getName() + " has returned back from parking state");
				
			}
		});
		t1.setName("Test Thread");
		t1.start();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 System.out.println("Main Thread is going to unpark Test Thread");
		 LockSupport.unpark(t1);

	}

}
