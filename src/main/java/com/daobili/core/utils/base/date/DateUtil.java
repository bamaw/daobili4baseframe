package com.daobili.core.utils.base.date;

import java.util.Date;

class DateUtil {
	public static boolean isDateCls(Object ... objs){
		if(null==objs||objs.length==0) {
			return false;
		}
		for(Object obj:objs){
			if(!(obj instanceof Date||obj instanceof Long)){
				return false;
			}
		}
		return true;
	}
}
