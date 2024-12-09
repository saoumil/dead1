
public class while4 {
	 public static void main(String[] args) {
	        int number = 12345; // Number to reverse
	        int reverse = 0; // Initialize reverse to 0

	        // Loop until the number becomes 0
	        while (number != 0) {
	            int digit = number % 10; // Get the last digit
	            reverse = reverse * 10 + digit; // Add the digit to the reversed number
	            number /= 10; // Remove the last digit
	        }

	        System.out.println("The reversed number is: " + reverse); // Print the reversed number
	    }
}
