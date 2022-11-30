package com.capgemini.lambdademo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


	class Data
	{
		private String name;

		public Data(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		@Override
		public String toString() {
			return "Data [name=" + name + "]";
		}
		
		}

	public class App {

		public static void main(String[] args) {
			List<Data> list=new ArrayList<>();
			list.add(new Data("Nayna"));
			list.add(new Data("Raha"));
			list.add(new Data("pallavi"));
			list.add(new Data("pratiksha"));
			list.add(new Data("Rutuja"));
			list.add(new Data("Nehu"));

					
			
			Collections.sort(list,(Data o1,Data o2)->{return o1.getName().compareTo(o2.getName());});
			
			for (Data data:list)
			{
				System.out.println(data.getName());
			}
		}
	}


