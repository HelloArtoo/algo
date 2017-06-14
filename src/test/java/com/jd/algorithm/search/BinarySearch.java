/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.algorithm.search;

import java.util.Arrays;

import org.junit.Test;

import com.jd.algorithm.utils.ArrayUtils;

public class BinarySearch {

	/**
	 * 二分查找法
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void binarySearch() {
		int[] arr = ArrayUtils.getUnrepeatableRandomIntArray(10, 10);
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		int key = 2;
		System.out.println(binarySearch(arr, key));

		int[] arr2 = { 1, 2, 3, 4, 6, 6, 6, 7, 8, 9, 10, 11, 12 };
		System.out.println(findFirstEqual(arr2, 6));
		System.out.println(findLastEqual(arr2, 6));

	}

	private int binarySearch(int[] arr, int key) {
		if (arr != null) {

			int left = 0;
			int right = arr.length - 1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (arr[mid] > key) {
					right = mid - 1;
				} else if (arr[mid] < key) {
					left = mid + 1;
				} else {
					return mid;
				}
			}

		}

		return -1;
	}

	/**
	 * 　查找第一个相等的元素，也就是说等于查找key值的元素有好多个，返回这些元素最左边的元素下标。
	 * 
	 * @param arr
	 * @param key
	 * @return
	 * @author Rong Hu
	 */
	private int findFirstEqual(int[] arr, int key) {
		if (arr != null) {
			int left = 0;
			int right = arr.length - 1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (arr[mid] >= key) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}

			if (left < arr.length && arr[left] == key) {
				return left;
			}
		}

		return -1;
	}

	/**
	 * 　查找最后一个等于或者小于key的元素，也就是说等于查找key值的元素有好多个，返回这些元素最右边的元素下标；如果没有等于key值的元素，
	 * 则返回小于key的最右边元素下标。
	 * 
	 * @param arr
	 * @param key
	 * @return
	 * @author Rong Hu
	 */
	private int findLastEqual(int[] arr, int key) {
		if (arr != null) {
			int left = 0;
			int right = arr.length - 1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (arr[mid] <= key) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}

			if (right >= 0 && arr[right] == key) {
				return right;
			}
		}

		return -1;
	}
}
