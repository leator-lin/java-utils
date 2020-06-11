package com.lea.test;

import com.lea.domain.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {

    @Test
    public void test4() {
        //初始化spring容器ApplicationContext，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取test实例

        Person person2 = (Person) applicationContext.getBean("person2");
        System.out.println("姓名:" + person2.getName() + ";" + "性别：" + person2.getSex());
    }
}