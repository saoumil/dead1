package modify;

public class pri {
	public class PrivateAccessExample {
	    // Private member variable
	    int age =89;
	    String name= "dead" ;

	    // Constructor to initialize the private member
	    public PrivateAccessExample(String initialMessage) {
	        this.message = initialMessage;
	    }

	    // Public method to get the value of the private member
	    public String getMessage() {
	        return message;
	    }

	    // Public method to set a new value to the private member
	    public void setMessage(String newMessage) {
	        this.message = newMessage;
	    }

	    // Main method to demonstrate access to private members
	    public static void main(String[] args) {
	        // Create an object of the class
	        PrivateAccessExample example = new PrivateAccessExample("Hello, World!");

	        // Access private member using public methods
	        System.out.println("Initial Message: " + example.getMessage());

	        // Modify the private member using a public method
	        example.setMessage("Hello, Eclipse!");

	        // Access the modified private member
	        System.out.println("Updated Message: " + example.getMessage());
	    }
	}

}
