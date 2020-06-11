package com.lea.Synchronized;

/**
 * 
 * 该类主要是用来演示使用synchronized同步代码块的
 * 
 * @author lea
 *
 */
public class DrawRun {
	public static void main(String[] args) {
		Account acct = new Account("1234567", 1000);
		new DrawThread("甲", acct, 800).start();
		new DrawThread("乙", acct, 800).start();
	}
}
