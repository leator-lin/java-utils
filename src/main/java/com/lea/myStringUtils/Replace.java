package com.lea.myStringUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Replace {
    
    public static void main(String[] args) {
        String str = "{f.name} and {f.age}";
        String pattern = "\\{[^}]*\\}";
        
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);
        while (m.find()) {
            String g = m.group();
            String target = g.substring(1, g.length() - 1);//去掉花括号
            str = str.replace(g,target + " <= '2019-09-09'");
        }
        
        System.out.println("str:" + str);
    }
}
