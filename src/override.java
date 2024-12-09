
public class override {
	// Static method in the parent class
    public static void display() {
        System.out.println("Static method in Parent class.");
    }
}

class Child extends Parent {
    // Static method in the child class (hides the parent method)
    public static void display() {
        System.out.println("Static method in Child class.");
    }
}

public class StaticMethodOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Parent child = new Child();

        // Call the static method
        parent.display(); // Calls the Parent's static method
        child.display(); // Calls the Parent's static method (because reference type determines static method call)
        
        // Explicit call to static method in Child class
        Child.display(); // Calls the Child's static method
    }
}
