package com.lea.myIOUtils.mySerializableUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MySerializableUtil {
	/*public static void main(String[] args) {
		try {
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("object.txt"));
			Person person = new Person("孙悟空", 500);
			objectOutputStream.writeObject(person);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}*/
	
	public static void main(String[] args) {
		try {
			ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("object.txt"));
			Person person = (Person) objectInputStream.readObject();
			System.out.println(person.getName() + "......" + person.getAge());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
