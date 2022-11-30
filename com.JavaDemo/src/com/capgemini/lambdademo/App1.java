package com.capgemini.lambdademo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


	class Data1
	{
		private String name;

		public Data1(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Data1 [name=" + name + "]";
		}
		
		}


public class App1 {
	public static void main(String[] args) {
		List<Data1> list=new ArrayList<>();
		list.add(new Data1("Neha"));
		list.add(new Data1("Somya"));
		list.add(new Data1("Aardhya"));
		list.add(new Data1("vishaka"));
		list.add(new Data1("parmapara"));
		list.add(new Data1("kiara"));

				
		
		Collections.sort(list,(Data1 o1,Data1 o2)->{return o1.getName().compareTo(o2.getName());});
		
					
		
		list.forEach(temp->{System.out.println(temp.getName());});
	}
}
