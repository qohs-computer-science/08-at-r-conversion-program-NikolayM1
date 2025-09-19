/*
 * Nikolay Merenko
 * September 18th, 2025
 * Period 6
 * A program the converts a user-inputted number from decimal or binary, or vice versa, depending on the user's preference.
 */

//REMINDER: ADD COMMENTS
import java.util.Scanner; 

public class ConversionProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to the Conversion Program! Please select an option:");
		System.out.println("1. Convert Decimal to Binary");
		System.out.println("2. Convert Binary to Decimal");
		int selection = in.nextInt();

		if (selection == 1) {
			System.out.print("You have chosen to convert from decimal to binary. Enter a decimal number: ");
			int decimal = in.nextInt();
			String binary = Integer.toBinaryString(decimal);
			System.out.println("The binary representation of your inputted number is: " + binary);
		} else if (selection == 2) {
			System.out.print("You have chosen to convert from binary to decimal. Enter a binary number: ");
			String binary = in.next();
			int decimal = Integer.parseInt(binary, 2);
			System.out.println("The decimal representation is: " + decimal);
		} else {
			System.out.println("That doesn't work. Please choose either 1 or 2.");
			return;
		}

		System.out.println("Would you like to continue? Please enter Y for yes or N for no.");
		String continuation = in.nextLine();

		if (continuation == "Y") {
			main(null);
		} else if (continuation == "N") {
			System.out.println("Thank you for using the Conversion Program!");
		} else {					
			System.out.println("Your input is invalid. Please enter either Y or N.");	//fix this - it should not pop up after the user inputs the binary or decimal number
			return;
		}

	}
}