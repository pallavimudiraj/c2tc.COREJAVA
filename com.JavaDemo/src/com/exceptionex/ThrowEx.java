package com.exceptionex;

public class ThrowEx {
	
	
void validate(int age)
	
	{
			try {
		if (age>16)
		{
			System.out.println("Student is Eligible");
		}
		
		else
		{
			throw new ArithmeticException("Student can not appear for exam");
			//System.out.println("Student is not Eligible");
		}
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
			}
	
	public static void main(String[] args) {

		ThrowEx obj=new ThrowEx();
		obj.validate(10);
		System.out.println("Hello");
		
	}
}

	

