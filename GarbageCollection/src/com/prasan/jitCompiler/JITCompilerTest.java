package com.prasan.jitCompiler;

public class JITCompilerTest {

	public static void main(String[] args) {
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i=1;i<=500;i++){
			test();
		}
		
	}
	private static void test(){
		
		try {
			Thread.sleep(2000);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
