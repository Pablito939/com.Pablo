package com.Pablo;
/**
 * @author Pablo Espinoza 
 * @date 02/12/2024 
 * Code to determine if a number is fizz, buzz, or fizzbuzz
 */

import java.util.Scanner;


public class FizzBuzz {
	
	public static void main(String[] args) {
	
		int numba = 0;
		
		// ask user to input a number
		System.out.println("Input a number larger than 1");
		System.out.println("> ");
		Scanner userInput = new Scanner(System.in);
		numba = userInput.nextInt();
		
		// turns numbers into fizz, buzz, or fizzbuzz
		for(int i = 1; i < numba + 1; i++) {
			if (i % 15 == 0) {
				System.out.println("FizzBuzz");
			}else if(i % 5 == 0) {
					System.out.println("Buzz");
			}else if(i % 3 == 0) {
				System.out.println("Fizz"); 
			}else { 
				System.out.println(i);
			}
			
		
	}
	
	}
}
