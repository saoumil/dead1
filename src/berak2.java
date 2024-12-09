
public class berak2 {
	
	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7}; // Input array
        int target = 4; // Target element to search

        // Loop through the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) { // Break when the target is found
                System.out.println("Target " + target + " found at index " + i);
                break;
            }
        }
    }


}
