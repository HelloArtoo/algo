/*   
 * Copyright (c) 2010-2020 Founder Ltd. All Rights Reserved.   
 *   
 * This software is the confidential and proprietary information of   
 * Founder. You shall not disclose such Confidential Information   
 * and shall use it only in accordance with the terms of the agreements   
 * you entered into with Founder.   
 *   
 */
package com.jd.algorithm.list;

import org.junit.Test;

import com.jd.algorithm.model.ListNode;
import com.jd.algorithm.utils.ListUtils;

public class Reverse {

	/**
	 * 链表反转
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void reverseList() {
		ListNode head = new ListNode(1);
		ListNode list2 = new ListNode(2);
		head.next = list2;
		ListNode list3 = new ListNode(3);
		list2.next = list3;
		ListNode list4 = new ListNode(4);
		list3.next = list4;
		ListNode list5 = new ListNode(5);
		list4.next = list5;

		// 反转前
		ListUtils.print(head);
		System.out.println("");
		System.out.println("翻转后");
		// 翻转后
		ListUtils.print(reverseList(head));
		System.out.println("");
		// ListUtils.print(reverseList2(head));
	}

	private ListNode reverseList(ListNode head) {

		ListNode pre = null;
		while (head != null) {
			ListNode next = head.next;
			head.next = pre;
			pre = head;
			head = next;
		}

		return pre;
	}

	/**
	 * 递归
	 * 
	 * @param head
	 * @return
	 * @author Rong Hu
	 */
	private ListNode reverseList2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode nextNode = head.next;
		ListNode newHead = reverseList(nextNode);
		nextNode.next = head;
		head.next = null;
		return newHead;
	}
}
