package com.Java.Basics;
import java.util.Random;
public class SwitchCaseStatement 
{
	public static void main(String[] args)
	{
	Random random = new Random();
	int empCheck = random.nextInt(2);
	int dailywage;
	int halfDayWage;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partDayHour = 4;
	int days = 100;
	
	/*
	 * Calculating Part Time,Daily & Absent Wage for An Employee With Switch Case	 
	 */
	
	switch(empCheck)
	{
	case 0: System.out.println("Employee is Absent.");
	        System.out.println("Absent Wage Is : - Nil");
	        break;
	        
	case 1: System.out.println("Employee is Present.");
	        dailywage = wagePerHour * fullDayHour;
	        System.out.println("Daily Wage Is : " +dailywage);
	        break;
	        
   default: System.out.println("Employee is Half-Day Present");
	        halfDayWage = wagePerHour * partDayHour;
	        System.out.println("Half Day Wage Is : " +halfDayWage);
	        break;
	}
  }
}
