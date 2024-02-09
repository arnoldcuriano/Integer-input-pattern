import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pattern: ");
        int numRows = scanner.nextInt();

        System.out.println("Generating pattern...");

        for (int i = 1; i <= numRows; i++) {
            // Print i number of stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }

        scanner.close();
    }
}
