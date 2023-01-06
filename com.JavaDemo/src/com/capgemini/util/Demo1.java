package com.capgemini.util;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo1 {

	public static void main(String[] args) {

//	List<Integer> list=List.of(2,4,6,434,5768,565,555);
//	System.out.println(list);
//		
		
		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(35);
		list.add(61);
		list.add(17);
		list.add(190);
		list.add(16);
		list.add(352);
		list.add(618);
		list.add(171);
		list.add(1906);
		
				
		//without Stream API
		
		List<Integer> listEven=new ArrayList<>();
		for(Integer i:list)
		{
			if(i % 2==0)
			{
				listEven.add(i);
			}
		}
		System.out.println("Original List:"+list);
		System.out.println("Processed List:"+listEven);
		
		
		//with Stream API
		
	Stream<Integer>	stream=list.stream();
	//List<Integer> newList=stream.filter(i->i%2==0).collect(Collectors.toList());
	
	List<Integer> NewList=stream.filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(NewList);
	
	
	//one more way
	
	List<Integer> NewList1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
	System.out.println(NewList1);
	
	//Shortest method
	System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
	
	
	//one more condition
	List<Integer> stream3=list.stream().filter(i->i>30).collect(Collectors.toList());
	
//	Stream<Integer> stream2=list.stream();
	stream3.forEach(e->
	{
		System.out.println(e);
	}
	);
	


		
		
		
 	}

}