
public class ifelseif5 {
	
	public static void main(String[] args) {
        double bmi = 27.5; // Input BMI value

        // Determine BMI category
        if (bmi < 18.5) {
            System.out.println("Underweight"); // BMI less than 18.5
        } else if (bmi < 24.9) {
            System.out.println("Normal weight"); // BMI between 18.5 and 24.9
        } else if (bmi < 29.9) {
            System.out.println("Overweight"); // BMI between 25 and 29.9
        } else {
            System.out.println("Obese"); // BMI 30 or above
        }
    }

}
