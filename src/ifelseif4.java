
public class ifelseif4 {
	
	public static void main(String[] args) {
        String signal = "Yellow"; // Input signal color

        // Determine action based on the signal color
        if (signal.equalsIgnoreCase("Red")) {
            System.out.println("Stop!"); // Action for red light
        } else if (signal.equalsIgnoreCase("Yellow")) {
            System.out.println("Get ready!"); // Action for yellow light
        } else if (signal.equalsIgnoreCase("Green")) {
            System.out.println("Go!"); // Action for green light
        } else {
            System.out.println("Invalid signal color."); // Action for invalid color
        }
    }

}
