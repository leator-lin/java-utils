package com.lea.myJVMUtil;

import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

public class MyAgent {
	public static void premain(String args, Instrumentation instrumentation) {
		ClassFileTransformer transformer = new MyTransformer();
		instrumentation.addTransformer(transformer);
	}
}
