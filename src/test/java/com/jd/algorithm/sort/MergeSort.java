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

public class MergeSort {

	/**
	 * πÈ≤¢≈≈–Ú
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void mergeSort() {
		int[] arr = ArrayUtils.getRandomIntArray(10);
		System.out.println("before:" + Arrays.toString(arr));
		mergeSort(arr);
		System.out.println("after:" + Arrays.toString(arr));
	}

	private void mergeSort(int[] arr) {
		if (arr == null) {
			return;
		}
		mergeSort(arr, 0, arr.length - 1);
	}

	private void mergeSort(int[] arr, int left, int right) {
		int mid = (left + right) / 2;
		if (left < right) {
			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);
			merge(arr, left, mid, right);
		}

	}

	private void merge(int[] arr, int left, int mid, int right) {
		int[] tmpArr = new int[right - left + 1];
		int i = left;
		int j = mid + 1;
		int k = 0;
		while (i <= mid && j <= right) {
			if (arr[i] < arr[j]) {
				tmpArr[k++] = arr[i++];
			} else {
				tmpArr[k++] = arr[j++];
			}
		}

		while (i <= mid) {
			tmpArr[k++] = arr[i++];
		}

		while (j <= right) {
			tmpArr[k++] = arr[j++];
		}

		// øΩ±¥ªÿ»•
		for (int k2 = 0; k2 < tmpArr.length; k2++) {
			arr[left++] = tmpArr[k2];
		}

	}
}
