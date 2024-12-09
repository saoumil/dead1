
public class break4 {
	public static void main(String[] args) {
        // Loop through numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            System.out.println("Processing number: " + i);
            if (i * i > 50) { // Break the loop if the square of i exceeds 50
                System.out.println("Square of " + i + " is greater than 50. Breaking the loop.");
                break;
            }
        }
    }

}
