
public class overload {
	// Static method with no parameters
    public static void display() {
        System.out.println("Static method with no parameters.");
    }

    // Static method with one int parameter
    public static void display(int number) {
        System.out.println("Static method with one int parameter: " + number);
    }

    // Static method with two parameters
    public static void display(String message, int number) {
        System.out.println("Static method with a String and an int: " + message + ", " + number);
    }

    public static void main(String[] args) {
        // Call overloaded static methods
        display();
        display(42);
        display("Overloading", 99);
    }
}
