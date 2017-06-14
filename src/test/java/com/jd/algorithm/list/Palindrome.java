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

import java.util.Stack;

import org.junit.Test;

import com.jd.algorithm.model.ListNode;

public class Palindrome {

	/**
	 * Given a singly linked list, determine if it is a palindrome.
	 * 
	 * @author Rong Hu
	 */
	@Test
	public void isPalindrome() {
		ListNode head = new ListNode(1);
		ListNode list2 = new ListNode(2);
		head.next = list2;
		ListNode list3 = new ListNode(3);
		list2.next = list3;
		ListNode list4 = new ListNode(2);
		list3.next = list4;
		ListNode list5 = new ListNode(1);
		list4.next = list5;
		ListNode list6 = new ListNode(1);
		list5.next = list6;

		System.out.println(isPalindrome(head));
	}

	/**
	 * 龟兔赛跑，反转前面的链表
	 * 
	 * @param head
	 * @return
	 * @author Rong Hu
	 */
	private boolean isPalindrome(ListNode head) {
		if (head != null && head.next != null) {
			ListNode fast = head, slow = head;
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}

			slow = reverseList(slow);
			fast = head;
			while (slow != null) {
				if (slow.val != fast.val) {
					return false;
				}
				slow = slow.next;
				fast = fast.next;
			}
		}

		return true;
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
	 * 龟兔赛跑法 用到了栈
	 * 
	 * @param head
	 * @return
	 * @author Rong Hu
	 */
	private boolean isPalindrome2(ListNode head) {
		if (head != null && head.next != null) {
			ListNode fast = head, slow = head;
			Stack<Integer> s = new Stack<>();
			s.push(head.val);
			while (fast != null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
				if (fast != null) {
					s.push(slow.val);
				}
			}

			while (!s.isEmpty()) {
				int val = s.pop();
				if (val != slow.val) {
					return false;
				}
				slow = slow.next;
			}
		}

		return true;
	}

}
