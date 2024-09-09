/*
@Author: Surina Arora 
@Date: Oct 20th 2023 
@Description: 
This program asks the user to input the total purchase amount,
then calculates and displays the discounted prices based on the sales on the amount of the item.
*/

// Import java util Scanner 
import java.util.Scanner; 
class discountCalculator{
   public static void main (String [] args){
   
// Variable Declaration and Initialization 
   Scanner uI = new Scanner (System.in);
   double purchasingAmount = 0; 
   String percentSign = "%"; 
   
// Program Output and Execution 
   
   System.out.print("Please enter the total amount for today's purchase: ");
   purchasingAmount = uI.nextDouble(); 
   
   // Line 26 declares a variable for calculating a 10% discount on the purchasing amount 
   
   double discountTenPercent = (purchasingAmount - (purchasingAmount * 0.1));
   
   if (purchasingAmount > 100){ // $101+ for the discount to be applied on
   System.out.printf("With a discount of %s10, your price without taxes added will be $%.2f\n", "%", discountTenPercent);
   
   } // Closes off everything in if statement #1
   
   // Line 33 declares a variable for calculating a 5% discount on the purchasing amount
   
   double discountFivePercent = (purchasingAmount - (purchasingAmount * 0.05));

   if (purchasingAmount > 50) if (purchasingAmount < 100){ // Allows the range between $51-$99 for the %5 discount to be applied on
      System.out.printf("With a discount of %s5, your price without taxes added will be $%.2f", "%",discountFivePercent );
             
   } // Closes off everything in if statement #2
   
   if (purchasingAmount < 50){ // Range of $1-$49 for no discount to be applied on 
      System.out.printf("Since your purchase does not reach the rules for a %s5 or %s10 discount, there is no discount added.", "%", "%");
      
   } // Closes off everything in if statement #3 
   } // End main method
} // End whole program