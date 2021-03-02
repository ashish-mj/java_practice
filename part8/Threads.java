package com.rakuten.oops.part8;

import java.util.stream.IntStream;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=Thread.currentThread();
		System.out.println("Current running thread is "+t.getName());
		t.setName("Parent");
		System.out.println("updated name is "+t.getName());
		System.out.println("Priority : "+t.getPriority());
		//Min Priority - 1 , Normal Priority - 5 , Max Priority - 10
		t.setPriority(10);
		System.out.println("updated priority : "+t.getPriority());
		IntStream.rangeClosed(1, 10).
		forEach(i-> {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
			});
	}
	}


