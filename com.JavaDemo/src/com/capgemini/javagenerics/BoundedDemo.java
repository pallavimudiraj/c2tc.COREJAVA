package com.capgemini.javagenerics;
class Data_1<K extends String,V extends String>
{
	private K key;
	private V value;
	public Data_1(K key, V value) {
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	@Override
	public String toString() {
		return "Datas [key=" + key + ", value=" + value + "]";
	}
	
	public <E extends String,N extends Integer>void display(E element,N number)
	{
	System.out.println("Element:"+element+" "+"Number is"+number);
	}

}


public class BoundedDemo {

	public static void main(String[] args) {
		Data_1<String,String> obj=new Data_1<String,String>("Sam","abc");
		//System.out.println("Key is"+obj.getKey()+" Value is "+obj.getValue());
		
		obj.display("Alexa",15);
		

	}

}
