
public class continue3 {
    public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i == 5 || i == 7) { // Skip numbers 5 and 7
                continue; // Move to the next iteration
            }
            System.out.println("Processing number: " + i); // Print other numbers
        }
    }

}
