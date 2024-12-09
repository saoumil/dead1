package modify;


	import modifier.aaa; // Import the superclass

	public class bbb extends aaa {
	    // Constructor for the subclass
	    public bbb(int num, String msg) {
	        super(num, msg); // Call the superclass constructor
	    }

	    public void displayDetails() {
	        // Attempt to access private members directly
	        // Access private members through public methods of the superclass
	        System.out.println("Number (via method): " + getNumber());
	        System.out.println("Message (via method): " + getMessage());
	    }

	    public static void main(String[] args) {
	        // Create an instance of the subclass
	        bbb obj = new bbb(42, "Hello, Private World");

	        // Attempt to display details
	        obj.displayDetails();
	    }
	}


