package com.exceptionex;

public class Test {
	public static void main (String[] args) {
		// arithmetic exception...
			try {
				int arr[] =new int [7];
				arr[10] =9/0;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Good Evening ");
			
	}

}

