
public class Ifelseif {
	
	public static void main(String[] args) {
        int marks = 85; // Input marks

        // Classify the grade based on the marks
        if (marks >= 90) {
            System.out.println("Grade: A"); // If marks are 90 or above
        } else if (marks >= 80) {
            System.out.println("Grade: B"); // If marks are between 80 and 89
        } else if (marks >= 70) {
            System.out.println("Grade: C"); // If marks are between 70 and 79
        } else if (marks >= 60) {
            System.out.println("Grade: D"); // If marks are between 60 and 69
        } else {
            System.out.println("Grade: F"); // If marks are below 60
        }
    }

}
