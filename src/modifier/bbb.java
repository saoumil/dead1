package modifier;

public class bbb extends aaa {
    // Constructor for the subclass
    public bbb(int num, String msg) {
        super(num, msg); // Call the superclass constructor
    }

    public void displayDetails() {
       
        System.out.println("Number (via method): " + getNumber());
        System.out.println("Message (via method): " + getMessage());
    }

    public static void main(String[] args) {
        
        bbb obj = new bbb(42, "Hello, Private World");

        obj.displayDetails();
    }
}
