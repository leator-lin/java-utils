package com.lea.log4jUtils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jVersionSecondUtil {
	public static void main(String[] args) {
		Logger logger = LogManager.getLogger(Log4jVersionSecondUtil.class);
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
