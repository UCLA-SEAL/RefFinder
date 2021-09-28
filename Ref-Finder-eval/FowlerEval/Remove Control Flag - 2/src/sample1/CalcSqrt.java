/*
  File: CalcSqrt.java

  Description: To calculate square root

  Student Name: Kittiprapha Jivasantikarn

  Student UT EID: kj6927

  Course Name: CS 303E

  Unique Number:90665

  Date Created:July 7, 2010

  Date Last Modified:

*/
import java.util.*;
public class CalcSqrt 
{
	public static void main (String[]args)
	{
	  double N = 0;
	  boolean error = true;
	  
	  do
	  { System.out.print("Enter a positive number: ");
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("1");
	    
	    if(sc.hasNextDouble())
	    {
	    	double temp = sc.nextDouble();
	    	
	    	if (temp> 0)
	    	{
	    		N = temp;
	    		error = false;
	    	}
	    	else
	    	{
	    		System.out.println("Error! Please try again.");
	    	}
	    }
	    else
	    {
	    	sc.next();
	    	System.out.print("Error! Please try again.");
	    }
	 	  
	  }while(error);
	  double oldGuess;
	  
	  double newGuess = N/2;
	  
	  do
	  {
		  oldGuess = newGuess;
		  newGuess = ((N/oldGuess)+oldGuess)/2;
	  }while(Math.abs(newGuess-oldGuess)>Math.pow(10.0,-6.0));
	  
	  System.out.println("The number you entered is: " +N);
	  System.out.println("Square root of "+  N  + "computed by using this formula is " + newGuess);
	  System.out.println("Real square root of "+  N  + " is " + Math.sqrt(N));
	  double diff = Math.abs(newGuess-Math.sqrt(N));
	  System.out.println("The difference is  " + diff);
	}
}