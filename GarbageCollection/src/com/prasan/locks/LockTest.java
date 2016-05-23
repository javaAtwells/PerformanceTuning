package com.prasan.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;

class DepositThread extends Thread {
	private Account account;
	private Lock lock;

	public DepositThread(Account account, Lock lock) {
		super();
		this.account = account;
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock();
		account.deposit();
		lock.unlock();
	}

}

class WithdrawThread extends Thread {
	private Account account;
	private Lock lock;

	public WithdrawThread(Account account, Lock lock) {
		super();
		this.account = account;
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock();
		account.withdraw();
		lock.unlock();
	}

}

class RetrieveBalanceThread extends Thread {
	private Account account;
	private Lock lock;

	public RetrieveBalanceThread(Account account, Lock lock) {
		super();
		this.account = account;
		this.lock = lock;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		lock.lock();
		account.findBalance();
		lock.unlock();
	}

}

public class LockTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account();
		ReadWriteLock lock = new ReentrantReadWriteLock();

		WithdrawThread wt1 = new WithdrawThread(account, lock.writeLock());
		WithdrawThread wt2 = new WithdrawThread(account, lock.writeLock());
		wt1.setName("WithdrawThread1");
		wt2.setName("WithdrawThread2");
		DepositThread dep1 = new DepositThread(account, lock.writeLock());
		DepositThread dep2 = new DepositThread(account, lock.writeLock());

		dep1.setName("DepositThread1");
		dep2.setName("DepositThread2");

		RetrieveBalanceThread rt1 = new RetrieveBalanceThread(account,
				lock.readLock());
		RetrieveBalanceThread rt2 = new RetrieveBalanceThread(account,
				lock.readLock());
		RetrieveBalanceThread rt3 = new RetrieveBalanceThread(account,
				lock.readLock());
		RetrieveBalanceThread rt4 = new RetrieveBalanceThread(account,
				lock.readLock());

		rt1.setName("RetrieveThread1");
		rt2.setName("RetrieveThread2");
		rt3.setName("RetrieveThread3");
		rt4.setName("RetrieveThread4");

		wt1.start();
		wt2.start();

		dep1.start();
		dep2.start();

		rt1.start();
		rt2.start();
		rt3.start();
		rt4.start();
	}

}