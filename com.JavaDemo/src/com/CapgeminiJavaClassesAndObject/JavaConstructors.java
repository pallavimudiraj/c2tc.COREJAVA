package com.CapgeminiJavaClassesAndObject;
 class CarSet
{
	private String doors;
	private int speed;
	public CarSet()
	{ 
		doors="opened";
		speed= 0;
		
		}
	public CarSet (String doors, int speed)
	{
		this.doors =doors;
		this.speed =speed;
	}
	
	public void setDoors(String doors) {
		this.doors = doors;
	}
	public String getDoors() {
		return doors;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSpeed() {
		return speed;
	}
	public String run()
	{
		if(doors.equals("closed")&& speed>0 )
		{
			return  "running";
		}
		else
		{
			return "not running";
		}
	}
	

}

public class JavaConstructors {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			CarSet carset = new CarSet("closed",10);
			System.out.println(carset.run());
	}

}
