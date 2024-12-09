
public class while5 {
	public static void main(String[] args) {
        int number = 5; // Input number
        int factorial = 1; // Initialize factorial to 1

        // Loop while the number is greater than 0
        while (number > 0) {
            factorial *= number; // Multiply factorial by the current number
            number--; // Decrement the number
        }

        System.out.println("The factorial is: " + factorial); // Print the factorial
    }
}
