
public class dowhile4 {
	
	public static void main(String[] args) {
        int number = 5; // Input number
        int factorial = 1; // Initialize factorial

        // Loop to calculate the factorial
        do {
            factorial *= number; // Multiply factorial by the current number
            number--; // Decrement the number
        } while (number > 0); // Continue until the number is 0

        System.out.println("The factorial is: " + factorial);
    }

}
