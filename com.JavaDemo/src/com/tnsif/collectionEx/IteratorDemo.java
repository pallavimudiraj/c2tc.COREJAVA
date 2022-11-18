package com.tnsif.collectionEx;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorDemo {
	
	void display(LinkedList<String> list)// here we have make a method to display // and also here we have created the object. //This parameter is of this type 
	{
		Iterator<String> it=list.iterator();
		while(it.hasNext())
		{
			System.out.println("Player name is:"+it.next());
		}

		}

	public static void main(String[] args) {
 
		LinkedList<String> player=new LinkedList<String>();
		
		player.add("Dhoni");
		player.add("Virat");
		player.add("Rohit");
		player.add("Yuvraj");
		player.add("Surya");
		
		System.out.println(player);
		
		IteratorDemo im=new IteratorDemo()	;      // to access each element in the list we make use of iterator 
		im.display(player);
      

		
		



		
	}

}
