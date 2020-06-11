package com.lea.myJVMUtil;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.IllegalClassFormatException;
import java.security.ProtectionDomain;

/**
 * https://mp.weixin.qq.com/s/Ht7MR95dY1YlAaXp2WnGaw
 * 
 * LTW：静态代理
 * 
 * @author Lea
 */
public class MyTransformer implements ClassFileTransformer {
	public byte[] transform(ClassLoader paramClassLoader, String paramString, Class<?> paramClass, ProtectionDomain paramProtectionDomain,
			byte[] paramArrayOfByte) throws IllegalClassFormatException {
		System.out.println("此处顺便给大家看一下当前的ClassLoad: " + paramClassLoader.getClass());
		System.out.println("模拟AOP织入所需的功能，打印当前类名: " + paramString);
		return null;
	}
}
