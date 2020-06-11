package com.lea.myThreadUtils;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueUtil {
	public static void main(String[] args) throws Exception {
		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		bq.offer("java");
		bq.offer("java");
		System.out.println(bq.offer("java"));
	}
}
