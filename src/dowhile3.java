
public class dowhile3 {
	 public static void main(String[] args) {
	        int number = 12345; // Number to reverse
	        int reverse = 0; // Initialize reverse

	        // Loop to reverse the number
	        do {
	            int digit = number % 10; // Extract the last digit
	            reverse = reverse * 10 + digit; // Append the digit to the reversed number
	            number /= 10; // Remove the last digit
	        } while (number != 0); // Continue until the number becomes 0

	        System.out.println("The reversed number is: " + reverse);
	    }

}
