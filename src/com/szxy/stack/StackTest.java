package com.szxy.stack;

// ≤‚ ‘
public class StackTest {
	public static void main(String[] args) throws Exception {
		final Stack stack = new Stack();
		
		for (int i = 0; i < 3; i++){
			new Thread(new Runnable() {
				public void run() {
					for (int i = 0; i < 100; i++) {
						// System.out.println(Thread.currentThread().getName()+"--"+i);
						stack.push(i);
					}
				}
			}).start();
		}
		
		Thread.sleep(2000);
		
		for (int i = 0; i < 3; i++){
			new Thread(new Runnable() {
				
				public void run() {
					for(int i=0; i < 1000; i++){
						Object obj = null;
						try {
							obj = stack.pop();
							System.out.println(Thread.currentThread().getName()+"--"+obj);
						} catch (Exception e) {
							e.printStackTrace();
						}			
					}
				}
			}).start();			
		}
	}
}
