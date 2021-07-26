/*Stock Transaction Activity
  Name: Osama Bin Basit
  U#: 39050886
  Description: This program has set values of variables such as for how many stocks Jack purchaces and sells 
               and then outputs computed information such as his profit made and how much he had paid for commission
               to his broker.
*/

import java.text.DecimalFormat; //to control output decimals
import java.util.Scanner;

public class stockTransaction {

   public static void main (String[] args) {
  
   //declaring
   double stocksPurchased, stocksSold;
   double buyingPerShare, buyingTotal, commission1, sellingPerShare, sellingTotal, commission2, profitMade;
   
      DecimalFormat df = new DecimalFormat ("0.##");
      Scanner scan = new Scanner(System.in);
   
      System.out.println("How many stocks were purchased?:");
      stocksPurchased = scan.nextInt(); //buying info
      System.out.println("What was the price per stock?:");
      buyingPerShare = scan.nextDouble(); //buying info
      
      System.out.println("How many stocks were sold?:");
      stocksSold = scan.nextInt(); //buying info
      System.out.println("What was the price per stock?:");
      sellingPerShare = scan.nextDouble(); //buying info
       
      
    //Calculations
      buyingTotal = stocksPurchased * buyingPerShare;
      commission1 = (1.5/100) * buyingTotal;
      
      sellingTotal = stocksSold * sellingPerShare;
      commission2 = (1.5/100) * sellingTotal;

      profitMade = sellingTotal - buyingTotal - commission1 - commission2;    
      
    //Outputs
      System.out.println ("You paid $" + buyingTotal + " for the stocks.\n");
      System.out.println ("You paid $" + df.format(commission1) + " in commission to your broker when you bought the stocks.\n");
      
      System.out.println ("You sold the stocks for $" + sellingTotal);
      System.out.println ("");
      System.out.println ("You paid $" + df.format(commission2) + " in commission to your broker when you sold the stocks.\n");
      
      System.out.println ("You made $" + df.format(profitMade) + " in profits after selling your stock and paying the two"
                        + " commissions to your broker.");
      
   
   
   }
 }