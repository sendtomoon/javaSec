package com.sendtomoon.sec.Base64;

import org.apache.commons.codec.binary.Base64;

/**
 * 
 * @author lbt42 
 * Base64编码/加密过程
 * 1） 将给 定的 字符串 以 字符 为 单位 转换 为 对应 的 字符 编码（ 如 ASCII 码）。 
 * 2） 将 获得 的字符 编码 转换 为 二进制 码。
 * 3） 对 获得 的 二进制 码 做 分组 转换 操作， 每 3 个 8 位 二进制 码 为 一组，转换 为 每 4 个 6 位 二进制 码 为 一组（ 不足 6 位 时 低 位 补 0）。 这是 一个 分组 变化 的 过程， 3 个 8
 *         位 二进制 码 和 4 个 6 位 二进制 码 的 长度 都是 24 位（ 3 × 8 = 4 × 6 = 24）。 
 *  4） 对 获得 的4 个 6 位 二进制 码 补 位， 向 6 位二进制 码 添加 2 位 高位 0， 组成 4 个 8 位 二进制 码。
 *  5） 将 获得 的 4 个 8 位 二进制 码 转换 为 十进制 码。 
 *  6） 将 获得 的 十进制 码 转换 为 Base64 字符 表中 对应 的字符。
 */
public class Base64Utils {
	// 字符 编码
	public final static String ENCODING = "utf-8";

	/**
	 * Base64 编码
	 * 
	 * @param data
	 *            待 编码 数据
	 * @return String 编码 数据
	 * @throws Exception
	 */
	public static String encode(String data) throws Exception {
		// 执行 编码
		byte[] b = Base64.encodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

	/**
	 * Base64 安全 编码 遵循 RFC 2045 实现 RFC 2045标准：Base64编码，每76行，增加一个换行符 \r\n
	 * ，常见场景是SSL/TLS证书内容，即是Base64编码
	 * 
	 * @param data
	 *            待 编码 数据
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
	 * 
	 * @param data
	 *            待解 码 数据
	 * @return String 解码 数据
	 * @throws Exception
	 */
	public static String decode(String data) throws Exception {
		// 执行 解码
		byte[] b = Base64.decodeBase64(data.getBytes(ENCODING));
		return new String(b, ENCODING);
	}

}
