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

import com.jd.algorithm.model.ListNode;

public class ListUtils {

	public static void print(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			head = head.next;
			if (head != null) {
				System.out.print("->");
			}

		}
	}
}
