package com.szxy.link;

/**
 * ����
 * @author zwer
 *
 */
public class Test {
	public static void main(String[] args) {
		// �������� 1 
		ListNode l1 = new ListNode(0);
		ListNode node = new ListNode(3);
		ListNode node2 = new ListNode(7);
		ListNode node3 = new ListNode(19);
		l1.next = node;
		node.next = node2;
		node2.next = node3;
		// �������� 2
		ListNode l2 = new ListNode(4);
		ListNode lnode = new ListNode(6);
		ListNode lnode2 = new ListNode(12);
		ListNode lnode3 = new ListNode(14);
		l2.next = lnode;
		lnode.next = lnode2;
		lnode2.next = lnode3;
		
		//===============================================
		// ���Ժϲ�������������
		//===============================================
		/*ListNode head = Solution.mergeTwoLists(l1, l2);
		while(head != null){
			System.out.println("val:"+head.val);
			head = head.next; 
		}*/
		//===============================================
		// ���Ե������ת��
		//===============================================
		ListNode head = Solution.reverseList(l1);
		while(head != null){
			System.out.print(head.val+"\t");
			head = head.next;
		}
		
		
		
		
	}
}
