package com.lea.myThreadUtils;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Callable接口主要是把任意方法包装成线程执行体
 * 
 * @author Administrator
 *
 */
public class UseOfCallable {
	public static void main(String[] args) {
		// UseOfCallable uc = new UseOfCallable();
		// 创建一个FutureTask对象，即实现了Runnable接口，又实现了Callable接口
		FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) () -> {
			int i = 0;
			for (; i < 100; i++) {
				System.out.println(Thread.currentThread().getName() + " 的循环变量i的值: " + i);
			}
			return i;
		});
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + " 的循环变量i的值: " + i);
			if (i == 20) {
				new Thread(task, "有返回值的线程").start();
			}
		}
		try {
			System.out.println("子线程的返回值: " + task.get());
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
