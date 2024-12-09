
public class If5 {

	 public static void main(String[] args) {
	        int marks = 72; // Declare and initialize the marks variable

	        // Check the range of marks and assign a grade
	        if (marks >= 90) {
	            System.out.println("Grade: A"); // Print Grade A if marks are 90 or above
	        } else if (marks >= 80) {
	            System.out.println("Grade: B"); // Print Grade B if marks are between 80 and 89
	        } else if (marks >= 70) {
	            System.out.println("Grade: C"); // Print Grade C if marks are between 70 and 79
	        } else if (marks >= 60) {
	            System.out.println("Grade: D"); // Print Grade D if marks are between 60 and 69
	        } else {
	            System.out.println("Grade: F"); // Print Grade F if marks are below 60
	        }
	    }
	
}
