package com.szxy.thread;

import java.util.concurrent.Callable;
/**
 * ʵ�ֶ��̵߳ĵ����ַ�ʽ   ʵ�� Callback �ӿ�
 * JDK ��Ҫ�� Java 1.5 ֮��
 * @author zwer
 *
 */
public class MyTask implements Callable<Integer>{
	
	private int upperBounds;
	
	public MyTask(int upperBounds){
		this.upperBounds = upperBounds;
	}
	

	@Override
	public Integer call() throws Exception {
		int sum = 0;
		for(int i=0; i < this.upperBounds; i++){
			sum += i;
		}
		return sum;
	}
	
}
