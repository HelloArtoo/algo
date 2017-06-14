/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.algorithm.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ArrayUtils {

	public static int[] getRandomIntArray(int len) {
		Random ran = new Random();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = ran.nextInt(20);
		}

		return arr;
	}

	public static int[] getRandomIntArray(int len, int seed) {
		Random ran = new Random();
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = ran.nextInt(seed);
		}

		return arr;
	}

	public static int[] getUnrepeatableRandomIntArray(int len, int seed) {
		if (seed < len) {
			throw new IllegalArgumentException("seed must greater than len");
		}

		Random ran = new Random();
		int[] arr = new int[len];
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < len; i++) {
			int n = ran.nextInt(seed);
			while (s.contains(n)) {
				n = ran.nextInt(seed);
			}

			arr[i] = n;
			s.add(n);
		}

		return arr;
	}
}
