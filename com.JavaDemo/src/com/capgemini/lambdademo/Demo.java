package com.capgemini.lambdademo;

interface Lambda
{
	public void demo ();
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Lambda obj = ()->
  {
	  System.out.println("My name is Pallavi Mudiraj.");
	  System.out.println("I am from Akola Batch.");
	  System.out.println("In this we are learning about lambda expression.");
	  
	  
  };
  obj.demo();
	}

}
