
public class main {
	 // Standard main method
    public static void main(String[] args) {
        System.out.println("Standard main method called.");

        // Calling overloaded main methods
        main(42); // Calls the main method with an int parameter
        main("Hello, Java!"); // Calls the main method with a String parameter
    }

    // Overloaded main method with an int parameter
    public static void main(int number) {
        System.out.println("Overloaded main method with int parameter called. Number: " + number);
    }

    // Overloaded main method with a String parameter
    public static void main(String message) {
        System.out.println("Overloaded main method with String parameter called. Message: " + message);
    }
}
