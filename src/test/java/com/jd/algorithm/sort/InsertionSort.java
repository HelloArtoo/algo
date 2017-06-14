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

public class InsertionSort {

	/**
	 * ≤Â»Î≈≈–Ú
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void insertionSort() {
		int[] arr = ArrayUtils.getRandomIntArray(10);
		System.out.println("before:" + Arrays.toString(arr));
		insertionSort(arr);
		System.out.println("after:" + Arrays.toString(arr));
	}

	private void insertionSort(int[] arr) {

		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > tmp) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[++j] = tmp;
		}

	}

}
