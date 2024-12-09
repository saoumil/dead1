
public class ret2 {
	public static int findLargest(int num1, int num2) {
        if (num1 > num2) {
            return num1; // Return num1 if it is larger
        } else {
            return num2; // Return num2 otherwise
        }
    }

    public static void main(String[] args) {
        int largest = findLargest(15, 20); // Call the method and store the result
        System.out.println("The largest number is: " + largest); // Print the result
    }

}
