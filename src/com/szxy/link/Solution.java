package com.szxy.link;

public class Solution {
	
	/**
	 * �ϲ�������������
	 * @param l1   �������� 1 
	 * @param l2  �������� 2
	 * @return
	 */
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2){
		
		/**
		 * ���� l1 �� l2 ������һ��Ϊ�յ����
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
	 *   ������ת��----> ʹ�õݹ�
	 *   ������ 
	 *   	���������ָ����һ���ڵ�ķ���ı䣬��ͷ��β��ָ��ͷ������
	 *   	��ԭ����ͷ���� next ��Ϊ null��ԭ����β���ڵ�Ϊ���ڵ�ͷ���ڵ㡣 
	 *   ˼·��
	 *  	���õݹ飬�ӵ������ͷ��������β��(next == null)����ԭ�ȵ�β����Ϊͷ����
	 *   ָ����һ���ڵ�Ϊԭ������һ���ڵ㣬����ԭ������һ���ڵ�� next �� null�����ѭ��������
	 */
	public static ListNode reverseList(ListNode head){
		if(head == null || head.next == null){ // �ݹ����
			return head;
		}
		ListNode prev = reverseList(head.next);
		head.next.next = head;
		head.next = null;
		return prev;
	}

	
}
