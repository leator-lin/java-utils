package com.lea.log4jUtils;

import org.apache.log4j.Logger;

/**
 * log4j1的使用，调用logger.error会在E盘生成日志文件信息，日志文件的配置方法在log4j.properties文件中
 * 
 * @author lea
 *
 */
public class Log4jVersionOneUtil {
	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Log4jVersionOneUtil.class);
		try {
			int i = 1, j = 0;
			System.out.println(i/j);
		} catch(Exception e) {
			logger.debug(e);
			logger.error(e);
			logger.info(e);
		}
	}
}
