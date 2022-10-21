package com.CapgeminiJavaClassesAndObject;

class CarSetup

{
	 private String doors ;
	 private String driver;
	 private String engine;
    private int speed;
    public void setDoors(String doors)
    {
    	this.doors = doors;
    }
    public String getdoors()
    {
    	return doors;
    }
public void setSpeed(int speed)
{
	this.speed=speed;
}
public int getspeed()
{
	return speed;
}
}
public class JavaCarSetting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSetup carsetup =new CarSetup ();
		carsetup.setDoors("closed");
		carsetup.setSpeed(20);
		System.out.println(carsetup.getspeed());
		System.out.println(carsetup.getdoors());
		
		

	}

}
