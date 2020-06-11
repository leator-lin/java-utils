package com.lea.myThreadUtils;

/**
 * 将一个程序设置成后台程序的做法
 * 
 * @author Administrator
 *
 */
public class DaemonThread extends Thread {
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName() + " " + i);
		}
	}
	
	public static void main(String[] args) {
		DaemonThread t = new DaemonThread();
		//关键语句
		t.setDaemon(true);
		t.start();
		for(int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " " + i);
		}
	}
}
