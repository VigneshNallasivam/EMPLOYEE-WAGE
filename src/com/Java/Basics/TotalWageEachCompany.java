package com.Java.Basics;

public class TotalWageEachCompany
{
	public static final int isPartTime = 1;
	public static final int isFullTime = 2;

	private final String Company;
	private final int empRatePerHour;
	private final int numberOfWorkingDays;
	private final int maximumHoursPerMonth;
	private int totalEmpWage;

	public TotalWageEachCompany(String Company,int empRatePerHour,int numberOfWorkingDays,int maximumHoursPerMonth)
	{
		this.Company = Company;
		this.empRatePerHour = empRatePerHour;
		this.numberOfWorkingDays = numberOfWorkingDays;
		this.maximumHoursPerMonth = maximumHoursPerMonth;
	}

	public void computeEmpWage()
	{
		int empHrs=0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while(totalEmpHrs <= maximumHoursPerMonth && totalWorkingDays < numberOfWorkingDays)
		{
			totalWorkingDays++;
			int empCheck = (int)Math.floor(Math.random()*10)%3;
			switch(empCheck)
			{
			case isPartTime : empHrs = 4;
			                  break;
			case isFullTime : empHrs = 8;
			                  break;
			default : empHrs = 0;
			}
			totalEmpHrs = totalEmpHrs + empHrs;
			System.out.println("Day No : " +totalWorkingDays + " Emp Hr : " +empHrs);

		}
		totalEmpWage = totalEmpHrs * empRatePerHour;
	}

	public String toString()
	{
		return "Total Employee Wage For Company : " +Company + " is :" +totalEmpWage;
	}

	public static void main(String[] args)
	{
		TotalWageEachCompany dmart = new TotalWageEachCompany("Dmart",20,2,10);
		TotalWageEachCompany reliance = new TotalWageEachCompany("Reliance",10,4,20);
		dmart.computeEmpWage();
		System.out.println(dmart);
		reliance.computeEmpWage();
		System.out.println(reliance);

	}
}
