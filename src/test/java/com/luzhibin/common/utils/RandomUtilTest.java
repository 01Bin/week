package com.luzhibin.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandomNum() {
		int str = RandomUtil.randomNum(10, 20);
			System.out.println(str);
	}
	
	@Test
	public void random2() {
			System.out.println(RandomUtil.random2(10, 40, 5));
	}
	
	@Test
	public void testrandomCharacter() {
		System.out.println(RandomUtil.randomCharacter());
	}
	
	@Test
	public void testrandomCharacter2() {
		System.out.println(RandomUtil.randomCharacter2(4));
	}

}
