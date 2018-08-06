package com.sendtomoon.sec.Base64;

import org.apache.commons.codec.binary.Base64;

public class Test1 {

	public void useCodec1(String plaintext) {
		byte[] result = Base64.encodeBase64(plaintext.getBytes());
		System.err.println("The \"" +plaintext+ "\"'s Base64 Code is :" + new String(result));
	}

	public static void main(String[] args) {
		Test1 tt = new Test1();
		tt.useCodec1("棕色的狐狸越过了懒惰的狗");
	}
}
