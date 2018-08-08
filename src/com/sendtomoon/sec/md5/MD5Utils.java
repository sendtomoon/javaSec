package com.sendtomoon.sec.md5;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {

	public static byte[] encodeMD5ForJDK(String plaintext) throws NoSuchAlgorithmException {
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] b = md.digest(plaintext.getBytes());
		return b;
	}
	
	public static String md5Hex(byte[] bytes) throws NoSuchAlgorithmException {
		return DigestUtils.md5Hex(bytes);
	}
	
	public static byte[] encodeMD5ForCommons(String plaintext) {
		return DigestUtils.md5(plaintext);
	}

	public static void main(String[] args) {
		try {
			System.err.println(encodeMD5ForJDK("md5"));
			System.err.println(md5Hex(encodeMD5ForJDK("md5")));
			System.err.println(encodeMD5ForCommons("md5"));
			System.err.println(md5Hex(encodeMD5ForCommons("md5")));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
}
