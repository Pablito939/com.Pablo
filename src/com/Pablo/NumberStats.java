package com.Pablo;
/**
 * @author Pablo Espinoza
 * @date 26/04/2024
 * Code to determine some fun facts about a users inputed number
 */

import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int userNumber = input.nextInt();
        MyNumber number = new MyNumber(userNumber);
        System.out.println("Is even: " + number.isEven());
        System.out.println("Is odd: " +number.isOdd());
        System.out.println("Is prime: " + number.isPrime());
        
        // To ask the user for a number, use `input.nextInt()`
    }
}

class MyNumber {
    private int val;

    public MyNumber(int val) {
    	this.val = val;
    }
    // A method is created using the following syntax:
    
    // gets and returns a value
     public int getVal() {   
    	 return val;
    	
      }
      
     // checks if the value is even
       public boolean isEven() {
    	   if (val % 2 != 0) {
    		   return false;
    	   }
		return true;
       }	   
    	   
       
       // checks is the value is odd
       public boolean isOdd() {
    	   if (val % 2 != 0) {
    		   return true;
    	   }
		return false;
       }
       
       // checks if the number is prime
       public boolean isPrime() {
    	   if (val <= 1) {
    		   return false;
    		   
    	   }
    	   for (int i = 2; i< val; i++) {
    		   if (val % i == 0) {
    			   return false;
    		   }
    	   }
    	   return true;
       }
       
     
}