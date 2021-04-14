package com.lea.myBeanUtils;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class BeanListCopyUtil {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(1, "林银城"));
        users.add(new User(2, "林鸿城"));

        List<Result> results = new ArrayList<>();
        results = copy(users, Result.class);
        System.out.println(results);
    }

    public static <T> List<T> copy(List<?> list, Class<T> clazz) {
        String oldOb = JSON.toJSONString(list);
        return JSON.parseArray(oldOb, clazz);
    }
}
