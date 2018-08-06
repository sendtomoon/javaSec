package com.sendtomoon.sec.Base64;

import org.apache.commons.codec.binary.Base64;

public class Base64Utils {
	// 字符 编码
	public final static String ENCODING = "utf-8";

	/**
	 * Base64 编码
	 * @param data 待 编码 数据
	 * @return String 编码 数据
	 * @throws Exception
	 */
	public static String encode(String data) throws Exception {
		// 执行 编码
		byte[] b = Base64.encodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

	/**
	 * Base64 安全 编码 
	 * 遵循 RFC 2045 实现
	 * @param data 待 编码 数据 
	 * @return String 编码 数据
	 * @throws Exception
	 */
	public static String encodeSafe(String data) throws Exception {
		// 执行 编码
		byte[] b = Base64.encodeBase64(data.getBytes(ENCODING), true);
		return new String(b, ENCODING);
	}

	/**
	 * Base64 解码
	 * @param data 待解 码 数据
	 * @return String 解码 数据
	 * @throws Exception
	 */
	public static String decode(String data) throws Exception {
		// 执行 解码
		byte[] b = Base64.decodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

}
