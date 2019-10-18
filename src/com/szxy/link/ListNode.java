package com.szxy.link;

/**
 * 简易链表
 *
 */
public class ListNode {

	int val; //节点的值
	ListNode next; //节点指向下一个节点

	ListNode(int x) {
		this.val = x;
	}

	
	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}


	public static void main(String[] args) {
		ListNode head = new ListNode(0);
		ListNode node = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(5);
		head.next = node;
		node.next = node2;
		node2.next = node3;
		
		while(head != null){
			System.out.println("val:"+head.val);
			head = head.next;
		}
	}

}
