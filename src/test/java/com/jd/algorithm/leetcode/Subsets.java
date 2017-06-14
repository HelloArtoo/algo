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

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Subsets {

	/**
	 * <pre>
	 * 	Given a set of distinct integers, nums, return all possible subsets.
	 * 
	 * 	Note: The solution set must not contain duplicate subsets.
	 * 
	 * 	For example,
	 * 	If nums = [1,2,3], a solution is:
	 * 
	 * 	[
	 * 	  [3],
	 * 	  [1],
	 * 	  [2],
	 * 	  [1,2,3],
	 * 	  [1,3],
	 * 	  [2,3],
	 * 	  [1,2],
	 * 	  []
	 * 	]
	 * </pre>
	 */
	@Test
	public void subSets() {
		int[] nums = { 1, 2, 3 };
		System.out.println(subsets3(nums));
	}

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> rst = new ArrayList<>();
		int len = (1 << nums.length);
		for (int mask = 0; mask < len; mask++) {
			List<Integer> lst = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				if (((1 << i) & mask) != 0) {
					lst.add(nums[i]);
				}
			}
			rst.add(lst);
		}

		return rst;
	}

	/**
	 * 1111每次右移，如果为1则输出
	 * 
	 * @param nums
	 * @return
	 * @author Rong Hu
	 */
	public List<List<Integer>> subsets2(int[] nums) {
		List<List<Integer>> rst = new ArrayList<>();
		int len = 1 << nums.length;
		for (int i = 0; i < len; i++) {
			List<Integer> lst = new ArrayList<>();
			int mask = i;
			for (int j = 0; j < nums.length; j++) {
				if ((mask & 1) != 0) {
					lst.add(nums[j]);
				}
				mask >>= 1;
			}

			rst.add(lst);
		}

		return rst;
	}

	/**
	 * 递归
	 * 
	 * @param nums
	 * @return
	 * @author Rong Hu
	 */
	public List<List<Integer>> subsets3(int[] nums) {
		List<List<Integer>> rst = new ArrayList<>();
		addRecursive(rst, new ArrayList<Integer>(), nums, 0);
		return rst;
	}

	private void addRecursive(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			addRecursive(list, tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
}
