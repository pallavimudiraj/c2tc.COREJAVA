package com.CapgeminiJavaClassesAndObject;

public class CarAndValues {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Setup setup = new Setup ();
		setup.setDoors("closed");
		setup.setSpeed(20);
		System.out.println(	setup.getspeed());
		System.out.println(setup.run());

		

	}
}
	 class Setup
	{
		private String doors;
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


