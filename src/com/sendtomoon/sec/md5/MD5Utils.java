package com.sendtomoon.sec.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {

	public static byte[] encodeMD5ForJDK(String plaintext) throws NoSuchAlgorithmException {
			MessageDigest md = MessageDigest.getInstance(plaintext);
			byte[] b = md.digest();
			return b;
	}
	
	
	
	public static void main(String[] args) {
		try {
			encodeMD5ForJDK("md5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
