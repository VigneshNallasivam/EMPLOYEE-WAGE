package com.Java.Basics;

import java.util.Random;

public class ClassAndFuctions 
{
	Random random = new Random();
	int empCheck = random.nextInt(2);
	int dailywage;
	int halfDayWage;
	int wagePerHour = 20;
	int fullDayHour = 8;
	int partDayHour = 4;
	int monthlyWage1, monthlyWage2;
	int totalWorkingDays = 20;
	int totalWorkingHours = 0; 
	
	void employeeStatus()
	{
	switch(empCheck)
	{
	case 0: System.out.println("Employee is Absent.");
	        System.out.println("Absent Wage Is : - Nil");
	        System.out.println("Monthly Wage Is : - Nil");
	        System.out.println("Total Working Hours Is : - Nil");
	        break;
	        
	case 1: System.out.println("Employee is Present.");
	        dailywage = wagePerHour * fullDayHour;
	        System.out.println("Daily Wage Is : " +dailywage);
	        monthlyWage1 = totalWorkingDays * dailywage;
	        System.out.println("Monthly Wage Is : " +monthlyWage1);
	        totalWorkingHours = 20 * partDayHour * fullDayHour;
	        System.out.println("Total Working Hours Is : " +totalWorkingHours);
	        break;
	        
   default: System.out.println("Employee is Half-Day Present");
	        halfDayWage = wagePerHour * partDayHour;
	        System.out.println("Half Day Wage Is : " +halfDayWage);
	        monthlyWage2 = totalWorkingDays * halfDayWage;
	        System.out.println("Monthly Wage Is : " +monthlyWage2);
	        totalWorkingHours = 20 * partDayHour * fullDayHour;
	        System.out.println("Total Working Hours Is : " +totalWorkingHours);
	        break;
	}
	}
	
	public static void main(String[] args)
	{
		ClassAndFuctions obj = new ClassAndFuctions();
		obj.employeeStatus();
	}
	

}
