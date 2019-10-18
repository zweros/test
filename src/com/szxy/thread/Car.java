package com.szxy.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Car implements Runnable{
	private int carNum;
	private CarCompetion carCompetion;
	
	public Car(int CarNum, CarCompetion carCompetion){
		this.carNum = CarNum;
		this.carCompetion = carCompetion;
	}
	
	public Car(){}
	
	@Override
	public void run() {
		synchronized (carCompetion) {
			this.carCompetion.nowCarNum++;
			while(this.carCompetion.nowCarNum < this.carCompetion.totalCarNum){
				try {
					this.carCompetion.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.carCompetion.notifyAll();
		}
		this.startCar();
	}

	private void startCar(){
		System.out.println("Car num:"+this.carNum +" start to run");
		try{
			Thread.sleep(2000);
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("Car num:"+this.carNum +" finished in end");
	}
	
	public static void main(String[] args) {
		CarCompetion competion = new CarCompetion();
		final ExecutorService pool = Executors.newFixedThreadPool(competion.totalCarNum);
		for(int i=0; i < competion.totalCarNum; i++){
			pool.execute(new Car(i, competion));
		}
	}

}
