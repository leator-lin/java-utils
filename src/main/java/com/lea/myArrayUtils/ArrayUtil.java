package com.lea.myArrayUtils;

import com.lea.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayUtil {
	public static void main(String[] args) {
		Person person1 = new Person(1, "林银城", "男");
		Person person2 = new Person(2, "漩涡鸣人", "男");
		Person person3 = new Person(3, "蒙奇D路飞", "男");
		List<Person> oldList = new ArrayList<>();
		oldList.add(person1);
		oldList.add(person2);
		oldList.add(person3);

		Person person4 = new Person(4, "林银城1", "男");
		Person person5 = new Person(5, "漩涡鸣人1", "男");
		Person person6 = new Person(6, "蒙奇D路飞1", "男");
		List<Person> newList = new ArrayList<>();
		newList.add(person4);
		newList.add(person5);
		newList.add(person6);

		Map<Integer, Integer> map = oldList.stream().collect(Collectors.toMap(r -> r.getId(), r -> newList.get(oldList.indexOf(r)).getId()));
		System.out.println(map);


//		String[] str = new String[] { "yang", "hao" };
//		List list = Arrays.asList(str);
//		str[0] = "changed";
//		System.out.println(list);

		/*
		System.out.println("-------------" + arrayList.isEmpty());

		String[] test = new String[0];
		String[] test1 = arrayList.toArray(test);
		System.out.println(test1);

		List tmp = arrayList.subList(0, 10);
		System.out.println("----------" + tmp);

		Iterator<String> iterator = arrayList.iterator();		
		while(iterator.hasNext()) {
			String element = iterator.next();
			System.out.println(element);
		}
		
		System.out.println("使用for each循环遍历集合");
		
		//jdk5以后，可以使用for each循环遍历集合
		for(String str : arrayList) {
			System.out.println(str);
		}*/
	}

	/**
	 * 将一个list均分成n个list,主要通过偏移量来实现的
	 * @param source
	 * @return
	 */
	public static <T> List<List<T>> averageAssign(List<T> source,int n){
		List<List<T>> result=new ArrayList<List<T>>();
		int remaider=source.size()%n;  //(先计算出余数)
		int number=source.size()/n;  //然后是商
		int offset=0;//偏移量
		for(int i=0;i<n;i++){
			List<T> value=null;
			if(remaider>0){
				value=source.subList(i*number+offset, (i+1)*number+offset+1);
				remaider--;
				offset++;
			}else{
				value=source.subList(i*number+offset, (i+1)*number+offset);
			}
			result.add(value);
		}
		return result;
	}
}
