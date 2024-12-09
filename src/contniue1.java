
public class contniue1 {
	
    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) { // Check if the number is even
                continue; // Skip the rest of the loop for even numbers
            }
            System.out.println("Odd number: " + i); // Print only odd numbers
        }
    }


}
