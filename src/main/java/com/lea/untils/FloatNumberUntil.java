package com.lea.untils;

import java.math.BigDecimal;

public class FloatNumberUntil {
    public static void main(String[] args) {
//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        float diff = 1e-6f;
//        if (Math.abs(a - b) < diff) {
//            System.out.println("true");
//        }

        BigDecimal a = new BigDecimal("1.0");
        BigDecimal b = new BigDecimal("0.9");
        BigDecimal c = new BigDecimal("0.8");
        BigDecimal x = a.subtract(b);
        BigDecimal y = b.subtract(c);
        if (x.equals(y)) {
            System.out.println("true");
        }
    }
}
