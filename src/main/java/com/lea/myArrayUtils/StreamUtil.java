package com.lea.myArrayUtils;

import com.lea.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 这是一些Stream的工具
 */
public class StreamUtil {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person(1, "小明", "男"));
        personList.add(new Person(2, "小东", "男"));
        personList.add(new Person(3, "小东", "男"));
        personList.add(new Person(4, "小娟", "女"));

        //遍历集合，取出集合元素的name值，重新组成一个集合
//        List<String> nameList = personList.stream().map(r -> r.getName()).collect(Collectors.toList());
        List<String> nameList = personList.stream().map(Person::getName).collect(Collectors.toList());
        //遍历集合，取出集合元素的name值，拼接成一个字符串
        String content = personList.stream().map(Person::getName).collect(Collectors.joining("，"));
        //遍历集合，查出是否匹配
        boolean result = personList.stream().anyMatch(r -> r.getName().equals("小明"));
        boolean result1 = personList.stream().allMatch(r -> r.getName().equals("小明"));
        boolean result2 = personList.stream().noneMatch(r -> r.getName().equals("小明"));

        //遍历集合，判断是否符合条件，接着对符合条件的集合进行操作
        List<Person> personList1 = personList.stream().filter(r -> r.getName().equals("小东")).collect(Collectors.toList());
        personList.stream().filter(r -> r.getName().equals("小东")).forEach(System.out::println);
        personList.stream().filter(r -> r.getName().equals("小东")).collect(Collectors.<Person>toList());
        personList.stream().filter(r -> r.getName().equals("小东")).findFirst();

        //遍历集合，使用name变量作为key，转为map，这里Collectors.toMap的第三个参数表示，如果存在key相同的元素，则取第一个元素的结果
        Map<String, String> resultMap = personList.stream().collect(Collectors.toMap(r -> r.getName(), r -> r.getName() + "是" + r.getSex() + "生", (person1, person2) -> person1));
        System.out.println(resultMap.toString());

        System.out.println(personList1.get(0).getName());
        System.out.println(personList.get(0).getName());
        System.out.println(nameList.toString());
        System.out.println(content);

        List<String> testList = new ArrayList<>();

    }
}
