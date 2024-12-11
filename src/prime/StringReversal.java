package prime;

import java.util.Scanner;

public class StringReversal {

    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Reverse the string and print the result
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }
}