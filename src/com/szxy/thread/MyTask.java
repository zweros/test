package com.szxy.thread;

import java.util.concurrent.Callable;
/**
 * 实现多线程的第三种方式   实现 Callback 接口
 * JDK 需要在 Java 1.5 之后
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
