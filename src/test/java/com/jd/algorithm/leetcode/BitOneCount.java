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
	 * �������һ��32λ�޷�������n����n�Ķ����Ʊ�ʾ��1�ĸ���������n = 5��0101��ʱ������2��n = 15��1111��ʱ������4
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
	 * Ϊʲôn &= (n �C 1)��������ұߵ�1�أ���Ϊ�Ӷ����ƵĽǶȽ���n�൱����n - 1�����λ����1���ٸ����ӣ�8��1000��=
	 * 7��0111��+ 1��0001��������8 & 7 = ��1000��&��0111��=
	 * 0��0000���������8���ұߵ�1����ʵ�������λ��1����Ϊ8�Ķ�������ֻ��һ��1�����ٱ���7��0111��= 6��0110��+
	 * 1��0001��������7 & 6 = ��0111��&��0110��= 6��0110���������7�Ķ����Ʊ�ʾ�����ұߵ�1��Ҳ�������λ��1����
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
