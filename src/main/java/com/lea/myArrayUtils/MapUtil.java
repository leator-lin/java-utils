package com.lea.myArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
	public static Map getParams(int message,String opinion,String result,String status){
        Map<String, Object> variables = new HashMap<>();
        variables.put("message", message);
        variables.put("opinion", opinion);
        variables.put("result", result);
        variables.put("status",status);
        variables.put(null,null);
        if(!variables.isEmpty()) {
            return variables;
        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getParams(1, "哈哈哈", "嘿嘿嘿", "啦啦啦"));
    }

	public void takeParams(Map<String,Object> variables){
        System.out.println(variables);
    }
}
