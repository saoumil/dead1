
public class ifelseif3 {
	
	public static void main(String[] args) {
        int age = 25; // Input age

        // Classify the age group
        if (age < 13) {
            System.out.println("You are a child."); // Age below 13
        } else if (age <= 19) {
            System.out.println("You are a teenager."); // Age between 13 and 19
        } else if (age <= 59) {
            System.out.println("You are an adult."); // Age between 20 and 59
        } else {
            System.out.println("You are a senior citizen."); // Age 60 or above
        }
    }

}
