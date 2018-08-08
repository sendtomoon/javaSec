package com.sendtomoon.sec.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

	public static void encodeMD5ForJDK(String plaintext) {
		try {
			MessageDigest md = MessageDigest.getInstance(plaintext);
			byte[] b = md.digest();
			System.err.println(b);
			System.err.println(new String(b));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		encodeMD5ForJDK("md5");
	}
}
