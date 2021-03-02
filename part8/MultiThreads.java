package com.rakuten.oops.part8;

import java.util.stream.IntStream;

public class MultiThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Thread starts");
		FileDownloader f=new FileDownloader();
		//System.out.println(Thread.getName());
		Thread t= new Thread(f);
		System.out.println(t.getName());
		t.start();
		t.setPriority(10);
		System.out.println("Main Thread ends");
		IntStream.rangeClosed(1, 10).
		forEach(i-> System.out.println("main :"+i));

	}

}

class FileDownloader implements Runnable{
	public void run() {
		System.out.println("File downloading started");
		IntStream.rangeClosed(1, 10).
		forEach(i-> System.out.println("child :"+i));
	}
}