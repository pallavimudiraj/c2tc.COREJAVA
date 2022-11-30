package com.capgemini.javagenerics;
class Data
{
	private float str ;

	public Data(float str) {
		super();
		this.str = str;
	}

	public float getStr() {
		return str;
	}
	
	
}

public class SimpleDemo {

	public static void main(String[] args) {
	
		Data obj = new Data(15.5f);
		float out = obj.getStr();
		System.out.println(out);

	}

}
