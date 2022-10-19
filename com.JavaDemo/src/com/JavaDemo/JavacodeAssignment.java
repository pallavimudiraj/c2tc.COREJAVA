package com.JavaDemo;

public class JavacodeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // Here in this code bsically we are going to print the pattern which is as fallows:
/*		@
		@@
		@@@
		@@@@
		@@@@
		
		*/
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print('@');
			}
			System.out.println();
		}


	}

}
