package com.lea.test;

import java.io.Serializable;

public class Example implements Serializable {
    String str = new String("good");
    char[] ch = {'a', 'b', 'c'};

    public static void main(String[] args) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'g';
    }
}
