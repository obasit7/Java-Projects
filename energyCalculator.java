/* Name : Osama Bin Basit
   Description:This program asks the user the mass of water, initial and final
               temperatures and calculates the amount of energy and displays it
               to the user */

import java.util.Scanner;
import java.text.DecimalFormat;

public class energyCalculator {
   public static void main (String [] args) {
   
   Scanner scnr = new Scanner(System.in);
   DecimalFormat df = new DecimalFormat("0.####E0");
   
  //DECLARING
   double massOfWater, initialTemp, finalTemp, tempChange, energyQ;
   final double cP = 4179.6;
   
   
  //PROMPTING
   System.out.println("Enter the amount of water (in kgs)");
   massOfWater = scnr.nextDouble();
   
   System.out.println("Enter the initial temperature of the water (in degree Celcius)");
   initialTemp = scnr.nextDouble();
   
   System.out.println("Enter the final temperature of the water (in degree Celcius)");
   finalTemp = scnr.nextDouble();
   
  //CALCULATIONS
   tempChange = finalTemp - initialTemp;
   
   energyQ = massOfWater * tempChange * cP;
   
   
  //OUTPUTS
   System.out.println("The energy is: \t" + df.format(energyQ) + " J");
      
   } //end main
} //end class
