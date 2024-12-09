
public class continue4 {
	
	public static void main(String[] args) {
        String word = "Eclipse"; // Input string

        // Loop through each character in the string
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i); // Get the current character
            if (!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                continue; // Skip non-vowel characters
            }
            System.out.println("Vowel: " + ch); // Print vowels
        }
    }

}
