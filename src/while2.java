
public class while2 {
	public static void main(String[] args) {
        int sum = 0; // Initialize sum to 0
        int i = 1; // Start with the first number

        // Loop while i is less than or equal to 10
        while (i <= 10) {
            sum += i; // Add the current number to the sum
            i++; // Increment i
        }

        System.out.println("The sum of the first 10 natural numbers is: " + sum); // Print the sum
    }
}
