package com.rakuten.oops.part8;

public class MultiThreads2 {

	public static void main (String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
       Cachedata c= new Cachedata();
       Thread t=new Thread(c);
       Thread t1=new Thread(c);
       t.start();
       //t1.start();
       t.join();
       System.out.println(c.data);
       
       //System.out.println(c.data);
       
       
	}

}

class Cachedata implements Runnable{
	int data=100;
	public void run() {
		int local=2;
		data=data*2;
		System.out.println("Data value is : "+data);
		local=local*2;
		System.out.println("Local value is : "+local);
	}
}