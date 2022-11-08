package com.array;

public class classTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int	arr[]=new int[5] ;
		
		arr[0]=4;
		arr[1]=6;
		arr[2]=9;
		arr[3]=2;
		arr[4]=8;

//		For loop
		for (int i = 0; i <arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		// Above we have make use of for loop
		
		//For each
		
		for(int i:arr)
		{
			System.out.println(i);

		}
// Here we have make use of for each loop 

	}

}
