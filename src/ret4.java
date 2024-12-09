
public class ret4 {
	public static int calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Return 1 as the factorial of 0 or 1 is 1
        }
        return n * calculateFactorial(n - 1); // Recursively calculate factorial
    }

    public static void main(String[] args) {
        int result = calculateFactorial(5); // Call the method and store the result
        System.out.println("The factorial of 5 is: " + result); // Print the result
    }

}
