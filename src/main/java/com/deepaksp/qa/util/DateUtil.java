package com.deepaksp.qa.util;

import java.util.Calendar;
import java.util.Date;

/**
 * @author Deepak
 *
 */
public class DateUtil {

	public static Date pastWeek() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -7);
		return cal.getTime();
	}

	public static Date pastMonth() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.MONTH, -1);
		return cal.getTime();
	}
}
