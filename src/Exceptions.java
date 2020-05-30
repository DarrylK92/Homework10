import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**Performs both Exceptions homework assignments 12.2 and 12.3
 * 
 * @author Darryl Karney
 * @version 07232018
 */

public class Exceptions {

	public static void main(String[] args) {
		//12.2
		InputException();
		
		//12.3
		ArrayException();
	}
	
	/**
	 * For assignment 12.2. User enters two valid variables and the program displays the sum
	 */
	public static void InputException() {
		//Declare variables
				Scanner scanner = new Scanner(System.in);
				boolean isValid = false;
				int first = 0, second = 0;
				
				//Get input for first number
				while(!isValid) {
					System.out.println("Enter first integer: ");
					try {
						first = scanner.nextInt();
						isValid = true;
					} catch (InputMismatchException e) {
						System.out.println("Invalid entry, try again");
						scanner.nextLine();
					}
				}
				
				isValid = false;
				
				//Get input for second number
				while(!isValid) {
					System.out.println("Enter second integer: ");
					try {
						second = scanner.nextInt();
						isValid = true;
					} catch (InputMismatchException e) {
						System.out.println("Invalid entry, try again");
						scanner.nextLine();
					}
				}
				
				//Output results
				System.out.println(first + " + " + second + " = " + (first + second));
	}

	/**
	 * For assignment 12.3. User enters an index of the large array to view and then the program displays the value in the index the user entered
	 */
	public static void ArrayException() {
		//Declare variables
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int randArray[] = new int[100];
		
		//Fill array with random numbers
		for(int i = 0; i < 100; i++) {
			randArray[i] = random.nextInt(100);
		}
		
		boolean isValid = false;
		int index = 0;
		
		//Get user input
		while(!isValid) {
			System.out.println("Enter an index to display: ");
			index = scanner.nextInt();
			try {
				//Display output
				System.out.println("The value at index " + index + " is " + randArray[index]);
				isValid = true;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of Bounds");
			}
		}
	}
}
