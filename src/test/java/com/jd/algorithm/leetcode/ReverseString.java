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

public class ReverseString {

	/**
	 * <pre>
	 * Write a function that takes a string as input and returns the string
	 * reversed.
	 * 
	 * Example: Given s = "hello", return "olleh".
	 * </pre>
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void reverseString() {
		String s = "hello";
		System.out.println(reverseString(s));
	}

	private String reverseString(String s) {
		char[] arr = s.toCharArray();

		int i = 0;
		int j = arr.length - 1;
		int mid = (i + j + 1) / 2;
		for (; i < mid; i++) {
			char tmp = arr[i];
			arr[i] = arr[j];
			arr[j] = tmp;
			j--;
		}

		return new String(arr);
	}

}
