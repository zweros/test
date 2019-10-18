package com.szxy.stack;

import java.util.LinkedList;

/**
 * 使用链表模拟栈
 *
 */
public class Stack{

	LinkedList<Object> list = new LinkedList<Object>();
	
	/**
	 * 入栈
	 * @param x
	 */
	public void push(Object x){
		
		synchronized (list) {
			list.push(x);
		}
		
	}
	
	/**
	 * 出栈
	 * @throws InterruptedException 
	 */
	public synchronized Object pop() throws Exception{
			
		synchronized (list) {
			// 不建议使用 if 语句
//			if(list.size() <= 0){
//				wait();
//			}
			while(list.size() <= 0){
					wait(); // 等待
			}
			return list.removeLast();  
		}
	}
	
	
	// 测试
	public static void main(String[] args) {
		
	}
	
}
