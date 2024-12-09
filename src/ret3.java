
public class ret3 {
	public static boolean isEven(int number) {
        return number % 2 == 0; // Return true if the number is even, false otherwise
    }

    public static void main(String[] args) {
        boolean result = isEven(8); // Call the method and store the result
        if (result) {
            System.out.println("The number is even."); // If true, print even
        } else {
            System.out.println("The number is odd."); // If false, print odd
        }
    }
}
