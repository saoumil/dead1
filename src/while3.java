
public class while3 {
	public static void main(String[] args) {
        int number = 17; // Number to check
        int i = 2; // Start checking from 2
        boolean isPrime = true; // Assume the number is prime

        // Check divisors up to the square root of the number
        while (i <= number / 2) {
            if (number % i == 0) {
                isPrime = false; // Number is not prime
                break; // Exit the loop
            }
            i++; // Increment i
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }

}
