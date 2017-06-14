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

public class Int2Binary {

	/**
	 * 整数转二进制
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void int2Binary() {
		int n = 50;
		System.out.println(Integer.toBinaryString(50));
		System.out.println(int2Binary(n));
	}

	private String int2Binary(int n) {
		StringBuilder sb = new StringBuilder();
		int tmp = 1 << 31;
		for (int i = 0; i < 31; i++) {
			int t = (n & (tmp >>>= 1)) > 0 ? 1 : 0;
			if (t == 0 && sb.length() == 0) {
				continue;
			}
			sb.append(t);
		}

		return sb.toString();
	}
}
