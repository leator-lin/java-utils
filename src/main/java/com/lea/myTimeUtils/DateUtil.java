package com.lea.myTimeUtils;

import java.util.Date;

public class DateUtil {
	private Date recStartTime;
	private Date recEndTime;
	private int totalTime;

	public Date getRecStartTime() {
		return recStartTime;
	}

	public void setRecStartTime(Date recStartTime) {
		this.recStartTime = recStartTime;
	}

	public Date getRecEndTime() {
		return recEndTime;
	}

	public void setRecEndTime(Date recEndTime) {
		this.recEndTime = recEndTime;
	}

	public int getTotalTime() {
		return totalTime;
	}

	public void setTotalTime(int totalTime) {
		this.totalTime = totalTime;
	}
	
	public static void main(String[] args) {
		DateUtil dateUtil = new DateUtil();
		dateUtil.setRecStartTime(new Date());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		dateUtil.setRecEndTime(new Date());
		dateUtil.setTotalTime(new Date(dateUtil.getRecEndTime().getTime() - dateUtil.getRecStartTime().getTime()).getSeconds());
		System.out.println(dateUtil.getRecEndTime() + "======" + dateUtil.getRecStartTime() + "=======" + dateUtil.getTotalTime());
	}
}