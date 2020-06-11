package com.lea.myArrayUtils;

import java.util.HashMap;
import java.util.Map;

public class MapUtil {
	public Map getParams(int message,String opinion,String result,String status){
        Map<String, Object> variables = new HashMap<>();
        variables.put("message", message);
        variables.put("opinion", opinion);
        variables.put("result", result);
        variables.put("status",status);
        return variables;
    }
	
	public void takeParams(Map<String,Object> variables){
        System.out.println(variables);
    }
}
