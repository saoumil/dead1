package Practicee;



	import modifier.aaa; // Import the aaa class from the modifier package

	public class other {
	    public static void main(String[] args) {
	        
	        aaa obj = new aaa(42, "Hello, Private World");
	        // Access private members through public methods
	        System.out.println("Number (via method): " + obj.getNumber());
	        System.out.println("Message (via method): " + obj.getMessage());
	    }
	}
}
