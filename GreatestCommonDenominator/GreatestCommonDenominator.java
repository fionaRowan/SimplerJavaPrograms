package org.GreatestCommonDenominator;

import java.util.Scanner;
public class GreatestCommonDenominator {
   public static void main (String[] args){
	   
	   String answer = "Y";
	   
	   do {
		   Scanner input = new Scanner(System.in);    
		 //get input
		   System.out.println("Let's find the GCD between two positive integers.");
		   System.out.println("What is the larger of the two numbers?");
		   int i = input.nextInt();
		   System.out.println("What's the smaller of the two?");
		   int j = input.nextInt();
		   int r = i%j;
		   
		   //calculate
	       while ( r > 0){
		       i = j;
		       j = r;
		       r = i%j;
	       }
	       
	       
	       //present result
	       System.out.println("The greatest common factor is " + j + "!!"); 
	       
	       //another calculation 
	       Scanner in = new Scanner(System.in);
	       System.out.println("Would you like to make another calculation? Y/N");
		   answer = in.next();
	   }while (answer == "Y");
	 if (answer == "N"){
		 System.out.println("Thank you!");
	 }
	   
       
   }
}
