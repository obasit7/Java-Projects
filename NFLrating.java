/* Name : Osama Bin Basit
   Description:This program takes input from the user and calculates
               the NFL passer rating for a NFL Athlete. The rating
               is then displayed along with the player name. */
   
   
import java.util.Scanner;   
import java.text.DecimalFormat;
   
public class NFLrating {
   public static void main (String [] args) {
   
   //Declaring
   double passerRating; //final output
   double a , b, c, d, sum; // a=completion percentage b=yards per attempt
                            // c=touchdowns per attempt d=interceptions per attempt
   
   String name;
   double COMP, ATT, YDS, TD, INT;
   /* where:
   ATT = number of passing attempts
   COMP = number of completions
   YDS = number of passing yards
   TD = number of touchdown passes
   INT = number of interceptions
   */
   
   Scanner scnr = new Scanner (System.in);
   DecimalFormat df = new DecimalFormat("000.##");
   
   //PROMPTs
   System.out.println ("What is the name of the quarterback?");
   name = scnr.next();
   
   System.out.println ("What are the number of passes attempted?");
   ATT = scnr.nextInt();
   
   System.out.println ("What are the number of passing yards?");
   YDS = scnr.nextInt();
   
   System.out.println ("What are the number of completions?");
   COMP = scnr.nextInt();
   
   System.out.println ("What are the number of touchdown passes?");
   TD = scnr.nextInt();
   
   System.out.println ("What are the number of interceptions?");
   INT = scnr.nextInt();
   
   //Calculations
   a = (((COMP/ATT) - 0.3) *5);
   b = (((YDS/ATT)-3) * 0.25);
   c = ((TD/ATT) * 20);
   d = (2.375 - ((INT/ATT)*25));
   passerRating = (((a+b+c+d)/6)*100);
   
  //OUTPUT
   
   System.out.println ("The NFL passer rating for " + name + " is:  \t" + df.format(passerRating));
   
   }//end main
}//end class
