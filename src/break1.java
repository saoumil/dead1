
public class break1 {
	
	public static void main(String[] args) {
        // Loop through numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            if (i == 5) { // Break the loop when i equals 5
                System.out.println("Breaking the loop as i = " + i);
                break;
            }
            System.out.println("i = " + i); // Print the current value of i
        }
    }

}
