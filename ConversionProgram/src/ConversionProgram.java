/*
 * Nikolay Merenko
 * September 25th, 2025
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

                // Converts Decimal to Binary
                if (decimal == 0) {
                    System.out.println("The binary representation of your inputted number is: 0");
                } else {
                    String binary = "";
                    int temp = decimal;
                    while (temp > 0) {
                        int remainder = temp % 2;      
                        binary = remainder + binary;    
                        temp = temp / 2;                 
                    }
                    System.out.println("The binary representation of your inputted number is: " + binary);
                }

            } else if (selection == 2) {
                // Converts Binary to Decimal
                System.out.print("You have chosen to convert from binary to decimal. Enter a binary number: ");
                String binary = in.next();

                // Makes sure the input is valid
                boolean isValid = true;
                for (int i = 0; i < binary.length(); i++) {
                    char c = binary.charAt(i);
                    if (c != '0' && c != '1') {
                        isValid = false;
                        break;
                    }
                }

                if (!isValid) {
                    System.out.println("Invalid input. Please enter only 0s and 1s.");
                    continue; // restarts the loop instead of converting
                }

                int decimal = 0;
                int power = 1; 

                for (int i = binary.length() - 1; i >= 0; i--) {
                    char c = binary.charAt(i);
                    if (c == '1') {
                        decimal += power;
                    }
                    power *= 2; 
                }

                System.out.println("The decimal representation is: " + decimal);

            } else {
                System.out.println("That doesn't work. Please choose either 1 or 2."); //checks for errors
                return;
            }

              String again;
            while (true) { // while loop until user enters yes or no
                System.out.print("Would you like to convert another number? Answer yes or no: ");
                again = in.next();

                if (again.equalsIgnoreCase("yes") || again.equalsIgnoreCase("no")) {
                    break; // validates input
                } else {
                    System.out.println("Your response is invalid. Please enter either 'yes' or 'no'.");
                }
            }

            if (!again.equalsIgnoreCase("yes")) { //if the user doesn't want to continue, the program ends
                System.out.println("Thank you for using the Conversion Program!");
                break; 
            }

        } //while loop ends

    } //method ends

 } //class ends

//program ends
