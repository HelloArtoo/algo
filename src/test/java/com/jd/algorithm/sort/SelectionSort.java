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

public class SelectionSort {

	/**
	 * —°‘Ò≈≈–Ú
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void selectionSort() {
		int[] arr = ArrayUtils.getRandomIntArray(10);
		System.out.println("before:" + Arrays.toString(arr));
		selectionSort(arr);
		System.out.println("after:" + Arrays.toString(arr));
	}

	private void selectionSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[min] > arr[j]) {
					min = j;
				}
			}

			if (i != min) {
				int tmp = arr[i];
				arr[i] = arr[min];
				arr[min] = tmp;
			}

		}

	}
}
