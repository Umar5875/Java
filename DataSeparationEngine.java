import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class DataSeparationEngine {
    public static void main(String[] args) {

        // 1. Establish File Pointers
        File inputFile = new File("numbers.txt");
        File evenFile = new File("even.txt");
        File oddFile = new File("odd.txt");

        System.out.println("-> Initiating Tokenization Sequence...");

        // Multi-Stream Try-With-Resources
        // We open three streams simultaneously. The JVM guarantees all
        // will be closed safely, regardless of partial failures.
        try (
            Scanner sc = new Scanner(inputFile);
            PrintWriter evenWriter = new PrintWriter(evenFile);
            PrintWriter oddWriter = new PrintWriter(oddFile)
        ) {

            int count = 0;

            // The Token Extraction Loop
            // hasNextInt() prevents NoSuchElementException
            while (sc.hasNextInt()) {

                // Extract and parse the token
                int number = sc.nextInt();
                count++;

                // Parity Evaluation & Routing
                if (number % 2 == 0) {
                    evenWriter.println(number); // Routes to even.txt
                } else {
                    oddWriter.println(number); // Routes to odd.txt
                }
            }

            System.out.println("Result: Successfully processed " + count + " integers.");
            System.out.println("Output routed to 'even.txt' and 'odd.txt'.");

        } catch (FileNotFoundException e) {
            // Scanner cannot create input files
            System.err.println("FATAL I/O ERROR: 'numbers.txt' not found.");
            System.err.println("Fix: Create 'numbers.txt' in the project directory and add integers.");
        }
    }
}
