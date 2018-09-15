package com.mp;

public class Thread1 extends Thread {

	@Override
	public void run() {
		System.out.println("Thread 1 is running"+Thread.currentThread().getName());

	}

}
