package com.luzhibin.common.utils;

public class StringUtil {
	//判断源字符串是否有值，空引号
	public static boolean hasLength(String src) {
		return null != src && src.length() > 0;
	}
	
	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	public static boolean hasText(String src) {
		return null != src && src.trim().length() > 0;
	}
	
}
