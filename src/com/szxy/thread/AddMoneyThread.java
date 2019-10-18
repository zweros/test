package com.szxy.thread;

public class AddMoneyThread implements Runnable{
	
	private Account account;
	private double money;
	
	public AddMoneyThread(Account account,double money){
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		// Í¬²½´úÂë¿é
		/*synchronized(this.account){
			this.account.deposit(this.money);
		}*/
		this.account.deposit(this.money);
	}
}
