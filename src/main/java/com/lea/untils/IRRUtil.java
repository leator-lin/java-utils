package com.lea.untils;

/**
 * 实现计算IRR内部收益率
 * 参数：double数组
 * @author c1053
 *
 */
public class IRRUtil {
	public static double irr(double[] income) {
		return irr(income, 0.1D);
	}

	public static double irr(double[] values, double guess) {
		int maxIterationCount = 20;
		double absoluteAccuracy = 1.0E-007D;

		double x0 = guess;

		int i = 0;
		while (i < maxIterationCount) {
			double fValue = 0.0D;
			double fDerivative = 0.0D;
			for (int k = 0; k < values.length; k++) {
				fValue += values[k] / Math.pow(1.0D + x0, k);
				fDerivative += -k * values[k] / Math.pow(1.0D + x0, k + 1);
			}
			double x1 = x0 - fValue / fDerivative;
			if (Math.abs(x1 - x0) <= absoluteAccuracy) {
				return x1;
			}
			x0 = x1;
			i++;
		}
		return (0.0D / 0.0D);
	}
	
	public static void main(String[] args) {
		double[] array = new double[]{-1650000,0,416293.7507,416293.7507,416293.7507,416293.7507,416293.7507,416293.7507,416293.7507,416293.7507,416293.7507,498793.7507
};
		System.out.println(irr(array));
	}
}
