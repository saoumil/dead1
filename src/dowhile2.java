
public class dowhile2 {
	public static void main(String[] args) {
        int n = 10; // Upper limit
        int sum = 0; // Initialize sum
        int i = 1; // Start with the first number

        // Loop to calculate the sum of natural numbers
        do {
            sum += i; // Add the current number to the sum
            i++; // Increment i
        } while (i <= n); // Loop until i exceeds n

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}
