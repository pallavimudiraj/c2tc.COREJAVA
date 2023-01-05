package com.multithreading;

class add implements Runnable{
	
	public void run()
	{
	    
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}

public class Multithread3 {
	
	public static void main(String[] args) {
		Eclipse e=new Eclipse();
		Thread t=new Thread(e);
		t.start();
	        
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}
	}
