package com.prasan.locks;

public class Account {
	public void deposit() {
		System.out.println(Thread.currentThread().getName()
				+ " has started to deposit");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ " has completed depositing");
	}

	public void withdraw() {
		System.out.println(Thread.currentThread().getName()
				+ " has started to withdraw");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ " has completed withdrawing");
	}

	public void findBalance() {
		System.out.println(Thread.currentThread().getName()
				+ " has started to retrieve balance");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()
				+ " has completed retrieving balance");
	}

}
