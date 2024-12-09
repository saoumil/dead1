
public class break3 {
	
	public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 8, 9, 10}; // Array with numbers

        // Loop through the array
        for (int number : numbers) {
            if (number % 2 == 0) { // Check if the number is even
                System.out.println("First even number is: " + number);
                break; // Exit the loop after finding the first even number
            }
        }
    }

}
