package com;

public class Application {
	public  String cal(int year,int month,int day)
	{
		Calculations cal = new Calculations();
		int val =cal.calDays(year, month, day);
		
		return String.valueOf(val); 
		
	}

}
