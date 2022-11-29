package com.Java.Basics;
import java.util.Random;
public class Attendence 
{
	 public static void main(String[] args) 
	  {
		    Random random = new Random();
			int empCheck = random.nextInt(3);
			
			/*
			 * Using Switch-Case to get the Attendence of Every Employee
			 */
			switch(empCheck)
			{
			case 0: System.out.println("Employee is Absent.");
			        break;
			case 1: System.out.println("Employee is Present.");
			        break;
			case 2: System.out.println("Present for Half Day");
			}
	   }
}
