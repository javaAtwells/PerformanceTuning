package com.prasan.cpuprofile;

import java.util.logging.Level;
import java.util.logging.Logger;

public class CpuProfileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
            try {
                // TODO Auto-generated method stub

                Thread.sleep(5000);
            } catch (InterruptedException ex) {
                Logger.getLogger(CpuProfileTest.class.getName()).log(Level.SEVERE, null, ex);
            }
		method1();
		method2();
	}

	private static void method2() {
		// TODO Auto-generated method stub
		for(int i=1;i<=200;i++){
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			method21();
		}
		
	}

	private static void method21() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void method1() {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++){
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			method11();
		}
	}

	private static void method11() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		method111();
		
	}

	private static void method111() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}