package com.szxy.stack;

import java.util.LinkedList;

/**
 * ʹ������ģ��ջ
 *
 */
public class Stack{

	LinkedList<Object> list = new LinkedList<Object>();
	
	/**
	 * ��ջ
	 * @param x
	 */
	public void push(Object x){
		
		synchronized (list) {
			list.push(x);
		}
		
	}
	
	/**
	 * ��ջ
	 * @throws InterruptedException 
	 */
	public synchronized Object pop() throws Exception{
			
		synchronized (list) {
			// ������ʹ�� if ���
//			if(list.size() <= 0){
//				wait();
//			}
			while(list.size() <= 0){
					wait(); // �ȴ�
			}
			return list.removeLast();  
		}
	}
	
	
	// ����
	public static void main(String[] args) {
		
	}
	
}
