package com.Java.Basics;
import java.util.Random;
public class PartTimeWage 
{
	public static void main(String[] args)
	{
	Random random = new Random();
	int empCheck = random.nextInt(3);
	int dailywage;
	int halfDayWage;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partDayHour = 4;
	
	/*
	 * Calculating Part Time Wage for An Employee Who is present only for Half a Day
	 */
	switch(empCheck)
	{
	case 0: System.out.println("Employee is Absent.");
	        System.out.println("Absent Wage Is : Zero(0)/Nil");
	        break;
	        
	case 1: System.out.println("Employee is Present.");
	        dailywage = wagePerHour * fullDayHour;
	        System.out.println("Daily Wage Is : " +dailywage);
	        break;
	        
	case 2: System.out.println("Employee is Half-Day Present");
	        halfDayWage = wagePerHour * partDayHour;
	        System.out.println("Half Day Wage Is : " +halfDayWage);
	        break;
	}
  }
}
