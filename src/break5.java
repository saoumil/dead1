
public class break5 {
    public static void main(String[] args) {
        String[] usernames = {"user1", "user2", "admin", "guest"}; // Array of usernames

        // Loop through usernames to find "admin"
        for (String username : usernames) {
            if (username.equals("admin")) { // Check for "admin"
                System.out.println("Admin found! Breaking the loop.");
                break; // Exit the loop after finding "admin"
            }
            System.out.println("Checked user: " + username);
        }
    }

}
