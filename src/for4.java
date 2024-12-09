
public class for4 {
	
	 public static void main(String[] args) {
	        String input = "Eclipse"; // Input string
	        String reversed = ""; // Initialize an empty string to store the reversed string

	        // Loop to iterate through the string in reverse order
	        for (int i = input.length() - 1; i >= 0; i--) {
	            reversed += input.charAt(i); // Append each character to the reversed string
	        }

	        System.out.println("Original string: " + input);
	        System.out.println("Reversed string: " + reversed);
	    }

}
