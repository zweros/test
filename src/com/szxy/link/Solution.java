package com.szxy.link;

public class Solution {
	
	/**
	 * 合并两个有序链表
	 * @param l1   有序链表 1 
	 * @param l2  有序链表 2
	 * @return
	 */
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		
		/**
		 * 考虑 l1 和 l2 可能有一个为空的情况
		 */
		if(l1 == null || l2 == null){
			return l1 != null ? l1: l2;
		}                                                                                                                          
		
		ListNode head = l1.val < l2.val ? l1 : l2;
		ListNode other = l1.val >= l2.val ? l1 : l2;
		ListNode prehead = head;
		ListNode preother = other;
		
		while(prehead != null){
			ListNode next = prehead.next;
			if(next != null && next.val > preother.val){
				prehead.next = preother;
				preother = next;
			}
			if(next == null){
				prehead.next = preother;
				break;
			}
			prehead = prehead.next;			
		}
		return head;
	}
	
	/**
	 *   单链表转置----> 使用递归
	 *   分析： 
	 *   	将单链表的指向下一个节点的方向改变，箭头从尾部指向头部方向
	 *   	将原来的头部的 next 设为 null，原来的尾部节点为现在的头部节点。 
	 *   思路：
	 *  	利用递归，从单链表的头部遍历到尾部(next == null)，将原先的尾部作为头部，
	 *   指向下一个节点为原来的上一个节点，并将原来的上一个节点的 next 赋 null，如此循环往复。
	 */
	public static ListNode reverseList(ListNode head){
		if(head == null || head.next == null){ // 递归出口
			return head;
		}
		ListNode prev = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return prev;
	}

	
}
