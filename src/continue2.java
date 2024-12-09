
public class continue2 {
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array of numbers

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 3) { // Skip the number 3
                continue; // Skip the rest of the loop when the condition is met
            }
            System.out.println("Number: " + numbers[i]); // Print numbers except 3
        }
    }

}
