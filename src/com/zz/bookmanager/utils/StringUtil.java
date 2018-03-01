package com.zz.bookmanager.utils;

public class StringUtil {
	public static boolean isEmpty(String str) {
		if(null == str || "".equals(str.trim())) {
			return true;
		}
		return false;
	}
}
