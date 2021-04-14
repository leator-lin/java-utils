package com.lea.myMathUtils;

import java.math.BigDecimal;

public class MyMathUtils {
    public static void main(String[] args) {
        BigDecimal number1 = new BigDecimal(100);
        BigDecimal number2 = new BigDecimal(2);
        System.out.println(number1.divide(number2, 2, BigDecimal.ROUND_HALF_UP)
                .multiply(new BigDecimal(100)).doubleValue());
    }
}
