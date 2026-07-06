import java.util.HashMap;
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> users = new HashMap<>();
        users.put("admin", "1234");
        users.put("Bhoomi", "pass123");
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        // Validation
        if (users.containsKey(username) && users.get(username).equals(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Login Failed! Invalid Username or Password.");
        }

        sc.close();
    }
}