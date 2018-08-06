package com.sendtomoon.sec.test;

import org.junit.Test;

import com.sendtomoon.sec.Base64.Base64Utils;

public class Base64Test {

	@Test
	public void test1() throws Exception{
		System.err.println(Base64Utils.encode("Base64 test"));
	}
	
}
