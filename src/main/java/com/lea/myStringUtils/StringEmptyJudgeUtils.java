package com.lea.myStringUtils;

import org.apache.commons.lang.StringUtils;

public class StringEmptyJudgeUtils {
    public static void main(String[] args) {
        String testString = "";
        if(StringUtils.isBlank(testString)) {
            System.out.println("这是一个空字符串！");
        }
    }
}
