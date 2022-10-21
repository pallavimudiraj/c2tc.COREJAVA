package com.CapgeminiJavaClassesAndObject;
 class Car
 {
	 private String doors ;
	 private String driver;
	 private String engine;
     private int speed;
public void setSpeed(int speed)
{
	this.speed=speed;
}
public int getspeed()
{
	return speed;
}
 }
public class JavaClassAndObject
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car car =new Car ();
		car.setSpeed(20);
		System.out.println(car.getspeed());
		
		
		
		
	}
}
 

