package com.lea.myPerformanceUtil;

public class Test1 {
	public static void main(String[] args) {
		double l;
		long then = System.currentTimeMillis();
		int nLoops = 50;
		for (int i = 0; i < nLoops; i++) {
			l = compute(50);
		}
		long now = System.currentTimeMillis();
		System.out.println("Elapsed time:" + (now - then));
	}

	private static double compute(int n) {
		if (n < 0)
			throw new IllegalArgumentException("Must be > 0");
		if (n == 0)
			return 0d;
		if (n == 1)
			return 1d;
		double d = compute(n - 2) + compute(n - 1);
		if (Double.isInfinite(d))
			throw new ArithmeticException("Overflow");
		return d;
	}
}
