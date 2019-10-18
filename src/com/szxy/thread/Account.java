package com.szxy.thread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
	private Lock accountLock = new ReentrantLock();
	private double balance;
	
	/**
	 * 存钱
	 * @param money
	 * synchronized
	 */
	public  void deposit(double money){
		this.accountLock.lock();
		double newBalance = this.balance + money;
		try {
			// 模拟存款操作
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = newBalance;
		this.accountLock.unlock();
	}
	
	/**
	 * 获取存款余额
	 * @return
	 */
	public double getBalance(){
		return this.balance;
	}
	
}
