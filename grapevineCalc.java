/*Grapevine Calculator Activity
  Name: Osama Bin Basit
  Description: This program takes in values from the user like row length, space 
               a post takes and spaces between vines and makes calculations to inform
               a vineyard owner of how many grapevines will fit in that row.
*/

import java.util.Scanner;

public class grapevineCalc {

   public static void main (String [] args) {
   
  //declaring
   double V, R, E, S;
   
   
   Scanner scan = new Scanner (System.in);
   
  //Prompt and storing
   System.out.println("What is the length of the row (in feet)?");
   R = scan.nextDouble(); //length of row
   
   System.out.println("What is the amount of space used by an end-post assembly (in feet)?");
   E = scan.nextDouble(); //space used by post
   
   System.out.println("What is the amount of space between the vines (in feet)?");
   S = scan.nextDouble(); // space between vines
   
  //Formula
   V = (R - (2*E))/S ;

  //Final Output
   System.out.println ("The number of grapevines that will fit in the row are:\t" + V);
   
   }

}
