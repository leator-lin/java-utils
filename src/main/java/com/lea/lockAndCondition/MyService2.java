package com.lea.lockAndCondition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyService2 {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();

	public void awaitA() {
		try {
			lock.lock();
			System.out.println("awaitA:开始");
			//等待
			conditionA.await();
			System.out.println("awaitA:结束");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("awaitA释放锁");
		}
	}
	
	public void awaitB() {
		try {
			lock.lock();
			System.out.println("awaitB:开始");
			//等待
			conditionB.await();
			System.out.println("awaitB:结束");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("awaitB释放锁");
		}
	}
	
	public void signalA() {
		try {
			lock.lock();
			System.out.println("signalA通知");
			conditionA.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("signalA释放锁");
		}
	}
	
	public void signalB() {
		try {
			lock.lock();
			System.out.println("signalB通知");
			conditionB.signal();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			lock.unlock();
			System.out.println("signalB释放锁");
		}
	}
	
	public static void main(String[] args) {
		final MyService2 ms = new MyService2();
		
		Thread threadA = new Thread() {
			public void run() {
				ms.awaitA();
			}
		};
		
		Thread threadB = new Thread() {
			public void run() {
				ms.awaitB();
			}
		};
		
		Thread threadAA = new Thread() {
			public void run() {
				ms.signalA();
			}
		};
		
		threadA.start();
		threadB.start();
		threadAA.start();
	}
}