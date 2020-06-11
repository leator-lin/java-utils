package com.lea.myThreadUtils;

public class UseOfThread extends Thread{
	
	private int i;
	
	@Override
	public void run() {
		for(; i < 100; i++) {
			System.out.println(getName() + "-------------------" + i);
		}
	}
	
	public static void main(String[] args) {
		Thread.currentThread().setName("林银城");
		for(int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "-------------------" + i);
			
			if(i == 20) {
				new UseOfThread().start();
				new UseOfThread().start();
				
			}
		}
	}
}
