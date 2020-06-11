package com.lea.myThreadUtils;

import java.util.concurrent.TimeUnit;

public class ThreadJoinUtil {
	public static void main(String[] args) throws InterruptedException {
		Thread t = new Thread(new JoinTest());
		t.start();
		Thread t1 = new Thread(new JoinTest());
		t1.start();
		
		t1.interrupt();
		t.interrupt();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("End.");
	}
	
	static class JoinTest implements Runnable {

		@Override
		public void run() {
			try {
				while (!Thread.currentThread().isInterrupted())
					;
			} catch (Exception e) {
				System.out.println("JoinTest: " + e);
			}finally {
				System.out.println(Thread.currentThread() + " leaving the JoinTest");
			}
		}
	}
}
