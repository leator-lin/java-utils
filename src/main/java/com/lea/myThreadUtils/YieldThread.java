package com.lea.myThreadUtils;

public class YieldThread extends Thread {
	public YieldThread(String name) {
		super(name);
	}
	
	public void run() {
		for(int i = 0; i < 50; i++) {
			System.out.println(getName() + "   " + i);
			
			if(i == 20) {
				Thread.yield();
			}
		}
	}

	public static void main(String[] args) {
		YieldThread yt1 = new YieldThread("高级");
		yt1.setPriority(MAX_PRIORITY);
		yt1.start();
		YieldThread yt2 = new YieldThread("低级");
		yt2.setPriority(MIN_PRIORITY);
		yt2.start();
	}
}
