/*Mad Libs Activity
  Name: Osama Bin Basit
  U#: 39050886
  Description: This program is built for children. It asks for 4 random words and places them 
               in a nursery rhyme to teach basic english grammar and how well a word fits in the rhyme.
*/

import java.util.Scanner;

public class madLibs{

   public static void main (String [] args) {
   
  //declaring
   String word1, word2, word3, word4;
   
   Scanner scan = new Scanner (System.in);
   
  //prompt
   System.out.println ("Please enter 4 words. (separated by a space)");
   word1 = scan.next();
   word2 = scan.next();
   word3 = scan.next();
   word4 = scan.next();
   
   
  //output
   System.out.println ("Mary had a little " + word1 + ",");
   System.out.println ("Its "+ word2 + " was bright as snow,");
   System.out.println ("And everywhere that Mary " + word3 + ",");
   System.out.println ("The " + word4 + " was sure to go.");
   
   }
}
