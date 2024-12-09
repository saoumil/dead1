
public class for5 {
	public static void main(String[] args) {
        int number = 5; // Input number
        int factorial = 1; // Initialize factorial to 1

        // Loop to calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        System.out.println("The factorial of " + number + " is: " + factorial); // Print the factorial
    }
}
