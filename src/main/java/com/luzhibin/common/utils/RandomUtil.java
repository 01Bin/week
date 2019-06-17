package com.luzhibin.common.utils;

import java.util.HashSet;
import java.util.Set;

public class RandomUtil {
	//获取一个随机数字
	public static int randomNum(int min, int max) {
		int str = (Math.abs(max - min + 1) + min); 
		
		return str;
	}
	
	//获取随机数组
	public static Set random2(int min, int max, int subs) {
		Set<Integer> set = new HashSet<Integer>();
		int str;
		
		while(set.size() != subs) {
			str = Math.abs(max - min + 1) + min;
			
			set.add(str);
		}
		return set;
	}
	
	//随即获取一个1-Z之间的字符
	public static String randomCharacter () {
		String str = "123456789qwertyuiopasdfghjklzxcvbnm";
		
		Integer index = randomNum(0, str.length() - 1);
		
		return str.charAt(index) + "";
	}
	
	public static String randomCharacter2 (int lenght) {
		String str = "123456789qwertyuiopasdfghjklzxcvbnm";
		String he = "";
		
		for(int i = 1; i <= lenght; i++) {
			Integer index = randomNum(0, str.length() - 1);
			
			he += index;
		}
		
		return he;
	}
		
}
		

