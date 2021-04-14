package com.lea.myArrayUtils;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.bean.copier.CopyOptions;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class BeanUtilTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setNumber("1");
        user1.setName(null);
        user1.setSex(0);
        user1.setAge(0);

        User user2 = new User();
        user2.setNumber("2");
        user2.setName("林银城");
        user2.setSex(10);
        user2.setAge(10);
        BeanUtil.copyProperties(user1, user2, true, CopyOptions.create().setIgnoreNullValue(true).setIgnoreError(true));
        System.out.println(user2);
    }

    /**
     * BeanMerge，对象属性合并(比beanCopy好用)
     * @Author zhengkai.blog.csdn.net
     */
    public static <M> void merge(M target, M destination) throws Exception {
        //获取目标bean
        BeanInfo beanInfo = Introspector.getBeanInfo(target.getClass());
        // 遍历所有属性
        for (PropertyDescriptor descriptor : beanInfo.getPropertyDescriptors()) {
            // 如果是可写属性
            if (descriptor.getWriteMethod() != null) {
                Object defaultValue = descriptor.getReadMethod().invoke(destination);
                //可以使用StringUtil.isNotEmpty(defaultValue)来判断
                if(defaultValue!=null && !"".equals(defaultValue)){
                    //用非空的defaultValue值覆盖到target去
                    descriptor.getWriteMethod().invoke(target, defaultValue);
                }
            }
        }
    }
}
