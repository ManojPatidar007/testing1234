package com.mp;

public class Testing {

	public static void main(String[] args) {
		Thread1 t=new Thread1();
		t.start();
		System.out.println("before join");
		try {
			Thread.currentThread().join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("after join");
	}

}
