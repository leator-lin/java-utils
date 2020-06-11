
package com.lea.myThreadUtils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolUtil {
	public static void main(String[] args) {
		/*
		 * public ThreadPoolExecutor(int corePoolSize, int maximumPoolSize,long
		 * 		keepAliveTime, TimeUnit unit, BlockingQueue<Runnable> workQueue,
		 * 		ThreadFactory threadFactory, RejectedExecutionHandler handler)
		 */
		ExecutorService threadPool = Executors.newFixedThreadPool(5);
		for (int i = 0; i < 5; i++) {
			threadPool.submit(() -> {
				System.out.println("current thread name" + Thread.currentThread().getName());
				try {
					Object object = null;
					System.out.print("result## "+object.toString());
				} catch (Exception e) {
					System.out.println("程序出异常啦！！！");
				}
			});
		}
	}
}