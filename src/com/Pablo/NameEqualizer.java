package com.Pablo;
/**
 * @author Pablo Espinoza
 * @date 02/13/2024
 * equalizing names in Java
 */



import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;


public class NameEqualizer {


	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
			    // The input stream here is a "FileReader" that reads input.txt
			    // Notice the "throws". We'll talk about this later, but it's needed
			    // for this code to work
			    Scanner input = new Scanner(new FileReader("input.txt"));


			    // While the input object has more tokens, do the thing
			    while (input.hasNext()) {
			      String line = input.nextLine();
			      // Process line here
				  
			      
			      String processedLine = line;
				  String names = line.toLowerCase();
				  String nospace = names.replaceAll(" ", "");
				  
			      // Output the line either to the console or maybe to another file (more on that later)
			      System.out.println(nospace);
			    }
			  }
			}

