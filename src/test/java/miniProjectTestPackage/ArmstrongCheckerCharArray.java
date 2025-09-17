package miniProjectTestPackage;
import java.util.Scanner;
import java.lang.Math;

public class ArmstrongCheckerCharArray {

	public static void main(String[] args) {
		
		// Create a Scanner object to read user input
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a number to check: ");
		
		try {
			// Read the user input as a String
			String inputString = scanner.nextLine();
			
			// Get the number of digits from the string length
			int numberOfDigits = inputString.length();
			
			// Convert the string to a character array to iterate through each digit
			char[] digits = inputString.toCharArray();
			
			// Convert the original string to an integer for the final comparison
			int originalNumber = Integer.parseInt(inputString);
			
			double sum = 0; // Use double for Math.pow() calculation
			
			// Loop through each character in the array
			for (char digitChar : digits) {
				// Convert the character back to a numeric value (an integer)
				int digit = Character.getNumericValue(digitChar);
				
				// Add the power of the digit to the sum
				sum += Math.pow(digit, numberOfDigits);
			}
			
			// Compare the original number with the sum of powers
			if (sum == originalNumber) {
				System.out.println("It's an Armstrong number.");
			} else {
				System.out.println("It's not an Armstrong number.");
			}
			
		} catch (NumberFormatException e) {
			System.out.println("Invalid input. Please enter a valid number.");
		} finally {
			// Close the scanner
			scanner.close();
		}
	}
}
