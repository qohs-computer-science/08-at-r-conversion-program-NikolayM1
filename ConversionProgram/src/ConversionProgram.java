/*
 * Nikolay Merenko
 * September 19th, 2025
 * Period 6
 * A program the converts a user-inputted number from decimal or binary, or vice versa, depending on the user's preference.
 */

import java.util.Scanner; //scanner is imported

public class ConversionProgram { //class begins

	public static void main(String[] args) { //method begins
		Scanner in = new Scanner(System.in);  //scanner 

		while (true) { //while loop makes sure you can continue later
		System.out.println("Welcome to the Conversion Program! Please select an option:");
		System.out.println("1. Convert Decimal to Binary");
		System.out.println("2. Convert Binary to Decimal");
		int selection = in.nextInt();

		if (selection == 1) {
			System.out.print("You have chosen to convert from decimal to binary. Enter a decimal number: ");
			int decimal = in.nextInt();
			String binary = Integer.toBinaryString(decimal); // this method converts decimal to binary (found w/ independent research)
			System.out.println("The binary representation of your inputted number is: " + binary);
		} else if (selection == 2) {
			System.out.print("You have chosen to convert from binary to decimal. Enter a binary number: ");
			String binary = in.next();
			int decimal = Integer.parseInt(binary, 2); //automatically converts binary to decimal
			System.out.println("The decimal representation is: " + decimal);
		} else {
			System.out.println("That doesn't work. Please choose either 1 or 2."); //checks for errors
			return;
		}
		
 		System.out.print("Would you like to convert another number? Answer yes or no.");
            String again = in.next();

            if (!again.equalsIgnoreCase("yes")) { //if the user doesn't want to continue, the program ends (had to search for a way to do this)
                System.out.println("Thank you for using the Conversion Program!");
                break; 
            }
            
        } //while loop ends

		} //methods ends

	} //class ends

	//program ends