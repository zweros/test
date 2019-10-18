package com.szxy.link;

/**
 * 测试
 * @author zwer
 *
 */
public class Test {
	public static void main(String[] args) {
		// 有序链表 1 
		ListNode l1 = new ListNode(0);
		ListNode node = new ListNode(3);
		ListNode node2 = new ListNode(7);
		ListNode node3 = new ListNode(19);
		l1.next = node;
		node.next = node2;
		node2.next = node3;
		// 有序链表 2
		ListNode l2 = new ListNode(4);
		ListNode lnode = new ListNode(6);
		ListNode lnode2 = new ListNode(12);
		ListNode lnode3 = new ListNode(14);
		l2.next = lnode;
		lnode.next = lnode2;
		lnode2.next = lnode3;
		
		//===============================================
		// 测试合并两个有序链表
		//===============================================
		/*ListNode head = Solution.mergeTwoLists(l1, l2);
		while(head != null){
			System.out.println("val:"+head.val);
			head = head.next; 
		}*/
		//===============================================
		// 测试单链表的转置
		//===============================================
		ListNode head = Solution.reverseList(l1);
		while(head != null){
			System.out.print(head.val+"\t");
			head = head.next;
		}
		
		
		
		
	}
}
