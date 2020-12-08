package com.daobili.core.utils.base.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static final String TIMEZONE="GMT+8";

	public static final String FORMAT="yyyy-MM-dd HH:mm:ss";
	public static final String FORMATCN="yyyy年MM月dd日 HH时mm分ss秒";
	public static final String FORMATAB="yyyyMMddHHmmss";
	
	public static final String FORMAT_DATE="yyyy-MM-dd";
	public static final String FORMAR_DATE_YMD= "yyyyMMdd";
	public static final String FORMATCN_DATE="yyyy年MM月dd日"; 
	
	public static final String FORMAT_TIME="HH:mm:ss";
	public static final String FORMATCN_TIME="HH时mm分ss秒";
	
	public static final String FORMAT_WEEK="EEEE";
	
	public static Date toDate(String text,String format){
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = sdf.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	
	public static String toString(Object date,String format){
		if(DateUtil.isDateCls(date)){
			SimpleDateFormat sdf = new SimpleDateFormat(format);
			return sdf.format(date);
		}
        return "";
	}
	/**
	 * yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String full(Date date){
		return toString(date, FORMAT);
	}
	public static String full(Long timestamp){
		return toString(timestamp, FORMAT);
	}
	public static Date full(String text){
		return toDate(text, FORMAT);
	}
	
	
	/**
	 * yyyy年MM月dd日 HH时mm分ss秒
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String fullCN(Date date){
		return toString(date, FORMATCN);
	}
	public static Date fullCN(String text){
		return toDate(text, FORMATCN);
	}
	/**
	 * yyyyMMddHHmmss
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String fullAB(Date date){
		return toString(date, FORMATAB);
	}
	public static String fullAB(Long timestamp){
		return toString(timestamp, FORMATAB);
	}
	public static Date fullAB(String text){
		return toDate(text, FORMATAB);
	}
	/**
	 * yyyy-MM-dd
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String date(Object date){
		return toString(date,FORMAT_DATE);
	}
	public static Date date(String text){
		return toDate(text, FORMAT_DATE);
	}

	/**
	 * yyyyMMdd
	 */
	public static String dateYMD(Object date){
		return toString(date,FORMAR_DATE_YMD);
	}
	public static Date dateYMD(String text){
		return toDate(text, FORMAR_DATE_YMD);
	}

	/**
	 * yyyy年MM月dd日
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String dateCN(Object date){
		return toString(date,FORMATCN_DATE);
	}
	public static Date dateCN(String text){
		return toDate(text, FORMATCN_DATE);
	}
	
	/**
	 * HH:mm:ss
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String time(Object date){
		return toString(date,FORMAT_DATE);
	}
	/**
	 * HH时mm分ss秒
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String timeCN(Object date){
		return toString(date, FORMATCN_TIME);
	}
	
	/**
	 * 获取星期
	 * @param date
	 * @return
	 * @throws Exception 
	 */
	public static String week(Object date){
		return DateFormat.toString(System.currentTimeMillis(),FORMAT_WEEK);
	}
}
