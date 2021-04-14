package com.lea.myStringUtils;

public class StringSpliceUtil {
    public static void main(String[] args) {
        Long date1 = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < 1000000; i++) {
            stringBuilder.append("我是数字：" + i);
        }
        Long date2 = System.currentTimeMillis();
        System.out.println(stringBuilder.toString());
        System.out.println(date2 - date1);

//        Long date1 = System.currentTimeMillis();
//        String str = "";
//        for(int i = 0; i < 10000; i++) {
//            str = str + "我是数字：" + i;
//        }
//        Long date2 = System.currentTimeMillis();
//        System.out.println(str);
//        System.out.println(date2 - date1);
    }
}
