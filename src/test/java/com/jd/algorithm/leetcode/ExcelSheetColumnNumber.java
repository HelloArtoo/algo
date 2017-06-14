/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.algorithm.leetcode;

import org.junit.Test;

public class ExcelSheetColumnNumber {

	/**
	 * <pre>
	 * Related to question Excel Sheet Column Title
	 *  
	 *  Given a column title as appear in an Excel sheet, return its corresponding column number.
	 *  
	 *  For example:
	 *  
	 *      A -> 1
	 *      B -> 2
	 *      C -> 3
	 *      ...
	 *      Z -> 26
	 *      AA -> 27
	 *      AB -> 28
	 * </pre>
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void title2Number() {
		String title = "AB";
		System.out.println(title2Number(title));
		System.out.println(title2Number2(title));
	}

	/**
	 * <pre>
	 * Given a positive integer, return its corresponding column title as appear in an Excel sheet.
	 * 
	 * For example:
	 * 
	 *     1 -> A
	 *     2 -> B
	 *     3 -> C
	 *     ...
	 *     26 -> Z
	 *     27 -> AA
	 *     28 -> AB
	 * </pre>
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void number2Title() {
		int number = 27;
		System.out.println(number2Title(number));
		System.out.println(number2Title2(number));
	}

	private String number2Title(int n) {
		
		StringBuilder sb = new StringBuilder();

		while (n > 0) {
			sb.append((char) ('A' + (--n % 26)));
			n /= 26;
		}

		return sb.reverse().toString();
	}

	//ตÝน้
	private String number2Title2(int n) {
		return n <= 0 ? "" : number2Title2(--n / 26) + (char) ('A' + n % 26);
	}

	private int title2Number(String title) {
		int rst = 0;
		int pow = 0;
		for (int i = title.length() - 1; i >= 0; i--) {
			int asc = title.charAt(i) - 64;
			rst += asc * Math.pow(26, pow++);
		}

		return rst;
	}

	private int title2Number2(String s) {

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			result *= 26;
			result += ((s.charAt(i) - 'A') + 1);
		}

		return result;
	}

}
