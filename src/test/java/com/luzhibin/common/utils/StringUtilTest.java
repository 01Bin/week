package com.luzhibin.common.utils;

import org.junit.Test;

public class StringUtilTest {
	//判断源字符串是否有值，空引号
	@Test
	public void testHasLength() {
		System.out.println(StringUtil.hasLength(""));
	}

	//判断源字符串是否有值，空引号(空白字符串)和空格也算没值
	@Test
	public void testHasText() {
		System.out.println(StringUtil.hasText("1"));
	}

}
