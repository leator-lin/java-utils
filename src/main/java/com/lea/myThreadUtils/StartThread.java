package com.lea.myThreadUtils;

public class StartThread extends Thread {
	private int i;
	
	public void run() {
		for(; i < 100; i++) {
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		StartThread sd = new StartThread();
		for(int i = 0; i < 300; i++) {
			System.out.println(Thread.currentThread().getName());
			
			if(i == 20) {
				sd.start();
				System.out.println(sd.isAlive());
			}
			
			if(i > 20 && !sd.isAlive()) {
				sd.start();
			}
		}
	}
}
