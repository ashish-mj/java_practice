package com.rakuten.oops.part8;

public class Bank implements Runnable {
private float bankBalance=3000;
	public void run() {
			debit(2000);
	}
	private  void debit(float debitAmt) {
		Thread t=Thread.currentThread();
		System.out.println(t.getName()+" try to debit");
		if(debitAmt<=bankBalance) {
			System.out.println(t.getName()+" ready to debit");
			bankBalance=bankBalance-debitAmt;
			System.out.println(t.getName()+" successfully debited");
		}
		else {
			System.out.println(t.getName()+" Transaction failed due to insufficient funds");
		}
	}
public float getBalance() {
	return bankBalance;
}
}
		


