package com.lea.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestDemo {

    public static void main(String[] args) {
//        float a = 1.0f - 0.9f;
//        float b = 0.9f - 0.8f;
//        if (a == b) {
//            // 预期进入此代码快，执行其它业务逻辑
//            // 但事实上 a==b 的结果为 false
//            System.out.println("哈哈哈哈哈哈");
//        }
//        Float x = Float.valueOf(a);
//        Float y = Float.valueOf(b);
//        if (x.equals(y)) {
//            // 预期进入此代码快，执行其它业务逻辑
//            // 但事实上 equals 的结果为 false
//            System.out.println("呵呵呵呵呵呵");
//        }

        List<String> list = new ArrayList<>();
        list.add("林银城");
        list.add("林银城1");
        Iterator iterator = list.iterator();
        if(iterator.hasNext()) {
            String test = (String) iterator.next();
            test = "林银城";
        }
        System.out.println(list);
    }
}