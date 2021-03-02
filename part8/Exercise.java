package com.rakuten.oops.part8;


class ConferenceRoom implements Runnable{
	
	boolean availability=true;

	public void run() {
		ConferenceRoomBookingJob();
	}
	
	private synchronized void ConferenceRoomBookingJob()  {
	
		if (availability==true) {
			System.out.println("Room is available and is booked");
		    availability=false;
		}
		else
			System.out.println("Room is unavailable");			
}
}

 

public class Exercise {

	public static void main(String[] args) throws  InterruptedException {
		// TODO Auto-generated method stub
		ConferenceRoom projectmanager1= new ConferenceRoom();

		Thread t1=new Thread(projectmanager1);
		Thread t2=new Thread(projectmanager1);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Room status : "+projectmanager1.availability);
		
	}

}
