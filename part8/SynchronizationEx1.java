package com.rakuten.oops.part8;

public class SynchronizationEx1 {
public static void main(String[] args) throws InterruptedException {
	Bank bank=new Bank();
	
	Thread mobileApp=new Thread(bank);
	Thread atm=new Thread(bank);
	
	mobileApp.start();
	atm.start();
	
	mobileApp.join();
	atm.join();
	System.out.println("Bank balance is "+bank.getBalance());
}
}