package com.daobili.core.utils.base.date;

import java.util.Calendar;
import java.util.Date;

public class DateGet {
	/**
	 * 当前 yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String nowString() {
		return DateFormat.full(System.currentTimeMillis());
	}
	/**
	 * 当前yyyyMMddHHmmss
	 * @return
	 * @throws Exception
	 */
	public static String nowABString(){
		return DateFormat.fullAB(System.currentTimeMillis());
	}

	/**
	 * 当前日期 yyyy-MM-dd
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String nowDateString() {
		return DateFormat.date(System.currentTimeMillis());
	}
	public static Date nowDate() {
		return DateFormat.date(nowDateString());
	}
	
	/**
	 * 当前时间 HH:mm:ss
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String nowTimeString() {
		return DateFormat.time(System.currentTimeMillis());
	}

	/**
	 * 当前星期
	 * 
	 * @return
	 * @throws Exception
	 */
	public static String nowWeek() {
		return DateFormat.week(System.currentTimeMillis());
	}
	
	/**
	 * 获取相距当前日期days天的日期
	 * @param days
	 * @return
	 */
	public static Date apart(int days) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.DATE, days);
		return calendar1.getTime();
	}
	/**
	 * 获取相距date days天的日期
	 * @param date
	 * @param days
	 * @return
	 */
	public static Date apart(Date date,int days) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date);
		calendar1.add(Calendar.DATE, days);
		return calendar1.getTime();
	}
	
	/**
	 * 获取相距当前日期months月的日期
	 * @param months
	 * @return
	 */
	public static Date apartMonth(int months) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.MONTH, months);
		return calendar1.getTime();
	}
	/**
	 * 获取相距date months月的日期
	 * @param date
	 * @param months
	 * @return
	 */
	public static Date apartMonth(Date date,int months) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date);
		calendar1.add(Calendar.MONTH, months);
		return calendar1.getTime();
	}
	
	/**
	 * 获取相距当前日期hours的日期
	 * @param hours
	 * @return
	 */
	public static Date apartHour(int hours) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.HOUR_OF_DAY, hours);
		return calendar1.getTime();
	}
	
	/**
	 * 获取相距date hours的日期
	 * @param date
	 * @param hours
	 * @return
	 */
	public static Date apartHour(Date date,int hours) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date);
		calendar1.add(Calendar.HOUR_OF_DAY, hours);
		return calendar1.getTime();
	}
	
	/**
	 * 获取相距当前日期minutes的日期
	 * @param minutes
	 * @return
	 */
	public static Date apartMinute(int minutes) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.MINUTE, minutes);
		return calendar1.getTime();
	}
	
	/**
	 * 获取相距date minutes的日期
	 * @param date
	 * @param minutes
	 * @return
	 */
	public static Date apartMinute(Date date,int minutes) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date);
		calendar1.add(Calendar.MINUTE, minutes);
		return calendar1.getTime();
	}
	/**
	 * 获取相距当前日期second秒的日期
	 * @param second
	 * @return
	 */
	public static Date apartSecond(int second) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.add(Calendar.SECOND, second);
		return calendar1.getTime();
	}

	/**
	 * 获取相距date second秒的日期
	 * @param date
	 * @param second
	 * @return
	 */
	public static Date apartSecond(Date date,int second) {
		Calendar calendar1 = Calendar.getInstance();
		calendar1.setTime(date);
		calendar1.add(Calendar.MINUTE, second);
		return calendar1.getTime();
	}
	
	
	/**
	 * 获取date的0时0分0秒时刻
	 */
	public static Date startDate(Date date){
		Calendar can1 = Calendar.getInstance();
		can1.setTime(date);
		can1.set(Calendar.HOUR_OF_DAY, 0);
		can1.set(Calendar.MINUTE, 0);
		can1.set(Calendar.SECOND, 0);
		return can1.getTime();
	}
	/**
	 * 获取date的0时0分0秒时刻
	 */
	public static Date endDate(Date date){
		if(date == null) date = new Date();
		Calendar can1 = Calendar.getInstance();
		can1.setTime(date);
		can1.set(Calendar.HOUR_OF_DAY, 23);
		can1.set(Calendar.MINUTE, 59);
		can1.set(Calendar.SECOND, 59);
		return can1.getTime();
	}
}
