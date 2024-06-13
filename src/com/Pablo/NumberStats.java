/**
 * @author Pablo Espinoza
 * @date 26/04/2024
 * Code to determine some fun facts about a users inputted numba
 */
package com.Pablo;

import java.util.Scanner;

public class NumberStats {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a number");
        int userNumber = input.nextInt();
        MyNumber number = new MyNumber(userNumber);
        System.out.println(number.isEven());
        System.out.println(number.isOdd());
        System.out.println(number.isPrime());
        
        // To ask the user for a number, use `input.nextInt()`
    }
}

class MyNumber {
    private int val;

    public MyNumber(int val) {
    	this.val = val;
    }
    // A method is created using the following syntax:
    
     public int getVal() {   
    	 return val;
    	
      }
      
       public boolean isEven() {
    	   if (val % 2 != 0) {
    		   return false;
    	   }
		return true;
       }	   
    	   
       
       public boolean isOdd() {
    	   if (val % 2 != 0) {
    		   return true;
    	   }
		return false;
       }
       
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