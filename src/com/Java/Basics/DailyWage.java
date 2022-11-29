package com.Java.Basics;
import java.util.Random;
public class DailyWage 
{
	public static void main(String[] args)
	{
	Random random = new Random();
	int empCheck = random.nextInt(3);
	int dailywage;
	int wagePerHour = 20;
	int fullDayHour = 8;
	
	/*
	 * Calculating Daily Wage for An Employee Who is present Every day
	 */
	switch(empCheck)
	{
	case 0: System.out.println("Employee is Absent.");
	        break;
	        
	case 1: System.out.println("Employee is Present.");
	        dailywage = wagePerHour * fullDayHour;
	        System.out.println("Daily Wage Is : " +dailywage);
	        break;
	        
	case 2: System.out.println("Employee is Half-Day Present");
	        break;
	}
  }
}
