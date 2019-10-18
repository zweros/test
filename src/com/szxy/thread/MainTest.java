package com.szxy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
/**
 *线程同步的方式
 * synchronized  同步方法、同步代码块
 * Lock 
 *
 */
public class MainTest {
	
	@Test 
	public void addMoneyTest(){
		Account account = new Account();
		ExecutorService service = Executors.newFixedThreadPool(100);
		for (int i = 0	; i < 100; i++) {
			service.execute(new AddMoneyThread(account, 1));
		}
		service.shutdown();
		while(!service.isTerminated()){
			System.out.println("当前账户的余额:"+account.getBalance());
		}
	}
	
}
