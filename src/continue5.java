
public class continue5 {
	public static void main(String[] args) {
        int number = 3; // Base number for multiples

        // Loop through numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            if (i % number != 0) { // Skip non-multiples of the number
                continue; // Move to the next iteration
            }
            System.out.println(i + " is a multiple of " + number); // Print multiples
        }
    }
}
