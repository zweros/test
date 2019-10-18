package com.szxy.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyTaskTest {

	/**
	 * ≤‚ ‘
	 * 
	 * @param args
	 * @throws ExecutionException
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		List<Future<Integer>> list = new ArrayList<>();
		ExecutorService service = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10; i++) {
			list.add(service.submit(new MyTask((int) (Math.random() * 100))));
		}
		Integer sum = 0;
		for (Future<Integer> future : list) {
			while (!future.isDone());
			sum += future.get();
		}
		System.out.println(sum);
	}

}
