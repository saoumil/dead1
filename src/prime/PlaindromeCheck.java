package prime;

	import java.util.Scanner;

	public class PlaindromeCheck {

	    // Method to check if a word is a palindrome
	    public static boolean isPalindrome(String word) {
	        int left = 0;
	        int right = word.length() - 1;

	        while (left < right) {
	            if (word.charAt(left) != word.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Input from the user
	        System.out.print("Enter a word to check if it is a palindrome: ");
	        String word = scanner.nextLine();

	        // Check if the word is a palindrome and print the result
	        if (isPalindrome(word)) {
	            System.out.println(word + " is a palindrome.");
	        } else {
	            System.out.println(word + " is not a palindrome.");
	        }

	        scanner.close();
	    }
	}

