package com.daobili.core.utils.base.date;

import java.util.Calendar;
import java.util.Date;

public class DateCalc {
	public static void main(String[] args) {
		try {
			Date prev = DateFormat.date("2018-02-01");
			Date after = DateFormat.date("2017-07-01");
			System.out.println(apartMonth(prev, after));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * 计算相差月数
	 * @param prev
	 * @param after
	 * @return
	 * @throws Exception
	 */
	public static int apartMonth(Date prev,Date after){
		// 将转换的两个时间对象转换成Calendard对象
		Calendar can1 = Calendar.getInstance();
		can1.setTime(prev);
		Calendar can2 = Calendar.getInstance();
		can2.setTime(after);
		// 拿出两个年份
		int year1 = can1.get(Calendar.YEAR);
		int year2 = can2.get(Calendar.YEAR);
		// 天数
		int months = 0;
		Calendar can = null;
		// 如果can1 < can2
		// 减去小的时间在这一年已经过了的月份
		// 加上大的时间已过的天数
		/**
		 * 2016-03-01   2017-05-01
		 */
		if (can1.before(can2)) {
			months -= can1.get(Calendar.MONTH);
			months += can2.get(Calendar.MONTH);
			can = can1;
		} else {
			months -= can2.get(Calendar.MONTH);
			months += can1.get(Calendar.MONTH);
			can = can2;
		}
		for (int i = 0; i < Math.abs(year2 - year1); i++) {
			months +=12;
			// 再计算下一年。
			can.add(Calendar.YEAR, 1);
		}
		return months;
	}
	/**
	 * 计算相差天数
	 * @param prev
	 * @param after
	 * @return
	 * @throws Exception
	 */
	public static int apartDay(Date prev,Date after){
		// 将转换的两个时间对象转换成Calendard对象
		Calendar can1 = Calendar.getInstance();
		can1.setTime(prev);
		Calendar can2 = Calendar.getInstance();
		can2.setTime(after);
		// 拿出两个年份
		int year1 = can1.get(Calendar.YEAR);
		int year2 = can2.get(Calendar.YEAR);
		// 天数
		int days = 0;
		Calendar can = null;
		// 如果can1 < can2
		// 减去小的时间在这一年已经过了的天数
		// 加上大的时间已过的天数
		if (can1.before(can2)) {
			days -= can1.get(Calendar.DAY_OF_YEAR);
			days += can2.get(Calendar.DAY_OF_YEAR);
			can = can1;
		} else {
			days -= can2.get(Calendar.DAY_OF_YEAR);
			days += can1.get(Calendar.DAY_OF_YEAR);
			can = can2;
		}
		for (int i = 0; i < Math.abs(year2 - year1); i++) {
			// 获取小的时间当前年的总天数
			days += can.getActualMaximum(Calendar.DAY_OF_YEAR);
			// 再计算下一年。
			can.add(Calendar.YEAR, 1);
		}
		return days;
	}
	/**
	 * 计算相差分钟
	 * @param prev
	 * @param after
	 * @return
	 */
	public static long apartMinute(long prev,long after){
		long minute = (after - prev) / (1000 * 60);// 转化minute
		return minute;
	}
	public static long apartMinute(Date prev,Date after){
		long minute = (after.getTime() - prev.getTime()) / (1000 * 60);// 转化minute
		return minute;
	}
	/**
	 * 计算相差秒
	 * @param prev
	 * @param after
	 * @return
	 */
	public static long apartSecond(long prev,long after){
		long minute = (after - prev) / (1000);// 转化second
		return minute;
	}
	public static long apartSecond(Date prev,Date after){
		long minute = (after.getTime() - prev.getTime()) / (1000);// 转化second
		return minute;
	}
	/**
	 * 计算相差小时
	 * @param prev
	 * @param after
	 * @return
	 */
	public static long apartHour(long prev,long after){
		long hour = (after - prev) / (1000 * 60*60);// 转化hour
		return hour;
	}
}
