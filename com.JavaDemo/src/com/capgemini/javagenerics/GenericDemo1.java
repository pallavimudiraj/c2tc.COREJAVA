package com.capgemini.javagenerics;
import java.util.LinkedList;
import java.util.List;

class Test1<T>
{
	
	private T myvariable;

	public Test1(T myvariable) {
		this.myvariable = myvariable;
	}

	public T getMyvariable() {
		return myvariable;
	}

	@Override
	public String toString() {
		return "Test [myvariable=" + myvariable + "]";
	}
	
	}
public class GenericDemo1 {

	public static void main(String[] args) {
List<Test1<Object>> obj=new LinkedList<>();
		
		obj.add(new Test1<Object>("Hello"));
		obj.add(new Test1<Object>("Everyone"));
		obj.add(new Test1<Object>(15));
		obj.add(new Test1<Object>(16.5f));
		obj.add(new Test1<Object>('P'));
		obj.add(new Test1<Object>(12.66));
		
		
		System.out.println(obj);


	}

}
