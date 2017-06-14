/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.algorithm.sort;

import java.util.Arrays;

import org.junit.Test;

import com.jd.algorithm.utils.ArrayUtils;

public class BubbleSort {

	/**
	 * √∞≈›≈≈–Ú
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void bubbleSort() {
		int[] arr = ArrayUtils.getRandomIntArray(10);
		System.out.println("before:" + Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("after:" + Arrays.toString(arr));
	}

	private void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j - 1] > arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}
}
