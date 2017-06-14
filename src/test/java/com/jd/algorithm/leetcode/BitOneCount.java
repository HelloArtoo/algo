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

public class BitOneCount {

	/**
	 * 任意给定一个32位无符号整数n，求n的二进制表示中1的个数，比如n = 5（0101）时，返回2，n = 15（1111）时，返回4
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void bitOneCount() {

		int n = 1;
		System.out.println(getBitOneCount(n));
		System.out.println(getBitOneCount2(n));
	}

	public int getBitOneCount(int n) {
		int count = 0;
		while (n > 0) {
			if ((n & 1) == 1) {
				count++;
			}
			n >>= 1;
		}
		return count;
	}

	/**
	 * 为什么n &= (n – 1)能清除最右边的1呢？因为从二进制的角度讲，n相当于在n - 1的最低位加上1。举个例子，8（1000）=
	 * 7（0111）+ 1（0001），所以8 & 7 = （1000）&（0111）=
	 * 0（0000），清除了8最右边的1（其实就是最高位的1，因为8的二进制中只有一个1）。再比如7（0111）= 6（0110）+
	 * 1（0001），所以7 & 6 = （0111）&（0110）= 6（0110），清除了7的二进制表示中最右边的1（也就是最低位的1）。
	 * 
	 * @param n
	 * @return
	 * @author Rong Hu
	 */
	public int getBitOneCount2(int n) {
		int c = 0;
		for (c = 0; c < n; c++) {
			n &= (n - 1);
		}
		return c;
	}
}
