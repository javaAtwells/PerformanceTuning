package com.prasan.gc;

import java.io.FileOutputStream;

public class PolicyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setSecurityManager(new SecurityManager());
		System.setProperty("java.security.policy", "C:\temp\file.policy");
		try{
			FileOutputStream fos = new FileOutputStream("C:/temp/test.txt");
			fos.write("test".getBytes());
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
