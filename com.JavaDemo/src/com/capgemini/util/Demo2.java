package com.capgemini.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo2 {

	public static void main(String[] args) {
		
		
    String country []= {"India","USA","UK","Russia","Japan","France"};

	Stream<String> newCountry=Stream.of(country);
	
	newCountry.forEach(e->
	{
		System.out.println(e);
	});
	
	
	//filter
	//condition -filter
	List<String> countries=List.of("India","USA","UK","Russia","Japan","France");
    System.out.println("***********");
	
	List<String> filteredList=countries.stream().filter(e->e.startsWith("S")).collect(Collectors.toList());
	System.out.println("Filtered elements are"+filteredList);
	
	
	//map
	//perform operation on bulk data
	
	List<Integer> numbers=List.of(2,3,4,5,6,7,8,9);
	
	List<Integer> newNumbers=numbers.stream().map(i->i*i*i).collect(Collectors.toList());
	System.out.println(newNumbers);
	
	newNumbers.forEach(e->
	{
		System.out.println(e);
	});
	
	//one more method
	//:: operator
	 System.out.println("New method");
	newNumbers.stream().forEach(System.out::println);
	
	
	//sorted
	System.out.println("Sorted Numbers");
	numbers.stream().sorted().forEach(System.out::println);
	
	System.out.println("Sorted names");
	countries.stream().sorted().forEach(System.out::println);
	
	//max
	
	Integer maxinum=numbers.stream().max((x,y)->x.compareTo(y)).get();
	System.out.println("max num is"+maxinum);
	
	//Min
	Integer mininum=numbers.stream().min((x,y)->x.compareTo(y)).get();
	System.out.println("min num is"+mininum);
	
	
}
}
