package com.lea.myStringUtils;

import java.util.StringJoiner;

public class StringBuilderUtil {
    public static void main(String[] args) {
//        StringBuilder sb = new StringBuilder();
//        IntStream.range(1,10).forEach(i->{
//            sb.append(i+"");
//            if( i < 10){
//                sb.append(",");
//            }
//        });
//        System.out.println(sb.toString());
//
//        StringJoiner sj = new StringJoiner(",");
//        IntStream.range(1,10).forEach(i->sj.add(i+""));
//        System.out.println(sj.toString());

        StringJoiner sj1 = new StringJoiner(":", "[", "]");
        sj1.add("George").add("Sally").add("Fred");
        String desiredString = sj1.toString();

        StringJoiner sj2 = new StringJoiner(":", "{", "}");
        sj2.add("12").add("13").add("14");
        String result = sj2.merge(sj1).toString();
        System.out.println(result);

        /*StringBuilder sb = new StringBuilder();
        sb.append("thisisatest");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("yesmymen");
        sb.append(sb2, 2, sb2.length());
        System.out.println(sb.toString());*/
    }
}
