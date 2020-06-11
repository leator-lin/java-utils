package com.lea.lockAndCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService1 {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();

	public void await() {
		try {
			lock.lock();
			System.out.println("A");
			// 等待
			condition.await();
			System.out.println("B");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("await释放锁");
		}
	}
	
	public void signal() {
		try {
			lock.lock();
			System.out.println("通知");
			condition.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("signal释放锁");
		}
	}
	
	public static void main(String[] args) {
		final MyService1 ms = new MyService1();
		
		Thread threadA = new Thread() {
			public void run() {
				ms.await();
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				ms.signal();
			}
		};
		
		threadA.start();
		threadB.start();
	}
}