/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.algorithm.string;

import org.junit.Test;

public class LongestPalindrome {

	/**
	 * <pre>
	 * Given a string which consists of lowercase or uppercase letters, find the length of the longest palindromes that can be built with those letters.
	 * 
	 * This is case sensitive, for example "Aa" is not considered a palindrome here.
	 * 
	 * Note:
	 * Assume the length of given string will not exceed 1,010.
	 * 
	 * Example:
	 * 
	 * Input:
	 * "abccccdd"
	 * 
	 * Output:
	 * 7
	 * 
	 * Explanation:
	 * One longest palindrome that can be built is "dccaccd", whose length is 7.
	 * </pre>
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void longestPalindrome() {
		String s = "abccccdd";
		System.out.println(longestPalindrome(s));
	}

	private int longestPalindrome(String s) {
		// max letter ascii is 122
		int[] arr = new int[123];
		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++;
		}

		int longgest = 0;
		for (int i = 0; i < arr.length; i++) {
			if (((arr[i] >> 1) << 1) == arr[i]) {
				longgest += arr[i];
			} else {
				longgest += (arr[i] - 1);
			}
		}

		return longgest == s.length() ? longgest : longgest + 1;
	}
}
