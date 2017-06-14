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

public class QuickSort {

	/**
	 * øÏ≈≈
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void quickSort() {
		int[] arr = ArrayUtils.getRandomIntArray(10);
		System.out.println("before:" + Arrays.toString(arr));
		quickSort(arr);
		System.out.println("after:" + Arrays.toString(arr));
	}

	public void quickSort(int[] arr) {
		if (arr == null) {
			return;
		}
		quickSort(arr, 0, arr.length - 1);
	}

	private void quickSort(int[] arr, int left, int right) {

		if (left < right) {
			int pivot = parttion(arr, left, right);
			quickSort(arr, left, pivot - 1);
			quickSort(arr, pivot + 1, right);
		}

	}

	private int parttion(int[] arr, int left, int right) {

		int pivot = arr[left];

		while (left < right) {
			while (left < right && arr[right] >= pivot)
				right--;
			arr[left] = arr[right];

			while (left < right && arr[left] <= pivot)
				left++;
			arr[right] = arr[left];
		}

		arr[left] = pivot;

		return left;
	}
}
