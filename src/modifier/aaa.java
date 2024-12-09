package modifier;


	public class aaa {
	    // Private member variables
	    private int number;
	    private String message;

	    // Constructor to initialize private members
	    public aaa(int num, String msg) {
	        this.number = num;
	        this.message = msg;
	    }

	    // Method within the same class to manipulate and access private members
	    public void showDetails() {
	        // Accessing and modifying private members
	        System.out.println("Number: " + number);
	        System.out.println("Message: " + message);
	        
	        // Modifying private members within the class
	        number += 10;
	        message += " - Updated!";
	        
	        System.out.println("Updated Number: " + number);
	        System.out.println("Updated Message: " + message);
	    }

	    // Main method to test the functionality
	    public static void main(String[] args) {
	        // Creating an instance of the class
	        aaa obj = new aaa(42, "Hello, Private World");

	        // Calling a method that accesses and manipulates private members
	        obj.showDetails();
	    }
	}

