package com.prasan.references;

import java.util.Map;
import java.util.WeakHashMap;

public class weakHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("A");
		// Map<String,Object> map = new WeakHashMap<>();   // References are not GCed
		Map<String,Object> map = new WeakHashMap<>();  // Reference are GCed
		map.put(s, new Object());
		
		new CheckSizeThread(map).start();
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		s = null;
		for ( int i=0;i<=20;i++){
			System.gc();
		}

	}

}
class CheckSizeThread extends Thread
{
	 private Map<String,Object> map;
	 
	 public CheckSizeThread(Map<String,Object> map){
		 super();
		 this.map = map;
	 }
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		 for ( int i=0;i<=20;i++){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Size of Map :" + map.size());
	}
	 }
}