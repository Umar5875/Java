import java.util.Scanner;

// ==========================================================================
// PART A: THE EXCEPTION ARCHITECTURE
// ==========================================================================

// 1. Custom checked exception must extend Exception
class AuthException extends Exception {

    // 2. Constructor
    public AuthException(String message) {

        // 3. Pass message to parent class
        super(message);
    }
}

// ==========================================================================
// PART B: THE VALIDATION ENGINE
// ==========================================================================

public class AuthenticationDemo {
    public static void main(String[] args) {

        // 4. Initialize Scanner
        Scanner sc = new Scanner(System.in);

        // 5. Hardcoded credentials
        final String VALID_USER = "karuna";
        final String VALID_PASS = "karuna123";

        // 6. Read username
        System.out.print("Enter Username: ");
        String inputUser = sc.nextLine();

        // 7. Read password
        System.out.print("Enter Password: ");
        String inputPass = sc.nextLine();

        System.out.println("\nVerifying credentials...");

        try {

            // 8. Compare using .equals()
            if (!(inputUser.equals(VALID_USER) && inputPass.equals(VALID_PASS))) {

                // 9. Throw custom exception
                throw new AuthException("Invalid username or password!");

            } else {

                // 10. Success message
                System.out.println("Access Granted. Welcome to the system.");
            }

        } catch (AuthException e) {  // 11. Catch exception

            // 12. Print error message
            System.out.println("SECURITY ALERT: " + e.getMessage());
        }

        // 13. Close scanner
        sc.close();
    }
}
