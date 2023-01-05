package com.multithreading;

class Eclipse1 extends Thread{
	
	public void run()
	{
	    for (int i = 0; i < 4; i++) {
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}
}


public class MultiThread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubEclipse
		Eclipse e=new Eclipse();	
	    e.start();
        
	    for (int i = 0; i < 4; i++) {
	System.out.println("Main Thread name is" + Thread.currentThread().getName());
	System.out.println("Main Thread ID is" + Thread.currentThread().getId());

}


	}

}
