/*
  File: Day.java

  Description: To compute day

  Student Name: Kittiprapha Jivasantikarn

  Student UT EID: kj6927

  Course Name: CS 303E

  Unique Number: 90665

  Date Created:July 4th, 2010

  Date Last Modified:July 5th, 2010

*/
import java.util.Scanner; 
public class Day 
{ 
	public static void main (String[]args)
	{ 
		int month = 0;
		int b = 0;
		int year =0;
		// To promt user to insert day, month and year
		do
	    {
          System.out.print("Enter day: " );		
		  Scanner sc = new Scanner(System.in);
		  
		  if(sc.hasNextInt())  // To make sure users insert integer
		  {
		    b = sc.nextInt();
		  }
		  else
		  {
			  sc.next();
		  }
		  System.out.print("Enter month: ");
		  sc = new Scanner(System.in);
		  
		  if(sc.hasNextInt()) // To make sure users insert integer
		  {  month = sc.nextInt();
		  }
		  else
		  { 
	         sc.next();	
		  }
		  System.out.print("Enter year: ");
		  sc = new Scanner(System.in);
		  
		  if (sc.hasNextInt()) // To make sure users insert integer
		  {
		     year = sc.nextInt();	  
		  }
		  else
		  {
		     sc.next();  
		  }
	   }while(b<1 || b>31 || month<1 || month>12 || year>2100 || year<1900); // To make sure the numbers inserted are in the right range.
		
		int a = (month+10)%12; // This is because March = 1, April = 2, ... ( January is not 1, February is not 2,...) 
		
		if (a==0) // This is specifically for February. Since February takes the value of 12 in this case, a which is (month+10)%12 will be zero. Therefore, if this is the case, a has to take a value of 12 instead of zero.
		{
			a=12;
		}
	
		int c = year%100; // In calculation, c has to be the last two digits of year.
		if(a>=11) // This is because say January of 2000 will actually be January of 1999 for this particular way of calculation. In other words, the new year does not begin until February (not December in the normal case).
		{ 
			c--;
		}
		int d = year/100; // d denotes century which is the first two digits of the year.
		
		
		
		int w = (13 * a - 1 ) / 5 ;

		int x = c / 4; 

		int y = d / 4; 

		int z = w + x + y + b + c - 2 * d; 

		int r = z % 7;
	    r = (r + 7) % 7;
	    
	    if(year< 2010 || (year==2010 && month<7) || (year==2010 && month==7 &&b<=7)) // To make sure the tense is correct.
	    {
	    	switch (r)
	    
	       {
		    case 0 : System.out.println("That day was on Sunday.");break;
		    case 1 : System.out.println("That day was on Monday.");break;
		    case 2 : System.out.println("That day was on Tuesday.");break;
		    case 3 : System.out.println("That day was on Wednesday.");break;
		    case 4 : System.out.println("That day was on Thursday.");break;
		    case 5 : System.out.println("That day was on Friday.");break;
		    case 6 : System.out.println("That day was on Saturday.");break;
	       }
	    }
	    else // After July 7th, 2010, the tense will be future tense.
	    {
	    	switch (r)
		    
		    {
			 case 0 : System.out.println("That day will be on Sunday.");break;
			 case 1 : System.out.println("That day will be on Monday.");break;
			 case 2 : System.out.println("That day will be on Tuesday.");break;
			 case 3 : System.out.println("That day will be on Wednesday.");break;
			 case 4 : System.out.println("That day will be on Thursday.");break;
			 case 5 : System.out.println("That day will be on Friday.");break;
			 case 6 : System.out.println("That day will be on Saturday.");break;
		    }
	    	
	    }
	}
}