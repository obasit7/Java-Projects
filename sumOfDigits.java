/* Name : Osama Bin Basit
   Description:This program asks the user for a number between 0 and 1000 
               and adds all the digits in the number and outputs the sum. */

import java.util.Scanner;

public class sumOfDigits {
   public static void main (String [] args) {
   
   //Declaring
   int num, digit1, digit2, digit3, sum; 
   
   Scanner scnr = new Scanner (System.in);
   
   //Prompt
   System.out.println ("Enter an integer between 0 and 1000 (both exclusive)");
   num = scnr.nextInt();
   
   //Extracting and Removing Digits
   digit1= num %10; //extracts last digit
   num /= 10;
   
   digit2= num %10; //extracts second last digit
   num /= 10;
   
   digit3= num %10; //extracts third last digit
   num /= 10;
   
   //Calculation
   sum = digit1 + digit2 + digit3;
   //Outout
   System.out.println("The sum of digits in the number is: \t" + sum);
     
   } // end main
} // end class
