package com.szxy.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private Lock accountLock = new ReentrantLock();
	private double balance;
	
	/**
	 * ��Ǯ
	 * @param money
	 * synchronized
	 */
	public  void deposit(double money){
		this.accountLock.lock();
		double newBalance = this.balance + money;
		try {
			// ģ�������
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = newBalance;
		this.accountLock.unlock();
	}
	
	/**
	 * ��ȡ������
	 * @return
	 */
	public double getBalance(){
		return this.balance;
	}
	
}
